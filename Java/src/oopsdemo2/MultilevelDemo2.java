package oopsdemo2;
/**
* Author   : Sonu.2
* Date     : Sep 3, 2025
* Time     : 9:55:27 PM
* Project  : CoreJava
*/

public class MultilevelDemo2 {
	public static void main(String[] args) {
		
		Director d1 = new Director(101, "Keane Reaves", 5000);
		System.out.println("*************** Director Details ***************");
		d1.display();
		d1.getHRA();
		d1.getDA();
		d1.getTA();
		
		Manager m1 = new Manager(101, "Jagdhish Bhagat", 2000);
		System.out.println("*************** Director Details ***************");
		m1.display();
		m1.getHRA();
		m1.getDA();
		
		Staff s1 = new Staff(101, "Poppy Puff", 1000);
		System.out.println("*************** Director Details ***************");
		s1.display();
		s1.getHRA();
	}
}
