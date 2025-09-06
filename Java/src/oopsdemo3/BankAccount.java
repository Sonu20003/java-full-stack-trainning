package oopsdemo3;
/**
 * Author   : Sonu.2
 * Date     : Sep 5, 2025
 * Time     : 11:45:38 AM
 * Project  : CoreJava
 * Finance Domain Example in Java to demonstrate Static Variables and Static Methods.
 * We’ll build a Bank class where:
 * Static variable → interestRate (same for all accounts).
 * Static method → setInterestRate() and calculateSimpleInterest() (shared utility for all).
 * Instance variables → accountHolder, balance (different for each account).
 */

public class BankAccount {

	private String accountHolder;
	private double balance;

	// Static variable (common for all accounts)
	private static double interestRate = 5.0; // default 5%

	public BankAccount(String accountHolder, double balance) {
		super();
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public void showAccountDetails() {
		System.out.println("Account Holder: " + accountHolder);
		System.out.println("Balance: " + balance);
		System.out.println("Interest Rate: " + interestRate + "%");
	}

	// Static method to set interest rate
	public static void setInterestRate(double newRate) {
		interestRate = newRate;
		System.out.println("✅ Interest rate updated to " + interestRate + "% for all accounts.");
	}

	// Static method to calculate Simple Interest
	public static double calculateSimpleInterest(double principal, int years) {
		return (principal * interestRate * years) / 100;
	}
}
