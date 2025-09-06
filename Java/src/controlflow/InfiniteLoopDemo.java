package controlflow;
/**
 * Author   : Sonu.2
 * Date     : Sep 1, 2025
 * Time     : 3:53:23 AM
 * Project  : CoreJava
 */

public class InfiniteLoopDemo {
	public static void main(String[] args) {
		System.out.println("Infinite Loops");

		/*while (true){
            System.out.println("Hello World");
        }*/

		for(;;){
			System.out.println("Hello World");
		}
	}
}
