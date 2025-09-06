package controlflow;
/**
 * Author   : Sonu.2
 * Date     : Aug 31, 2025
 * Time     : 11:16:14 PM
 * Project  : CoreJava
 * Ternary Operator : It is a conditional Operator used in place of If-Else for Simple condition.
 * It Takes 3 Operands
 * Syntax: variable = condition ? expr1 : expr2
 *
 * Program to find Max of 2 Numbers
 */

public class ternaryDemo {
	public static void main(String[] args) {
		
		int a = 1110, b = 220, max;
		
		System.out.println("First Number: "+a);
		System.out.println("Second Number: "+b);
		
		// Ternary Operation
		
		String msg = (a > b) ? "A is Greater." : "B is Greater.";
		System.out.println(msg);
		max = (a > b) ? a : b;
		System.out.println("The Maximum of 2 Numbers is: "+max);
	}
}
