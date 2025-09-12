package java8features;
/**
 * Author   : Sonu.2
 * Date     : Sep 11, 2025
 * Time     : 2:27:36 PM
 * Project  : AdvancedJava
 */

public class LambdaDemo3 {

	public static void main(String[] args) {

		Calculator op1=(a,b) -> (a+b); // lambda expression
		//int c=(a,b) -> (a+b); 							// invoke lambda expression
		System.out.println("Addition of 2 Nos is : "+op1.evaluate(200, 155));

		Calculator op2=(a,b) -> (a-b);
		System.out.println("Subtraction of 2 Nos is : "+op2.evaluate(200, 155));

		Calculator op3=(a,b) -> (a*b);
		System.out.println("Multiplication of 2 Nos is : "+op3.evaluate(200, 155));

		Calculator op4=(int a,int b) -> (a/b);
		System.out.println("Division of 2 Nos is : "+op4.evaluate(200, 155));

		// lambda expression with single parameter with no parenthesis
		MyString myName1 = name -> { return "Hello "+name;};

		System.out.println(myName1.myStringFunction("James Gosling"));
	}
}
@FunctionalInterface
interface MyString{
	String myStringFunction(String str);
}
