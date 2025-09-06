package oopsdemo3;
/**
* Author   : Sonu.2
* Date     : Sep 4, 2025
* Time     : 4:04:21 AM
* Project  : CoreJava
* Method overriding example
*/

public class Trading {
	protected double tradeAmount;

	public Trading(double tradeAmount) {
		super();
		this.tradeAmount = tradeAmount;
	}
	
	// Method to be overridden
    public void tradeDetails() {
        System.out.println("General Trading: Amount invested = " + tradeAmount);
    }

    // Profit/Loss calculation (default)
    public double calculateProfitLoss() {
        return 0; // No calculation for general trading
    }
}
