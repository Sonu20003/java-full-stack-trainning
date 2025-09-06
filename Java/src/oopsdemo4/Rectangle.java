package oopsdemo4;
/**
* Author   : Sonu.2
* Date     : Sep 6, 2025
* Time     : 9:57:29 AM
* Project  : CoreJava
*/

public class Rectangle implements Shape {
	
	private double height, weight;
	

	public Rectangle(double height, double weight) {
		super();
		this.height = height;
		this.weight = weight;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");	
	}

	@Override
	public double getArea() {
		return (this.height * this.weight);
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}
}
