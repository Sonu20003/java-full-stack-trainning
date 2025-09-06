package arraysdemo;

import java.util.Arrays;

/**
 * Author   : Sonu.2
 * Date     : Sep 1, 2025
 * Time     : 10:10:36 PM
 * Project  : CoreJava
 */

public class sortDemo {
	public static void main(String[] args) {
		String[] lanaguages ={"Java","Ruby","Python","C++","Scala","Oak","C"};
		String[] lanaguages1 ={"Java","Ruby","Python","C++","Scala","Oak","C"};

		System.out.println("Original Array : "+ Arrays.toString(lanaguages));
		Arrays.sort(lanaguages); //Inbuilt function of Arrays
		System.out.println("Sorted Array : "+ Arrays.toString(lanaguages));

		//Partial Sort
		Arrays.sort(lanaguages1,2,lanaguages1.length);
		System.out.println("Array after Partial Sorting :");
		for(String x:lanaguages1){
			System.out.print(x+"\t");
		}
	}
}
