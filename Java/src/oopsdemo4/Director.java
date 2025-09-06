package oopsdemo4;
/**
* Author   : Sonu.2
* Date     : Sep 5, 2025
* Time     : 2:38:39 PM
* Project  : CoreJava
*/

public class Director extends Employee{
	
	double transportAllowance;

	public Director(String name, double basic, String address, double transportAllowance) {
		super(name, basic, address);
		this.transportAllowance = transportAllowance;
	}

	@Override
	double totalPay() {
		double totalAmount = 0;
	       double houseRentAllowance = (basic * 0.20);
	       double dearnessAllowance = (basic * 0.5);
	       double medicalAllowance = 4500;
	       double entertainmentAllowance = 5000;
	       totalAmount = basic + houseRentAllowance + dearnessAllowance
	             + medicalAllowance + entertainmentAllowance + transportAllowance;
	       return totalAmount;
	}
	
	void show() {
        super.show();
        System.out.println("Transport Allowance: \t" + transportAllowance);
    }

}
