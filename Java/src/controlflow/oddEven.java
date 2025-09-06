package controlflow;

import java.util.Scanner;

/**
* Author   : Sonu.2
* Date     : Aug 31, 2025
* Time     : 9:34:49 PM
* Project  : CoreJava
* Progrsm to check weather the given number is odd or even
*/

public class oddEven {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) System.out.println("Given number: "+num+" is Even.");
		else System.out.println("Given number: "+num+" is Odd.");
		
		sc.close();
	}
}
