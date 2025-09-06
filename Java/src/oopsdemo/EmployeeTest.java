package oopsdemo;
/**
* Author   : Sonu.2
* Date     : Sep 2, 2025
* Time     : 4:12:13 AM
* Project  : CoreJava
*/

public class EmployeeTest {
	public static void main(String[] args) {
		
		// create objects e1, s2 and e3
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		// invoke methods (Method calls)
		
		e1.inputEmployeeDetails();
		e1.calculateNetSalary();
		e1.displayEmployeeDetails();
		
		e2.inputEmployeeDetails();
		e2.calculateNetSalary();
		e2.displayEmployeeDetails();
		
		e3.inputEmployeeDetails();
		e3.calculateNetSalary();
		e3.displayEmployeeDetails();
	}
}
