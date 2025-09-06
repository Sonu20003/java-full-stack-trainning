package controlflow;

import java.util.Scanner;

/**
* Author   : Sonu.2
* Date     : Sep 1, 2025
* Time     : 2:39:55 AM
* Project  : CoreJava
*/

public class multiplication {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		System.out.println("Multiplication Table of: 5");
		for(int i=1; i<=10; i++) {
			System.out.println(n +" * "+ i+ " = "+n*i);
			Thread.sleep(200);
		}
		sc.close();
	}

}
