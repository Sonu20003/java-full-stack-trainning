package controlflow;

import java.util.Scanner;

/**
* Author   : Sonu.2
* Date     : Aug 31, 2025
* Time     : 9:53:25 PM
* Project  : CoreJava
* Program to find greatest of 3 numbers
*/

public class Greatest3 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
        int num1, num2 , num3;

        System.out.println("Enter 3 Numbers :");
        num1=scanner.nextInt();
        num2=scanner.nextInt();
        num3=scanner.nextInt();
        if(num1 == num2 && num2 == num3) System.out.println("All numbers are equal.");
        else if(num1 > num2 && num1 > num3) System.out.println("The first number: "+ num1+" is greatest");
        else if(num2 > num1 && num2 > num3) System.out.println("The second number: "+ num2+" is greatest");
        else System.out.println("The third number: "+ num3+" is greatest");
        
        scanner.close();

	}

}
