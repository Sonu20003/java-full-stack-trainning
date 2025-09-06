package oopsdemo4;
/**
 * Author   : Sonu.2
 * Date     : Sep 6, 2025
 * Time     : 10:02:19 AM
 * Project  : CoreJava
 */

public class ShapeTest {

	public static void main(String[] args) {

		//programming for interfaces not implementation
		Shape shape=new Circle(10); // Upcasting

		System.out.println("Using Interface :"+Shape.LABEL);

		shape.draw();

		System.out.println("Area of Circle with radius  is :"+shape.getArea());

		//switching from one implementation to another easily
		shape=new Rectangle(10,7); // Upcasting

		shape.draw();
		System.out.println("Area of Rectangle is :"+shape.getArea());

	}

}
