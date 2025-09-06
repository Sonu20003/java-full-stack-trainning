package oopsdemo3;
/**
* Author   : Sonu.2
* Date     : Sep 5, 2025
* Time     : 11:54:45 AM
* Project  : CoreJava
*/

/*
Final Variable - Variable’s content cannot be modified
Final Method - A final method cannot be overridden. 
Final Class - Class cannot extend a Final class
*/

final class Hello {
	final void display() {
		System.out.println("This is a final Method.");
	}
}

class World { //extends Hello { // cannot extend a final class
	final void display() { // if extends the parent class cannot override the final method
		System.out.println("This is a final Method.");
	}
}

public class FinalDemo {
	public static void main(String[] args) {
		final int age = 20;
		final float PI = 3.1415f;
		
		System.out.println("Age: "+age +" PI: "+ PI);
		// age = 30; compilation error
	}
}
