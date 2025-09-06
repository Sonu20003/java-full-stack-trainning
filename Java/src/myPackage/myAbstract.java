package myPackage;
/**
* Author   : Sonu.2
* Date     : Sep 5, 2025
* Time     : 12:36:45 PM
* Project  : CoreJava
*/

abstract class temp {
	abstract void display();
	void print() {
		System.out.println("This is the default print method.");
	}
}
interface tm {
	void display();
}

class childTemp extends temp implements tm{
	@Override
	public void display() {
		System.out.println("This is abstract method display");
	}
}


public class myAbstract {

	public static void main(String[] args) {
		
		

	}

}
