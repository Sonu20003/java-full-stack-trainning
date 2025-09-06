package oopsdemo4;
/**
 * Author   : Sonu.2
 * Date     : Sep 6, 2025
 * Time     : 11:44:24 AM
 * Project  : CoreJava
 */

public class Candidate implements Exam{
	String name;
	int roll_no,mark1,mark2;

	public Candidate(String name, int roll_no, int mark1, int mark2) {
		super();
		this.name = name;
		this.roll_no = roll_no;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}

	void display() {
		System.out.println ("Name of Student: "+name);
		System.out.println ("Roll No. of Student: "+roll_no);
		System.out.println ("Marks of Subject 1: "+mark1);
		System.out.println ("Marks of Subject 2: "+mark2);
	}

	@Override
	public void parent_cal() {
		// TODO Auto-generated method stub
		
	}
}
