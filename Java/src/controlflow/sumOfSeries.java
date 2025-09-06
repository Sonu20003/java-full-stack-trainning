package controlflow;

import java.util.Scanner;

/**
* Author   : Sonu.2
* Date     : Sep 1, 2025
* Time     : 12:10:26 AM
* Project  : CoreJava
* Program to find Sum of Series . 1+2+3+ .....+n
*/

public class sumOfSeries {

	public static void main(String[] args) {
		int i=1,n,sum=0;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Value of N : ");
        n=scanner.nextInt();
        scanner.close();
        
        while(i <= n) {
        	sum += i;
        	i++;
        }
        System.out.println("The sum of series of: "+n+" is: "+sum);

	}

}
