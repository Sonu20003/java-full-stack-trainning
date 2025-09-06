package oopsdemo;
/**
* Author   : Sonu.2
* Date     : Sep 2, 2025
* Time     : 3:55:05 AM
* Project  : CoreJava
*/

public class StudentTest {
	public static void main(String[] args) {
		Student std1 = new Student();
		Student std2 = new Student();
		
		std1.input();
		float tot = std1.calculate();
		std1.display();
		System.out.println("Total displayed from main#1: "+tot);
		
		// invoke method of student class using dot operator
		
		std2.input();
		float tot2 = std1.calculate(); // invoke method and return value
		std2.display();
		System.out.println("Total displayed from main#2: "+tot2);
	}
}
