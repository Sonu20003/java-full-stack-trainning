package oopsdemo2;
/**
 * Author   : Sonu.2
 * Date     : Sep 3, 2025
 * Time     : 4:24:35 AM
 * Project  : CoreJava
 */

public class SingleInheritanceAirline {
	public static void main(String[] args) {

		AirlineBooking b1 = new AirlineBooking("James Gosling", 32, "GG567766");

		b1.bookTicket();
		b1.displayPassengerDetails();
		b1.displayBookingDetails();

		AirlineBooking b2 = new AirlineBooking("Rod Johnson", 32, "ZW34767");

		b2.bookTicket();
		b2.displayPassengerDetails();
		b2.displayBookingDetails();
	}
}
