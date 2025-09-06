package oopsdemo2;
/**
* Author   : Sonu.2
* Date     : Sep 3, 2025
* Time     : 3:51:31 AM
* Project  : CoreJava
*/

public class Developer extends Employee {
	
	private String skillSet;
	private String projectName;


	public Developer(int empId, String name, String skillSet, String projectName) {
		super(empId, name);
		this.skillSet = skillSet;
		this.projectName = projectName;
	}
	
	public void displayDeveloperDetails() {
		// call parent class method
		
		System.out.println("Skill Set: " + skillSet);
		System.out.println("Project Name: " + projectName);
	}

}
