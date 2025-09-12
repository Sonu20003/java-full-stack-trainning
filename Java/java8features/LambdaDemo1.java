package java8features;
/**
* Author   : Sonu.2
* Date     : Sep 11, 2025
* Time     : 12:55:11 PM
* Project  : AdvancedJava
*/

@FunctionalInterface
interface MyFi {
	String sayHello();
	// String sayHello();
}

public class LambdaDemo1 {
	public static void main(String[] args) {
		
		MyFi msgs = () -> "Hello World";
		MyFi msgs1 = () -> "Java 8 Features";
		MyFi msgs2 = () -> "Coforge";
		MyFi msgs3 = () -> "Coforge"+" "+"Technologies";
		
		System.out.println(msgs.sayHello());
		System.out.println(msgs1.sayHello());
		System.out.println(msgs2.sayHello());
		System.out.println(msgs3.sayHello());
		
	}
}
