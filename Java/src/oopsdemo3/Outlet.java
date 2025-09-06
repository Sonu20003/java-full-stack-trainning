package oopsdemo3;
/**
 * Author   : Sonu.2
 * Date     : Sep 4, 2025
 * Time     : 2:19:55 AM
 * Project  : CoreJava
 * Method OverLoading demo for Product Management
 */

public class Outlet {
	private String[] productNames;
	private double[] productPrices;
	private int[] productQuantities;
	private String[] productCategories;

	public Outlet() {
		this.productNames = new String[100];
		this.productPrices = new double[100];
		this.productQuantities = new int[100];
		this.productCategories = new String[100];
	}

	//Overload addProduct() Method
	// Method to add a product with only name and price
	public void addProduct(String name, double price) {
		if (!isProductExists(name)) {
			System.out.println("Added product: " + name + ", Price: $" + price);
			updateInventory(name, price, 1);
		} else {
			System.out.println("Product already exists: " + name);
			updateInventory(name, price, 1);
		}
	}

	// Method overloading to add a product with name, price, and quantity
	public void addProduct(String name, double price, int quantity) {
		if (!isProductExists(name)) {
			System.out.println("Added product: " + name + ", Price: $" + price + ", Quantity: " + quantity);
			updateInventory(name, price, quantity);
		} else {
			System.out.println("Product already exists: " + name);
			updateInventory(name, price, quantity);
		}
	}

	// Method overloading to add a product with name, price, quantity, and category
	public void addProduct(String name, double price, int quantity, String category) {
		if (!isProductExists(name)) {
			System.out.println("Added product: " + name + ", Price: $" + price + ", Quantity: " + quantity + ", Category: " + category);
			updateInventory(name, price, quantity);
			categorizeProduct(name, category);
		} else {
			System.out.println("Product already exists: " + name);
			updateInventory(name, price, quantity);
			categorizeProduct(name, category);
		}
	}

	private boolean isProductExists(String name) {
		for (int i = 0; i < productNames.length; i++) {
			if (productNames[i] != null && productNames[i].equals(name)) {
				return true;
			}
		}
		return false;
	}

	private void updateInventory(String name, double price, int quantity) {
		for (int i = 0; i < productNames.length; i++) {
			if (productNames[i] == null) {
				productNames[i] = name;
				productPrices[i] = price;
				productQuantities[i] += quantity;
				break;
			} else if (productNames[i].equals(name)) {
				productPrices[i] = price;
				productQuantities[i] += quantity;
				break;
			}
		}
		// For demonstration, assume the inventory is updated in a database
		System.out.println("Inventory updated for product: " + name + ", Price: $" + price + ", Quantity: " + quantity);
	}

	private void categorizeProduct(String name, String category) {
		for (int i = 0; i < productNames.length; i++) {
			if (productNames[i] != null && productNames[i].equals(name)) {
				productCategories[i] = category;
				break;
			}
		}
		// For demonstration, assume the product category is updated in a database
		System.out.println("Product categorized: " + name + " under " + category);
	}
}
