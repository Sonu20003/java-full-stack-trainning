package oopsdemo3;
/**
* Author   : Sonu.2
* Date     : Sep 5, 2025
* Time     : 9:59:00 AM
* Project  : CoreJava
*/

public class Ticket {
	private String movieName;
    private double price;
    
	public Ticket(String movieName, double price) {
		this.movieName = movieName;
		this.price = price;
	}
	
    public void showTicketDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Price: " + price);
    } 
}
