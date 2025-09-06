package controlflow;

import java.util.Scanner;

/**
 * Author   : Sonu.2
 * Date     : Sep 1, 2025
 * Time     : 2:30:50 AM
 * Project  : CoreJava
 * Program to find Factorial of a Number
 */

public class factorial {
	public static void main(String[] args) {
		long num, fact=1;
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter a Number : ");
		num=scanner.nextInt();
		scanner.close();

		for (int i = 1; i <=num; i++) {
			fact*=i;
		}
		System.out.println("The Factorial of "+num+" is: "+fact);
	}
}
