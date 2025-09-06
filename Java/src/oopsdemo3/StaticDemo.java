package oopsdemo3;
/**
 * Author   : Sonu.2
 * Date     : Sep 5, 2025
 * Time     : 11:30:48 AM
 * Project  : CoreJava
 */

class Count {

	private static int cnt;
	private int a;

	Count() {
		cnt++;
		display();
		a=100;
	}

	public static void display() {
		System.out.println("Number of objects created: "+cnt);
	}

	public void print(){
		System.out.println("Instance Method Variable : "+a);
	}
}

public class StaticDemo {
	public static void main(String[] args) {
		
		new Count().print();;
		new Count();
		new Count();
		
		Count.display();
		
	}
}


