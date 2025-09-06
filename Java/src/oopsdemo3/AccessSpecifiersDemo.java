package oopsdemo3;
/**
 * Author   : Sonu.2
 * Date     : Sep 5, 2025
 * Time     : 10:30:55 AM
 * Project  : CoreJava
 */

class Test {
	int a; //default variable -- accessible in all classes of the package
	@SuppressWarnings("unused")
	private int b; //private variable - accessible in this class
	protected int c; //protected variable - accessible in this class & subclass
	public int d; //Accessible from anywh
	
	public Test(int a, int b, int c, int d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public void print() {
		System.out.println("Do nothing at all !");
		
	}
}

class Test2 extends Test {

	public Test2(int a, int b, int c, int d) {
		super(a, b, c, d);
	}
	
	public void display() {// public Method
        System.out.println("Protected Variable :"+c);
    }
    
}

public class AccessSpecifiersDemo {

	public static void main(String[] args) {

		Test t1 = new Test(100,200,300,400);
		System.out.println(t1);
		
		Test t2 = new Test(102, 204, 306, 408);
		System.out.println(t2.a);
		t2.print();
	}

}
