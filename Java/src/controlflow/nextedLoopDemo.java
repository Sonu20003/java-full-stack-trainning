package controlflow;
/**
* Author   : Sonu.2
* Date     : Sep 1, 2025
* Time     : 3:38:33 AM
* Project  : CoreJava
*/

public class nextedLoopDemo {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*\t");
			}
			System.out.println();
		}		
	}
}
