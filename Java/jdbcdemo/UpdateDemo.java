package jdbcdemo;
/**
* Author   : Sonu.2
* Date     : Sep 11, 2025
* Time     : 11:22:43 AM
* Project  : AdvancedJava
*/

public class UpdateDemo {

	public static void main(String[] args) throws Exception {
		Candidates c = new Candidates();
		
		System.out.println("*************** Update Candidates Details ***************");
		
		c.getConnection();
		c.UpdateCandidate();
	}
}
