package oopsdemo4;
/**
 * Author   : Sonu.2
 * Date     : Sep 5, 2025
 * Time     : 12:49:01 PM
 * Project  : CoreJava
 */

public abstract class Trainee {
	private String name;
	private String address;
	private int number;

	public Trainee(String name, String address, int number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}

	//abstract method declaration - must be overridden in the derived class

	void show() {
		System.out.println("Display Marks for :" +this.name+ " "+this.address);
	}
	
	abstract double calculateMarks();

	@Override
	public String toString() {
		return "Trainee [name=" + name + ", address=" + address + ", number=" + number + "]";
	}
}
