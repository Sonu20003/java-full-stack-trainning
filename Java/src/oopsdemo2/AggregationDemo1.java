package oopsdemo2;
/**
* Author   : Sonu.2
* Date     : Sep 3, 2025
* Time     : 11:23:23 PM
* Project  : CoreJava
*/

public class AggregationDemo1 {
	public static void main(String[] args) {	
		new Student(101, "Ravi", new Address("Benguluru", "Karnataka", "India", 566016)).display();
		new Student(101, "mike", new Address("Prague", "Austin", "Czech Republic", 776677)).display();
	}
}