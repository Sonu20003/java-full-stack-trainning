package controlflow;

import java.util.Scanner;

/**
* Author   : Sonu.2
* Date     : Sep 1, 2025
* Time     : 1:52:47 AM
* Project  : CoreJava
*/

public class DoWhileDemo1 {
	public static void main(String[] args) {
		int i=20;
		
		do {
			System.out.print(i+"\t");
			i++;
		} while(i <= 50);
		
		System.out.println("**************** Guess Name ****************");
		String guess;
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		
		do {
			System.out.println("Guess my name: ");
			guess = sc.next().toLowerCase();
		} while(!"James".toLowerCase().equals(guess));
		
		System.out.println("Congratulations you guessed the name correctly !!!!"+guess);
		sc.close();
	}
}
