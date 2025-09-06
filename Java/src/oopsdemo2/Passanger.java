package oopsdemo2;
/**
 * Author   : Sonu.2
 * Date     : Sep 3, 2025
 * Time     : 4:10:28 AM
 * Project  : CoreJava
 */

public class Passanger {
	private String name;
	private int age;
	private String passportNumber;

	public Passanger(String name, int age, String passportNumber) {
		super();
		this.name = name;
		this.age = age;
		this.passportNumber = passportNumber;
	}


	public void displayPassengerDetails() {
		System.out.println("----- Passenger Details -----");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Passport Number: " + passportNumber);
	}
}
