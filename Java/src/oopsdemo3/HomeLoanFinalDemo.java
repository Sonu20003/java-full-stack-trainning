package oopsdemo3;
/**
 * Author   : Sonu.2
 * Date     : Sep 5, 2025
 * Time     : 12:10:14 PM
 * Project  : CoreJava
 */


public class HomeLoanFinalDemo {
	public static void main(String[] args) {

		// Using RBI rules
		RBI rbi = new RBI();
		rbi.showRBIGuidelines();

		// Creating customer home loans
		HomeLoan l1 = new HomeLoan("Alice", 3000000, 10000); 
		HomeLoan l2 = new HomeLoan("Bob", 5000000, 15000); 

		l1.showLoanDetails();
		System.out.println("-------------------------");
		l2.showLoanDetails();

		// ❌ ERROR if you try to modify final variable
		// RBI.MIN_HOME_LOAN_RATE = 7.0;  // Not allowed
		// loan1.PROCESSING_FEE = 20000;  // Not allowed
	}

}
