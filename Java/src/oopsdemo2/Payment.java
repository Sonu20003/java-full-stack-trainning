package oopsdemo2;
/**
* Author   : Sonu.2
* Date     : Sep 4, 2025
* Time     : 12:03:12 AM
* Project  : CoreJava
*/

public class Payment {
	
	private String paymentId;
    private double amount;
    private String mode;  // e.g., Credit Card, UPI, NetBanking
    
	Payment(String paymentId, double amount, String mode) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
		this.mode = mode;
	}
	
	public void displayPayment() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Amount: " + amount);
        System.out.println("Mode: " + mode);
    }
}
