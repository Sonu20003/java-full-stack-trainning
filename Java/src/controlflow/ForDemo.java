package controlflow;
/**
* Author   : Sonu.2
* Date     : Sep 1, 2025
* Time     : 2:24:18 AM
* Project  : CoreJava
* For Loop Demonstration -
* use For Loop, when u want to execute a loop fixed no. of times
*/

public class ForDemo {

	public static void main(String[] args) {
		System.out.println("Display numbers from 1 - 25");
		for(int i=1; i<=25; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("Display n0s form 100 - 75");
		
		for(int j=100; j>=75; j--) {
			System.out.println(j+"\t");
		}
	}

}
