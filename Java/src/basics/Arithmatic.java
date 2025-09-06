package basics;
/**
* Author   : Sonu.2
* Date     : Aug 29, 2025
* Time     : 10:55:57 PM
* Project  : CoreJava
* Program to perform Arithmatic operations using buffered reader inputs
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Arithmatic {
	public static void main(String[] args) throws Exception{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter 2 Numbers: ");
		int a = Integer.parseInt(reader.readLine());
		int b = Integer.parseInt(reader.readLine());
		
		System.out.print("Enter your name: ");
		String name = reader.readLine();
		
		int sum = a+b,
			sub = a-b,
			mul = a*b;
		float div = (float)a/b;
		
		System.out.println("*****************************************");
		System.out.println("the sum of "+a+", "+b+"  is: "+sum);
		System.out.println("the sub of "+b+" from "+a+"  is: "+sub);
		System.out.println("the multiplication of "+a+", "+b+"  is: "+mul);
		System.out.println("the division of "+b+" by "+a+"  is: "+div);
		System.out.println("Coded by " + name + " at Coforge Trainning");
		System.out.println("*****************************************");
		

	}
}
