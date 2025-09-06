package oopsdemo2;
/**
 * Author   : Sonu.2
 * Date     : Sep 3, 2025
 * Time     : 10:17:30 PM
 * Project  : CoreJava
 */

public class Customer {
	//Hierarchical Inheritance Demo

	private String name;
	private String email;

	
	public Customer(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}




	public void display(){
		System.out.println("********** Customer Details ************");
		System.out.println("Customer Name    : "+name);
		System.out.println("Email            : "+email);
	}
}
