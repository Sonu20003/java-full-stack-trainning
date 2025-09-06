package controlflow;
/**
* Author   : Sonu.2
* Date     : Aug 31, 2025
* Time     : 11:58:32 PM
* Project  : CoreJava
*/

public class whileDemo {

	public static void main(String[] args) {
		
		int i=1;
		while(i <= 10) {
			System.out.println(i+".James");
			i++;
		}
		System.out.println("Exit loop");
		
		System.out.println("********* Reverse Loop *********");
		int j = 10;
		while(j >= 1) {
			System.out.println(j+"\t");
			j--;
		}
	}

}
