package oopsdemo;

import java.util.Scanner;

/**
 * Author   : Sonu.2
 * Date     : Sep 3, 2025
 * Time     : 2:15:40 AM
 * Project  : CoreJava
 */

public class AirCargoTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		AirCargo cargo = null;  // Initially no booking
		int choice;

		do {
			System.out.println("\n====== Sita Air Cargo Booking System ======");
			System.out.println("1. Book Cargo");
			System.out.println("2. Update Weight");
			System.out.println("3. Generate Bill");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine(); // consume newline

			switch (choice) {
			case 1:
				System.out.print("Enter Booking ID: ");
				String bookingId = sc.nextLine();

				System.out.print("Enter Sender Name: ");
				String senderName = sc.nextLine();

				System.out.print("Enter Destination: ");
				String destination = sc.nextLine();

				System.out.print("Enter Cargo Weight (kg): ");
				double weight = sc.nextDouble();

				System.out.print("Enter Cost per Kg: ");
				double costPerKg = sc.nextDouble();

				cargo = new AirCargo(bookingId, senderName, destination, weight, costPerKg);
				cargo.bookCargo();
				break;

			case 2:
				if (cargo != null) {
					System.out.print("Enter new weight (kg): ");
					double newWeight = sc.nextDouble();
					cargo.setWeight(newWeight);
					System.out.println("✅ Weight updated successfully!");
				} else {
					System.out.println("⚠️ Please book cargo first!");
				}
				break;

			case 3:
				if (cargo != null) {
					cargo.generateBill();
				} else {
					System.out.println("⚠️ No booking found! Please book cargo first.");
				}
				break;

			case 4:
				System.out.println("🚪 Exiting... Thank you for using Air Cargo Booking System!");
				break;

			default:
				System.out.println("❌ Invalid choice! Try again.");
			}
		} while (choice != 4);

		sc.close();



	}

}
