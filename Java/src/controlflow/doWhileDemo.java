package controlflow;

import java.util.Scanner;

/**
* Author   : Sonu.2
* Date     : Sep 1, 2025
* Time     : 1:49:42 AM
* Project  : CoreJava
* Program to enter a Positive Number & display it
*/

public class doWhileDemo {
	public static void main(String[] args) {
		  int number;
		        Scanner scanner=new Scanner(System.in);
		        do{
		            System.out.println("Enter a Number : ");
		            number=scanner.nextInt();
		            System.out.println(number);
		        }while(number>0);

		        System.out.println("The Entered Number is : "+number);
		        scanner.close();
	}
}
