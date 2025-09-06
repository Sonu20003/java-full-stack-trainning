package oopsdemo;
/**
* Author   : Sonu.2
* Date     : Sep 2, 2025
* Time     : 10:03:14 PM
* Project  : CoreJava
* Java Program to implement instance class & main class in a Single file
*/

class Lamp {
	boolean isOn;
	
	private String name;
	
	Lamp(String name) {
		this.name = name;
	}
	
	void display() {
		System.out.println("Brand: "+name);
	}
 	
	// method to turn on the light
	void turnOn() {
		isOn = true;
		System.out.println("Light On?: "+ isOn);
	}
	
	// method to turn off the light
	void turnOff() {
		isOn = false;
		System.out.println("Light On ?: "+isOn);
	}
}

public class LampTest {

	public static void main(String[] args) {
	
		Lamp lamp = new Lamp("LED");
		lamp.display();
		
		System.out.println("Current state of Lamp: (is turned on ?): "+lamp.isOn);
		System.out.println("######## Turn on method is invoked ########");
		lamp.turnOn();
		System.out.println("######## Turn off method is invoked ########");
		lamp.turnOff();

	}

}
