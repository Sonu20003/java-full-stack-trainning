package oopsdemo4;
/**
* Author   : Sonu.2
* Date     : Sep 6, 2025
* Time     : 10:16:06 AM
* Project  : CoreJava
*/

public class AirlinePassenger implements Passenger {
	
	private String name;
    private String passportNumber;
    private String email;
    private String phone;
    

	public AirlinePassenger(String name, String passportNumber, String email, String phone) {
		super();
		this.name = name;
		this.passportNumber = passportNumber;
		this.email = email;
		this.phone = phone;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getPassportNumber() {
		return this.passportNumber;
	}

	@Override
	public String getContactInfo() {
		return "Email: "+this.email+" Phone: "+this.phone;
	}
}
