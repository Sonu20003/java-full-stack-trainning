package oopsdemo;

import java.util.Scanner;

/**
 * Author   : Sonu.2
 * Date     : Sep 2, 2025
 * Time     : 9:31:06 PM
 * Project  : CoreJava
 */

public class BoookTest {

	public static void main(String[] args) {

		Book b1 = new Book();

		b1.setBookId(101);
		b1.setBookName("Jagdhish Bhagat");
		b1.setPrice(100);
		b1.setPublisher("Prime books");

		// invoke setter methods
		System.out.println("********* Book Details *********");
		b1.display();
		System.out.println(b1);
		System.out.println("Discounted price of Book: "+b1.discountPrice());
		System.out.println(b1); // invoke toString() method of the instance class

		Book b2 = new Book();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book Id, Name, Price & Publisher: ");
		b2.setBookId(sc.nextInt());
		sc.nextLine();
		b2.setBookName(sc.nextLine());
		b2.setPrice(sc.nextFloat());
		sc.nextLine();
		b2.setPublisher(sc.nextLine());

		// invoke setter methods
		System.out.println("********* Book Details *********");
		b2.display();
		System.out.println(b2);
		System.out.println("Book Id                 :    "+b2.getBookId());
		System.out.println("Book Name               :    "+b2.getBookName());
		System.out.println("Book Publisher          :    "+b2.getPublisher());
		System.out.println("Discounted price of Book:    "+b2.discountPrice());
		System.out.println(b2);
		sc.close();
	}

}
