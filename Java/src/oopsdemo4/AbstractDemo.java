package oopsdemo4;
/**
 * Author   : Sonu.2
 * Date     : Sep 5, 2025
 * Time     : 12:57:01 PM
 * Project  : CoreJava
 */

public class AbstractDemo {
	public static void main(String[] args) {
		Trainee t1=new Marks("John","New York",1001,35);  // up casting

		t1.show(); // invoke abstract base class method
		double marks=t1.calculateMarks();  // invoke sub class method
		System.out.println(t1 +" "+marks);
	}
}