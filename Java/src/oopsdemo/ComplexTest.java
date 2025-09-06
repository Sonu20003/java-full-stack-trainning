package oopsdemo;

import java.util.Scanner;

/**
* Author   : Sonu.2
* Date     : Sep 3, 2025
* Time     : 12:01:00 AM
* Project  : CoreJava
*/

public class ComplexTest {
	public static void main(String[] args) {
		
		Complex cmp1 = new Complex(23.7, 45.1);
		Complex cmp2 = new Complex(25.4, 43.1);

		
		cmp1.add(cmp2);
		System.out.println("The addition of two complex numbers is: ");
		cmp1.display();
		
		cmp2.add(new Complex(0.2, 3.1));
		System.out.println("The addition of two complex numbers is: ");
		cmp2.display();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a real and a imaginary part of complex number: ");
		double r = sc.nextDouble();
		double i = sc.nextDouble();
		
		cmp2.add(new Complex(r, i));
		cmp2.display();
		
		sc.close();
	}
}
