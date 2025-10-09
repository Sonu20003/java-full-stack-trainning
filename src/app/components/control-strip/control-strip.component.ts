import { Component, EventEmitter, Output, Input } from '@angular/core';

@Component({
  selector: 'app-control-strip',
  templateUrl: './control-strip.component.html',
  styleUrls: ['./control-strip.component.css']
})
export class ControlStripComponent {
  @Input() isUserLoggedIn: boolean = false;

  @Output() sortChanged = new EventEmitter<string>();
  @Output() searchTriggered = new EventEmitter<string>();
  @Output() cartClicked = new EventEmitter<void>();

  activeSort: string = '';

  // ✅ Sort now works always (no login check)
  setSort(type: string) {
    this.activeSort = type;
    this.sortChanged.emit(type);
  }

  // ✅ Search also works always
  triggerSearch(searchInput: HTMLInputElement) {
    this.searchTriggered.emit(searchInput.value);
  }

  // ❗ Cart button still requires login
  goToCart() {
    if (!this.isUserLoggedIn) {
      alert('Please login first!');
      window.location.href = 'http://localhost:4200/register';
      return;
    }
    this.cartClicked.emit();
  }
}
