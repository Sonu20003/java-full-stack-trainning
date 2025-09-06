package arraysdemo;

import java.util.Arrays;
import java.util.Scanner;

/**
* Author   : Sonu.2
* Date     : Sep 1, 2025
* Time     : 9:31:39 PM
* Project  : CoreJava
* Program to add elements into an array and print it
*/

public class ArraysIO {
	public static void main(String[] args) {
		int[] marks = {78,54,76,423,65,32,432,5434,6,6534342,123,5,44,5,544,55,4,45};
		
		System.out.println("****************** Arrays of Marks ******************");
		for(int i=0; i<marks.length; i++) System.out.print(marks[i]+'\t');
		
		System.out.println();
		System.out.println("The Size pf array is: "+marks.length);
		System.out.println("The first element of array is: "+marks[0]);
		System.out.println("The last element of array is: "+marks[marks.length-1]);
		
		// enter values to the array at runtime
		System.out.println("***********************************************");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total no. of students: ");
		int size = sc.nextInt();
		
		int[] studentArray = new int[size];
		System.out.println("Enter marks of students: ");
		for(int i=0; i<size; i++) studentArray[i] = sc.nextInt();
		
		System.out.println("****************** Marks2 Array Content ******************");
		System.out.print("[");
		for(int i=0; i<size; i++) {
			System.out.print(studentArray[i]);
			if(i != size-1) System.out.print(", ");
		}
		System.out.print("]");
		
		// via pre-defined method
		System.out.println();
		System.out.println("via pre-defined method \\/");
		System.out.println(Arrays.toString(studentArray));
		sc.close();
	}
}
