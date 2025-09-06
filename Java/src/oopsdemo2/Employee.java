package oopsdemo2;
/**
* Author   : Sonu.2
* Date     : Sep 3, 2025
* Time     : 3:49:05 AM
* Project  : CoreJava
* Single Inheritance Example
*/

public class Employee {
	private int empId;
	private String name;
	
	// Generate constructors using field
	// public Employee() {}
	public Employee(int empId, String name) {
		// super();
		this.empId = empId;
		this.name = name;
	}
	
	void display() {
		System.out.println("********** Employee Details ***************");
		System.out.println("Employee Id  :"+empId);
		System.out.println("Employee Name: "+name);
	}
}
