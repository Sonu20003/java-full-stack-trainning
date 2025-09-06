package controlflow;

import java.util.Scanner;

/**
 * Author   : Sonu.2
 * Date     : Aug 31, 2025
 * Time     : 11:37:52 PM
 * Project  : CoreJava
 * Program to perform Arithmetic Operations using Switch-case
 * Switch statements in Java are control flow structures,
 * that allow you to execute certain block of code based on the value of a single expression
 */

public class switchDemo2 {

	public static void main(String[] args) {
		int num1,num2,result;
		String operator;
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter 2 Numbers :");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		System.out.println("Enter Arithmetic Operator");
		operator=scanner.next();
		scanner.close();

		switch (operator){
			case "+":   result=num1+num2;
			System.out.println("The Addition is : "+result);
			break;
		case "-":   result=num1-num2;
			System.out.println("The Subtraction is : "+result);
			break;
		case "*":   result=num1*num2;
			System.out.println("The Multiplication is : "+result);
			break;
		case "/":   result=num1/num2;
			System.out.println("The Division is : "+result);
			break;
		default:
			System.out.println("Invalid Operator");
			break;
		}
	}
}
