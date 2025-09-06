package controlflow;

import java.util.Scanner;

/**
* Author   : Sonu.2
* Date     : Sep 1, 2025
* Time     : 12:15:45 AM
* Project  : CoreJava
* Java Program to find Sum of Positive Numbers
*/

public class sumPositive {

	public static void main(String[] args) {
		int sum=0,number=0;
        Scanner input =new Scanner(System.in);

        // Loop continues until entered number is Positive
        while(number >= 0) {
        	sum += number;
        	System.out.println("Enter a number: ");
        	number = input.nextInt();
        }
        System.out.println("The sum of positive numbers is: "+sum);
        input.close();

	}

}
