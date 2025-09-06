package oopsdemo4;
/**
* Author   : Sonu.2
* Date     : Sep 6, 2025
* Time     : 9:51:56 AM
* Project  : CoreJava
*/

public class Circle implements Shape{
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Drawing circle");
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}
	
	// getter
	public double getRadius() {
		return this.radius;
	}
}
