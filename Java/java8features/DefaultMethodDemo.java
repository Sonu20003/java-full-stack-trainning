package java8features;
/**
 * Author   : Sonu.2
 * Date     : Sep 11, 2025
 * Time     : 3:38:21 PM
 * Project  : AdvancedJava
 */

public class DefaultMethodDemo {
	public static void main(String[] args) {

		Vehicle car=new Car("BMW");

		//invoke overriden methods
		System.out.println(car.getBrand());
		System.out.println(car.speedUp());
		System.out.println(car.slowDown());

		//invoke default methods
		System.out.println(car.turnAlarmOn());
		System.out.println(car.turnAlarmOff());

		//invoke static method of Interface
		System.out.println(Vehicle.getHorsePower(2500, 400));

	}
}

class Car implements Vehicle {
	String brand;

	Car(String brand) {
		this.brand = brand;
	}
	@Override
	public String getBrand() {
		return this.brand;
	}

	@Override
	public String speedUp() {
		return "Car is speeding up !!";
	}

	@Override
	public String slowDown() {
		return "Car is slowing down !!";
	}

}