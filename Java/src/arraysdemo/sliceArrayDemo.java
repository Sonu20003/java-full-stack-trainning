package arraysdemo;

import java.util.Arrays;

/**
 * Author   : Sonu.2
 * Date     : Sep 1, 2025
 * Time     : 10:56:35 PM
 * Project  : CoreJava
 */

public class sliceArrayDemo {
	static void display() {
		System.out.println("Array manipulation in Java -slice Array");
	}
	static void sliceArray(int[] marks, int start, int end) {
		int sliceMarks[] = new int[end - start];
		for(int i=0; i<sliceMarks.length; i++) {
			sliceMarks[i] = marks[start+i]; //slice from pos start
		}
		System.out.println("Sliced arrat from start: "+start+" to end: "+(end-1)+" is: "+Arrays.toString(sliceMarks));
	}

	public static void main(String[] args) {
		display();

		int[] marks={78,56,23,44,90,98,67,55,35,84};
		int start=2,end=6;

		System.out.println("Original Array : "+ Arrays.toString(marks));
		sliceArray(marks,start,end+1); // Invoke sliceArray() method

		int [] grades={99,44,31,78,49,55,39,21,30,92,66,44};
		int start1=4,end1=8;
		System.out.println("Original Array : "+ Arrays.toString(grades));
		sliceArray(grades,start1,end1+1); // Invoke sliceArray() method again - reusability

		//Use inbuilt method copyOfRange() to slice Array
		int[] sliceGrades=Arrays.copyOfRange(grades,8,11);
		System.out.println("The grades Array after slicing from 8 -11 index : "+Arrays.toString(sliceGrades));


	}

}
