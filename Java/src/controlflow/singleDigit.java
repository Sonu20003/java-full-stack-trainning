package controlflow;

import java.util.Scanner;

/**
* Author   : Sonu.2
* Date     : Aug 31, 2025
* Time     : 9:39:53 PM
* Project  : CoreJava
* program to check the given number is single or not
*/

public class singleDigit {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		// int len = (int) (Math.log10(num)+1);
		
		if(num > -10 && num < 10) {
			System.out.println("Entered number: "+num+" is single digit number.");
		} else System.out.println("Entered number: "+num+" is not single digit number.");
		
		sc.close();
	}
}
