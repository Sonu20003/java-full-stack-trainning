package oopsdemo3;
/**
* Author   : Sonu.2
* Date     : Sep 5, 2025
* Time     : 9:48:03 AM
* Project  : CoreJava
*/

public class UpcastingDemo {

	public static void main(String[] args) {

		Product product;
		
		// product obj refers to book object
		product = new Book("Java Programming", 450, "James Gosling");
		System.out.println("------------- Book Details --------------");
        product.display();//Dynamic Binding
        
        //Switching from one implementation to another is easy
        product=new Laptop("IdeaPad",60000.00,"Lenova"); //Upcasting
        System.out.println("------------- Laptop Details --------------");
        product.display();//Dynamic Binding

        product =new Book("Python Made Easy",650,"Balaguruswamy"); //Upcasting
        System.out.println("------------- Book Details --------------");
        product.display(); //Dynamic Binding
	}
}
