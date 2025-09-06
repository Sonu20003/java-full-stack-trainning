package oopsdemo2;
/**
 * Author   : Sonu.2
 * Date     : Sep 3, 2025
 * Time     : 11:42:56 PM
 * Project  : CoreJava
 */

public class AggregationDemo2 {

	public static void main(String[] args) {

		Author author = new Author("John", 42, "USA");

		Publisher publisher = new Publisher("Sun Publications","JDSR-III4", "LA");

		Book b = new Book("Java for Begginers", 800, author, publisher);

		b.display();

	}

}
