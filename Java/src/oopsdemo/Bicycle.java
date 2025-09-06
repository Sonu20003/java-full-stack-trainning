package oopsdemo;
/**
* Author   : Sonu.2
* Date     : Sep 2, 2025
* Time     : 10:15:39 PM
* Project  : CoreJava
*/


//define attributes, methods & Objects in a Single Main class
public class Bicycle {
	int gear;
	
	void applyBrake() {
		System.out.println("Applying Brakes.......");
	}
	public void startCycle() {
		gear = gear+1;
		System.out.println("Cycle is on gear number: "+gear);
	}
	
	public static void main(String[] args) {
		Bicycle b = new Bicycle();
		
		b.startCycle();
		b.startCycle();
		b.startCycle();
		b.applyBrake();
	}
}
