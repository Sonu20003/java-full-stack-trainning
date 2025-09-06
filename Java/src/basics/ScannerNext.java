package basics;

import java.util.Scanner;

/**
 * Author   : Sonu.2
 * Date     : Aug 29, 2025
 * Time     : 11:28:03 PM
 * Project  : CoreJava
 */

public class ScannerNext {
	public static void main(String[] args) {
		char ch;
		String fullName,firstName;
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter your Initials :");
		ch=scanner.next().charAt(0); // Single Character Input
		System.out.println("Enter Your First Name : ");
		firstName=scanner.next(); // Single Word Input

		scanner.nextLine(); // to Pause & take input for nextLine()
		System.out.println("Enter Your Full Name :");
		fullName=scanner.nextLine(); // Multiple Words Input

		scanner.close();

		System.out.println("Your Initials : "+ch);
		System.out.println("First Name    : "+firstName);
		System.out.println("Full Name     : "+fullName);
	}
}
