package jdbcdemo;

import java.util.Scanner;

/**
 * Author   : Sonu.2
 * Date     : Sep 11, 2025
 * Time     : 12:06:45 PM
 * Project  : AdvancedJava
 */

public class CallableStatementDemo {

	public static void main(String[] args) throws Exception {

		Skills s=new Skills();
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter candidate details to get skills: \n");
		System.out.println("Enter Candidate Id : ");
		int id=scan.nextInt();

		s.getSkils(id);
		scan.close();

	}

}
