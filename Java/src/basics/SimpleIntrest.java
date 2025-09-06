package basics;

import java.util.Scanner;

/**
 * Author   : Sonu.2
 * Date     : Aug 29, 2025
 * Time     : 11:14:26 PM
 * Project  : CoreJava
 */

public class SimpleIntrest {

	public static void main(String[] args) {
		// Program to Calculate Simple Interest for a Loan Amount



		String customerName;
				double principal;
				float si;
				int term,rate;

				///Create scanner object for taking input at runtime
				Scanner scan = new Scanner(System.in);

				//Input
				System.out.println("*********** Soft Bank - Simple Interest Calculation *********");
				System.out.println("Enter Customer Name : ");
				customerName=scan.nextLine();//Multiple words input
				System.out.println("Enter Loan Amount   : ");
				principal=scan.nextDouble();
				System.out.println("Enter Loan Term     : ");
				term=scan.nextInt();
				System.out.println("Enter Rate of Interest :");
				rate=scan.nextInt();

				//Calculate Simple Interest
				si=(float) (principal*term*rate)/100;

				//Output
				System.out.println("************ Loan Details ************************");
				System.out.println("Customer Name           : "+customerName);
				System.out.println("Principal Amount        : "+principal);
				System.out.println("Term                    : "+term);
				System.out.println("Rate of Interest        : "+rate);
				System.out.println("--------------------------------------------------");
				System.out.println("Simple Interest         : "+si);
				System.out.println("--------------------------------------------------");

				scan.close();

	}

}
