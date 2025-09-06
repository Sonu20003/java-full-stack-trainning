package basics;

/**
 * This program calculates the area of the circle.
 * It demonstrates the use of variables, arithmatic operations,
 * and console output in java
 */

public class Area {
	public static void main(String[] args) {
		
		double radius = 7.5;
		double area;
		final double PI = Math.PI;
		
		area = radius * radius * PI;
		
		System.out.println("The are of the ciscle with radius: "+radius+" is: "+area);
		System.out.println(HelloWorld.calculateSum(1,2,3,4,5,6,7,8,9,10));
		
	}
}
