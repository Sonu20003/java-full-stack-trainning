package oopsdemo;

import java.util.Scanner;

/**
* Author   : Sonu.2
* Date     : Sep 2, 2025
* Time     : 3:41:32 AM
* Project  : CoreJava
*/

public class Student {
	// properties / state / attributes
	// private variables can only be accessed inside the class
	private int rollNumber;
	private String name, course;
	private float m1, m2, m3, total;
	
	Scanner sc = new Scanner(System.in);
	
	// instance method / behaviour / functions
	// JVM will invoke default constructor for initialization of Object
	
	public void input() {
		
		System.out.println("Enter Roll no, Name, Course: ");
		rollNumber = sc.nextInt();
		name = sc.next();
		course = sc.next();
		
		System.out.println("Enter marks of three subjects: ");
		m1 = sc.nextFloat();
		m2 = sc.nextFloat();
		m3 = sc.nextFloat();
		// sc.close();
	}
	
	public float calculate() {
		total = m1+m2+m3;
		return total;
	}
	
	public void display() {
		System.out.println("************ Student Details ************");
		System.out.println("Roll number           : "+rollNumber);
		System.out.println("Name                  : "+name);
		System.out.println("Course                : "+course);
		System.out.println("Total Marks           : "+total);
		System.out.println("*****************************************");
	}

}
