package onlineshopping;
/**
 * Author   : Sonu.2
 * Date     : Sep 6, 2025
 * Time     : 12:00:55 PM
 * Project  : CoreJava
 */

//Concrete Product - Mobile
class Mobile extends Product {
	public Mobile(String productName, double price) {
		super(productName, price);
	}

	@Override
	public void showProductDetails() {
		System.out.println("Mobile: " + productName + " | Price: ₹" + price);
	}
}