package oopsdemo3;
/**
* Author   : Sonu.2
* Date     : Sep 4, 2025
* Time     : 2:06:09 AM
* Project  : CoreJava
*/

class Addition {
	public void add() {
		System.out.println("Method Overloading Demo");
	}
	public void add(int a, int b) {
		System.out.println("The sum of 2 nos is: "+(a+b));
	}
	public void add(double a, double b) {
		System.out.println("The sum of 2 nos is: "+(a+b));
	}
	public void add(int a, int b, int c) {
		System.out.println("The sum of 3 nos is: "+(a+b+c));
	}
	public void add(String a, String b) {
		System.out.println("The sum of 2 Strings is: "+(a+b));
	}
}

public class OverLoadDemo {

	public static void main(String[] args) {
		Addition adder = new Addition();
		
		adder.add();
		adder.add(10, 20);
		adder.add(10f, 20f); // float --> none available --> type promotion --> look for doubles
		adder.add(20, 30, 50);
		adder.add("Sonu ", "Sharma");

	}

}
