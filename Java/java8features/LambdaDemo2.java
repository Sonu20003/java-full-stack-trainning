package java8features;
/**
* Author   : Sonu.2
* Date     : Sep 11, 2025
* Time     : 2:17:00 PM
* Project  : AdvancedJava
*/

public class LambdaDemo2 {

	public static void main(String[] args) {

		NumericTest isEven = (n) -> (n%2 == 0);
		NumericTest isNegative = (n) -> n<0;
		
		System.out.println(isEven.computeTest(10));
		System.out.println(isNegative.computeTest(10));

	}

}
