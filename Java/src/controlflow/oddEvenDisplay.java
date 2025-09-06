package controlflow;
/**
 * Author   : Sonu.2
 * Date     : Sep 1, 2025
 * Time     : 12:21:12 AM
 * Project  : CoreJava
 *  Program to display Odd & Even Numbers between 1-10
 *
 * ODD  EVEN
 * ---  ----
 * 1    2
 * 3    4
 * 5    6
 * 7    8
 * 9    10
 */

public class oddEvenDisplay {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("ODD     EVEN");
		System.out.println("---     ----");
		
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) {
				System.out.println(" "+i);
			} else System.out.print(" "+i+"\t");
			// Thread.sleep(500);
		}

	}

}
