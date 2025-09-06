package oopsdemo;
/**
 * Author   : Sonu.2
 * Date     : Sep 2, 2025
 * Time     : 11:18:56 PM
 * Project  : CoreJava
 * Constructor is a special method with the same name of a class, 
 * which initializes an Object properties.
 * Same name as the class and no return type.
 * Special Method invoked whenever an instance/object of a given class is created.
 * Constructor is a special method with the same name of a class, 
 * which initializes an Object properties.
 * Same name as the class and no return type.
 * Special Method invoked whenever an instance/object of a given class is created.
 */

public class ConstructorDemo {

	int id;
	String name;
	float salary;

	ConstructorDemo() {
		System.out.println("Implicit Constructor");
		this.id = 101;
		this.name = "Puran Churan";
		this.salary = 5000.00f;
	}

	ConstructorDemo(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "ConstructorDemo [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		ConstructorDemo impl = new ConstructorDemo();
		System.out.println(impl);  
		ConstructorDemo cns1 = new ConstructorDemo(101, "Sonu", 10000);
		System.out.println(cns1);
	}

}
