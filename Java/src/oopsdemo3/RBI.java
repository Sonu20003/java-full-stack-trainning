package oopsdemo3;
/**
* Author   : Sonu.2
* Date     : Sep 5, 2025
* Time     : 12:04:44 PM
* Project  : CoreJava
*/

public final class RBI {
	// Final variable (constant)
    public static final double MIN_HOME_LOAN_RATE = 6.5;  // cannot change

    // Final method (standard rule - cannot be overridden by banks)
    public final void showRBIGuidelines() {
        System.out.println("📌 RBI Guideline: Minimum Home Loan Interest Rate = " + MIN_HOME_LOAN_RATE + "%");
    }
}
