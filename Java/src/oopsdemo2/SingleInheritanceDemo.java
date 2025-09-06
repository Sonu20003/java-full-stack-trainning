package oopsdemo2;
/**
* Author   : Sonu.2
* Date     : Sep 3, 2025
* Time     : 4:00:17 AM
* Project  : CoreJava
*/

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		
		Developer d1 = new Developer(101, "James Goslin", "JDBC", "SantenderBank" );
		Developer d2 = new Developer(105, "Rod Jhonson", "Spring Framework", "Virgin Atlantic");
		
		d1.display();
		d1.displayDeveloperDetails();
		
		d2.display();
		d2.displayDeveloperDetails();
		
		Employee el = new Employee(101, "Mike Ty"); // invoke parent class constructor
		el.display();

	}

}
