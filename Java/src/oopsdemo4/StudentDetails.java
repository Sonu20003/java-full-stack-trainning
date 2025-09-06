package oopsdemo4;
/**
* Author   : Sonu.2
* Date     : Sep 6, 2025
* Time     : 11:26:47 AM
* Project  : CoreJava
*/

// multiple Interface implementation - multiple inheritance
// StudentDetails class implements abstract methods of 2 Interfaces

class College {
	String name, university, course;
	int id;
	College(String name, int id, String university, String course) {
		this.name = name;
		this.id = id;
		this.university = university;
		this.course = course;
	}
	public String getName() {
		return name;
	}
	public String getUniversity() {
		return university;
	}
	public String getCourse() {
		return course;
	}
	public int getId() {
		return id;
	}
	
}
class Hostel {
	String name, location;

	public Hostel(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}
}

public class StudentDetails implements CollageData, HostelData {

	College c1=new College("Mary",500,"Delhi University","MCA");
	Hostel h1=new Hostel("Ram","Block A");
	
	@Override
	public void hostelDetail() {
		System.out.println("********** Hostel Details *********");
		System.out.println("Hostel Name :"+h1.getName());
		System.out.println("Location    :"+h1.getLocation());
	}

	@Override
	public void studentRecord() {
		System.out.println("Students Selected based on Percentage & Financial Condition");
		
	}

	@Override
	public void collegeDetail() {
		System.out.println("********** College Details *********");
		System.out.println("College Name : "+c1.getName());
		System.out.println("College Id   : "+c1.getId());
	//	System.out.println("Course       : "+c1.getCourse());
		System.out.println("University   : "+c1.getUniversity());
		
	}

	@Override
	public void studentData() {
		System.out.println("Students can Join courses : MCA, MTech, BCA,BTech");
		
	}

}
