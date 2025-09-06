package oopsdemo3;
/**
* Author   : Sonu.2
* Date     : Sep 5, 2025
* Time     : 11:41:28 AM
* Project  : CoreJava
*/

public class Student {
	private int rollNo;
    private String name;
    private static  String college="UPES"; //static Variable
    
    public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
    
	public static void collegeChange(){ //static Method
        college="VTU";
    }
    public void display(){
        System.out.println(this.rollNo+" "+this.name+" "+college);
    }
}
