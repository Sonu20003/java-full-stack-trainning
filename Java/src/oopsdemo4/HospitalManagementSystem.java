package oopsdemo4;
/**
 * Author   : Sonu.2
 * Date     : Sep 5, 2025
 * Time     : 4:28:40 PM
 * Project  : CoreJava
 */

public class HospitalManagementSystem {
	public static void main(String[] args) {

		// Create different types of hospital staff
		Doctor doctor = new Doctor("Dr. Smith", "DOC123", "Cardiology", "Cardiologist");
		Nurse nurse = new Nurse("Nurse Johnson", "NUR456", "Emergency", 8);
		AdminStaff admin = new AdminStaff("Mr. Davis", "ADM789", "Administration", "Billing");

		// Demonstrate polymorphic behavior
		HospitalStaff[] staffMembers = {doctor, nurse, admin};

		for (HospitalStaff staff : staffMembers) {
			System.out.println("\n--- " + staff.getName() + " (" + staff.getId() + ") ---");
			staff.performDuties();  // Calls the appropriate implementation
			staff.attendMeeting();  // Uses the inherited method

			// Additional role-specific methods
			if (staff instanceof Doctor) {
				((Doctor) staff).prescribeMedication();
			} else if (staff instanceof Nurse) {
				((Nurse) staff).administerMedication();
			} else if (staff instanceof AdminStaff) {
				((AdminStaff) staff).processPaperwork();
			}
		}
	}
}
