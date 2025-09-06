package oopsdemo3;
/**
 * Author   : Sonu.2
 * Date     : Sep 5, 2025
 * Time     : 9:38:27 AM
 * Project  : CoreJava
 */

public class Product {
	private String name;
	private double price;
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	
	void display() {
        System.out.println("********** Product Details ***************");
        System.out.println("Name : "+name);
        System.out.println("Price: "+price);
    }
}

class Book extends Product{

	private String author;
	public Book(String name, double price, String author) {
		super(name, price);
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	@Override
	void display() {
		super.display();
		System.out.println("Author: " + author);
	}
}

class Laptop extends Product {
	
	private String manufacturer;
	
	public Laptop(String name, double price, String manufacturer) {
		super(name, price);
		this.manufacturer = manufacturer;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	@Override
	void display() {
		super.display();
		System.out.println("Manufacturer: "+manufacturer);
	}
}