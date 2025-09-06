package oopsdemo;
/**
* Author   : Sonu.2
* Date     : Sep 2, 2025
* Time     : 11:54:06 PM
* Project  : CoreJava
*/

public class Complex {
	
	private double real;
	private double imaginary;
	
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public void add(Complex obj) {
		this.real += obj.real;
		this.imaginary += obj.imaginary;
	}
	
	public void display() {
		System.out.println("r"+this.real+" + i"+this.imaginary);
	}
}
