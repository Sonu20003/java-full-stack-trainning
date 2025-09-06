package oopsdemo4;
/**
 * Author   : Sonu.2
 * Date     : Sep 6, 2025
 * Time     : 9:48:41 AM
 * Project  : CoreJava
 */

public interface Shape {
	//implicitly public, static and final - constant
	public String LABEL="Shape";
	
	//interface methods are implicitly abstract and public
	void draw();
	public abstract double getArea();
}
