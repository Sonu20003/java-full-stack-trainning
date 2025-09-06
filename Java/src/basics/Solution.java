package basics;
/**
* Author   : Sonu.2
* Date     : Aug 29, 2025
* Time     : 11:57:14 PM
* Project  : CoreJava
*/

public class Solution {
	public static void main(String[] args) {
		Integer nonPrimitive = 10;
		String name = new String("Sonu");
		Employee emp1 = new Employee(100, name);
		
		StringBuilder sb = new StringBuilder(name);
		
		doneSomething(nonPrimitive, name, sb, emp1);
		
		System.out.println(nonPrimitive);
		System.out.println(name);
		System.out.println(sb);
		System.out.println(emp1);
	}

	private static void doneSomething(Integer nonPrimitive, String str, StringBuilder sb, Employee emp) {
		
		nonPrimitive = 20;
		str = "Sonu Sharma";
		str = new String(str);
		
		// sb.append(" Sharma");
		sb = new StringBuilder(str);
		
		emp = new Employee(200, str);
	}
}

class Employee{
	private int id;
	private String name;
	
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "ID: "+id+", Name: "+name;
	}
}