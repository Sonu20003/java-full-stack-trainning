package oopsdemo;
/**
* Author   : Sonu.2
* Date     : Sep 2, 2025
* Time     : 4:12:13 AM
* Project  : CoreJava
*/

public class CoforgeEmployeeTest {
	public static void main(String[] args) {
		
		// create objects e1, s2 and e3
		Employee developer = new Employee();
		Employee tester = new Employee();
		Employee sales = new Employee();
		
		// invoke methods (Method calls)
		
		developer.inputEmployeeDetails();
		developer.calculateNetSalary();
		developer.displayEmployeeDetails();
		
		tester.inputEmployeeDetails();
		tester.calculateNetSalary();
		tester.displayEmployeeDetails();
		
		sales.inputEmployeeDetails();
		sales.calculateNetSalary();
		sales.displayEmployeeDetails();
	}
}
