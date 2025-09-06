package oopsdemo3;
/**
 * Author   : Sonu.2
 * Date     : Sep 4, 2025
 * Time     : 2:45:29 AM
 * Project  : CoreJava
 * Overriding is a feature that allows a subclass or
 * child class to provide a specific implementation of a method
 * that is already provided by one of its super-classes or parent classes
 */


class Bank {
	private String name;

	public Bank(String name) {
		super();
		this.name = name;
	}
	
	int getRateOfInterest(){
        return 0;
    }
	
    void display(){
        System.out.println("Welcome to "+name+" Bank");
    }
}

class SBI extends Bank {

	public SBI(String name) {
		super(name);
	}
	
	@Override
	int getRateOfInterest(){
        return 5;
    }
}

class ICICI extends Bank {

	public ICICI(String name) {
		super(name);
	}

	@Override
	int getRateOfInterest() {
		return 7;
	}
}

class Axis extends Bank {

	public Axis(String name) {
		super(name);
	}

	@Override
	int getRateOfInterest() {
		return 6;
	}
	
	
}

public class OverRideDemo {
	public static void main(String[] args) {
		
		SBI sbiBank = new SBI("SBI");
		ICICI iciciBank = new ICICI("ICICI");
		Axis axisBank = new Axis("Axis");
		
		sbiBank.display();
		System.out.println("The rate of interest of SBI is: "+sbiBank.getRateOfInterest());
		
		iciciBank.display();
		System.out.println("The rate of interest of SBI is: "+iciciBank.getRateOfInterest());
		
		axisBank.display();
		System.out.println("The rate of interest of SBI is: "+axisBank.getRateOfInterest());
	}
}
