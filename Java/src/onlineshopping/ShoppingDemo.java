package onlineshopping;
/**
 * Author   : Sonu.2
 * Date     : Sep 6, 2025
 * Time     : 12:03:27 PM
 * Project  : CoreJava
 */

/*
Shopping System with:

Abstract Class (Product) → base for all products.

Concrete Products (Laptop, Mobile) extending Product.

Interfaces (OnlinePayment, Discount) → for payment & discount behaviors.

ShoppingCart → manages multiple products, applies discounts, and makes payments.
 */
// Main Class
public class ShoppingDemo {
	public static void main(String[] args) {
		// Customer's Shopping Cart
		ShoppingCart cart = new ShoppingCart("Rohit");

		// Adding Products
		cart.addProduct(new Laptop("Dell XPS 15", 85000));
		cart.addProduct(new Mobile("iPhone 15", 120000));

		// Show cart
		cart.showCartDetails();

		// Apply discount
		double finalAmount = cart.applyDiscount(cart.getTotalAmount());

		// Make payment
		cart.payOnline(finalAmount);
		
		System.out.println("\n*********************************************\n");
		
		ShoppingCart cart2 = new ShoppingCart("Anita");
		cart2.addProduct(new Laptop("Samsung Galaxy S23", 70000));
		cart2.showCartDetails();
	
		// Make payment
		cart2.payOnline(cart2.applyDiscount(cart.getTotalAmount()));
		

		
	}
}

