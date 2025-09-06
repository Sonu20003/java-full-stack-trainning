package onlineshopping;
/**
 * Author   : Sonu.2
 * Date     : Sep 6, 2025
 * Time     : 12:00:31 PM
 * Project  : CoreJava
 */

//Concrete Product - Laptop
class Laptop extends Product {
	public Laptop(String productName, double price) {
		super(productName, price);
	}

	@Override
	public void showProductDetails() {
		System.out.println("Laptop: " + productName + " | Price: ₹" + price);
	}
}