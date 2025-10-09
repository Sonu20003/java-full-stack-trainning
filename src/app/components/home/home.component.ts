import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { ControlStripComponent } from "../control-strip/control-strip.component";
import { NgForOf } from "@angular/common";

interface Product {
  id: number;
  name: string;
  price: number;
  description?: string;
  imageUrl: string;
}

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  imports: [
    ControlStripComponent,
    NgForOf
  ],
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  products: Product[] = [];
  allProducts: Product[] = [];
  searchText: string = '';
  activeSort: string = '';
  isUserLoggedIn: boolean = false;

  constructor(
      private http: HttpClient,
      private router: Router,
      private route: ActivatedRoute
  ) {}

  ngOnInit(): void {
    this.isUserLoggedIn = !!localStorage.getItem('userId');

    this.route.queryParams.subscribe(params => {
      this.searchText = (params['search'] || '').toLowerCase();
      this.activeSort = params['sort'] || '';
      this.applyFilters();
    });

    this.fetchProducts();
  }

  fetchProducts() {
    this.http.get<Product[]>('http://localhost:8088/product_db/api/products').subscribe({
      next: data => {
        this.allProducts = [...data];
        this.applyFilters();
        console.log('Products fetched:', this.allProducts);
      },
      error: err => {
        this.loadPlaceholderProducts();
      }
    });
  }

  // placeholder product list
  loadPlaceholderProducts() {
    this.allProducts = [
      { id: 1, name: 'Smartphone', price: 14999, description: 'Latest 5G phone', imageUrl: '/images/placeholder1.jpg' },
      { id: 2, name: 'Wireless Headphones', price: 2999, description: 'Noise Cancelling', imageUrl: '/images/placeholder2.jpg' },
      { id: 3, name: 'Laptop', price: 57999, description: 'Powerful performance', imageUrl: '/images/placeholder3.jpg' },
      { id: 4, name: 'Smartwatch', price: 4999, description: 'Health tracking features', imageUrl: '/images/placeholder4.jpg' },
      { id: 5, name: 'Camera', price: 21999, description: 'DSLR-level clarity', imageUrl: '/images/placeholder5.jpg' },
      { id: 6, name: 'Bluetooth Speaker', price: 1999, description: 'Deep bass & loud sound', imageUrl: '/images/placeholder6.jpg' },
    ];
    this.applyFilters();
  }

  // sorting and searching
  handleSort(sortType: string) {
    this.activeSort = sortType;
    this.applyFilters();
    this.updateUrl();
  }

  handleSearch(searchText: string) {
    this.searchText = searchText.toLowerCase();
    this.applyFilters();
    this.updateUrl();
  }

  applyFilters() {
    let filtered = [...this.allProducts];

    if (this.searchText)
      filtered = filtered.filter(p => p.name.toLowerCase().includes(this.searchText));

    if (this.activeSort === 'price')
      filtered.sort((a, b) => a.price - b.price);

    if (this.activeSort === 'alphabet')
      filtered.sort((a, b) => a.name.localeCompare(b.name));

    this.products = filtered;
  }

  updateUrl() {
    this.router.navigate([], {
      relativeTo: this.route,
      queryParams: {
        search: this.searchText || null,
        sort: this.activeSort || null
      },
      queryParamsHandling: 'merge'
    });
  }

  // only Cart requires login
  goToCart() {
    if (!this.isUserLoggedIn) {
      alert('Please login first!');
      this.router.navigate(['/register']);
      return;
    }

    this.router.navigate(['/cart'], {
      queryParams: {
        search: this.searchText || null,
        sort: this.activeSort || null
      }
    });
  }

  // Add to cart also requires login
  addToCart(product: Product) {
    if (!this.isUserLoggedIn) {
      alert('Please login first!');
      this.router.navigate(['/register']);
      return;
    }

    const userId = localStorage.getItem('userId');
    this.http.post('YOUR_POST_API_URL', { userId, productId: product.id }).subscribe({
      next: res => alert('Product added to cart!'),
      error: err => alert('Failed to add to cart!')
    });
  }
}
