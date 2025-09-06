package basics;
import java.util.Scanner;
/**
* Author   : Sonu.Sharma
* Date     : Aug 29, 2025
* Time     : 9:03:54 PM
* Project  : CoreJava
* 
* This program calculates the sum and average of a set of numbers.
*/

public class sumAverage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// declaration & input
		
		System.out.print("Enter your organization: ");
		String org = sc.nextLine();
		
		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the Second number: ");
		int num2 = sc.nextInt();
		System.out.print("Enter the Third number: ");
		int num3 = sc.nextInt();
		
		System.out.print("Enter your name: ");
		String name = sc.next();
		
		// process, method called from HelloWorld class
		int sum = HelloWorld.calculateSum(num1, num2, num3);
		
		System.out.println("*****************************************");
		System.out.println("the sum of three numbers is: "+sum);
		System.out.println("the average of three numbers is: "+(float)sum/3);
		System.out.println("Coded by " + name + " at "+org+" Trainning");
		System.out.println("*****************************************");
		
		sc.close();
	}
}
