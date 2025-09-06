package controlflow;

import java.util.Scanner;

/**
* Author   : Sonu.2
* Date     : Aug 31, 2025
* Time     : 11:21:48 PM
* Project  : CoreJava
* Program to Check whether entered alphabet using Ternary Operator
*/

public class ternaryDemo2 {
	public static void main(String[] args) {
		
		char ch;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		ch = sc.next().charAt(0);
		
		String output = (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ?
				ch+ " is an Alphabet" : ch+" is not an Alphabet";
		System.out.println(output);
		sc.close();
	}
}
