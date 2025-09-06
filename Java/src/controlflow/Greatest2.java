package controlflow;

import java.util.Scanner;

/**
 * Author   : Sonu.2
 * Date     : Aug 31, 2025
 * Time     : 9:07:12 PM
 * Project  : CoreJava
 * Description: program to find greatest of two numbers.
 */

public class Greatest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a > b) System.out.println(a + " is Greatest");
		else if(a < b) System.out.println(b + " is Greatest");
		else System.out.println("Both are the same");

		sc.close();

	}

}
