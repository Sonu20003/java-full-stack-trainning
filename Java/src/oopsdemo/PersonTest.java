package oopsdemo;

import java.util.Scanner;

/**
* Author   : Sonu.2
* Date     : Sep 3, 2025
* Time     : 1:52:29 AM
* Project  : CoreJava
*/

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.input();
		p1.print();
		
		System.out.println("-------------------------------------");
		
		Person p2 = new Person("Navin", 45);
		p2.print();
		
		System.out.println("-------------------------------------");
		
		Person p3 = new Person("Navin", "Chennai", 45);
		p3.print();
		
		System.out.println("Enter your Name, Cosntituency & Age: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String c = sc.next();
		int a = sc.nextInt();
		
		Person p4 = new Person(name, c, a);
		p4.print();
		sc.close();
		
	}
}
