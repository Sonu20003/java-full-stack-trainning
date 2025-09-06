package oopsdemo2;
/**
 * Author   : Sonu.2
 * Date     : Sep 3, 2025
 * Time     : 9:20:24 PM
 * Project  : CoreJava
 */

public class Account {
	// Multilevel Inheritance
	// base class for SavingsBank


	int accNo;
	String name;

	


	public Account(int accNo, String name) {
		super();
		this.accNo = accNo;
		this.name = name;
	}




	void display()
	{
		System.out.println("************ Account Details ************");
		System.out.println("Account Number :"+accNo);
		System.out.println("Customer Name :"+name);
	}
}
