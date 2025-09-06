package oopsdemo2;
/**
* Author   : Sonu.2
* Date     : Sep 3, 2025
* Time     : 9:25:06 PM
* Project  : CoreJava
*/

public class AccountDetails extends SavingsBank {
	
	int withdrawl,deposit,finalBalance;

	public AccountDetails(int accNo, String name, int min_bal, int balance, int d, int w) {
		super(accNo, name, min_bal, balance);
		this.withdrawl = w;
		this.deposit = d;
	}
	
	 void display() {
	            super.display(); // invokes savings bank display()method
	            System.out.println ("Deposit: "+deposit);
	            System.out.println ("Withdrawals: "+withdrawl);
	            finalBalance=(balance+deposit)-withdrawl;
	            System.out.println("Final Balance:" + finalBalance);
	    }
	
}
