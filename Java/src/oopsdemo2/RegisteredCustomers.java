package oopsdemo2;
/**
* Author   : Sonu.2
* Date     : Sep 3, 2025
* Time     : 10:18:49 PM
* Project  : CoreJava
*/

public class RegisteredCustomers extends Customer {
	
	private  int customerId;
    private String[] cart;
    private int cartSize;

	public RegisteredCustomers(String name, String email, int customerId) {
		super(name, email);
		this.customerId = customerId;
		this.cart = new String[20]; // Reg cust can add 20 items in cart
		this.cartSize = 0;
	}
	
	public void displayCustomerInfo() {
        System.out.println("Customer ID: " + customerId);
        super.display();
    }

    public void addToCart(String item) {
        if (cartSize < cart.length) {
            cart[cartSize] = item;
            cartSize++;
            System.out.println(item + " added to cart.");
        } else {
            System.out.println("Cart is full. Cannot add more items.");
        }
    }

    public void displayCart() {
        System.out.println("Items in Cart:");
        for (int i = 0; i < cartSize; i++) {
            System.out.println(cart[i]);
        }
    }
}
