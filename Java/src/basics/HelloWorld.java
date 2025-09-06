package basics;

/**
 * This is a simple "java program" that prints hello world to the console
 * It demonstrates the basic structure of a java application
 * @version 1.0
 * Using Java doc Markup tags
 */

class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello, World ! from Java");
		System.out.println("She shells sea shells at the Sea");
		int a = 10, b = 20;
		
		System.out.println("Sum of a and b is :" + calculateSum(a,b));
	}
	public static int calculateSum(int... numbers) {
		int sum = 0;
		for(int num : numbers) sum += num;
		return sum;
	}
}