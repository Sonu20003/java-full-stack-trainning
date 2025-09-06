package onlineshopping;
/**
 * Author   : Sonu.2
 * Date     : Sep 6, 2025
 * Time     : 11:59:50 AM
 * Project  : CoreJava
 */

//Abstract Class - Product
abstract class Product {
	protected String productName;
	protected double price;

	public Product(String productName, double price) {
		this.productName = productName;
		this.price = price;
	}

	public abstract void showProductDetails();
}