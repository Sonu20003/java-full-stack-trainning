package oopsdemo3;
/**
* Author   : Sonu.2
* Date     : Sep 4, 2025
* Time     : 3:39:53 AM
* Project  : CoreJava
*/

//Using constructors to assign/initialize values for properties
//Hence not using setter() methods

public class Account {
	
	private String name;
    protected double balance;

	public Account(String name,double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public String getName() {
		return this.name;
	}
	public double getBalance () {
		return this.balance;
	}
	// final methods cannot be overridden
	final void deposit(double amt){
        balance+=amt;
        System.out.println("Depositing : "+amt);
    }
    public void withdraw(double amt){
        balance-=amt;
        System.out.println("Withdrawing :"+amt);
    }
    
	
}
