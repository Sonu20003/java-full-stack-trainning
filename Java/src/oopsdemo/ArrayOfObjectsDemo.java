package oopsdemo;
/**
 * Author   : Sonu.2
 * Date     : Sep 2, 2025
 * Time     : 10:22:42 PM
 * Project  : CoreJava
 */

class Faculty {
	int empId;
	String name;

	public void setData(int c,String d){
		this.empId=c;
		this.name=d;
	}

	public void showData(){
		System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
		System.out.println();
	}
}

public class ArrayOfObjectsDemo {
	public static void main(String[] args) {
		Faculty[] obj = new Faculty[5];
		
		for(int i=0; i<5; i++) obj[i] = new Faculty();
		
		obj[0].setData(100, "James");
		obj[1].setData(101, "Gavin");
		obj[2].setData(102, "Navin");
		obj[3].setData(103, "Mary");
		obj[4].setData(104, "Rod");
		
		System.out.println("************ Faculty Details ************");
		for(int i=0; i<5; i++) obj[i].showData();
		System.out.println("*****************************************");
	}
}
