package jdbcdemo;
/**
* Author   : Sonu.2
* Date     : Sep 11, 2025
* Time     : 10:17:35 AM
* Project  : AdvancedJava
*/

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) {
		
		Connection con;
		Statement stmt;
		ResultSet rs;
		int count;
		
		try {
			con = ConnectionUtil.createConnection();
			String str = "INSERT INTO SKILLS(name) VALUES ('System Design')";
			stmt = con.createStatement();
			count = stmt.executeUpdate(str);
			
			if(count > 0) System.out.println("Records Inserted Successfully");
			
			// count total number of records on the table
			
			String str1 = "Select count(id) from skills";
			rs = stmt.executeQuery(str1);
			int cnt = 0;
			while(rs.next()) cnt = rs.getInt(1);
			
			System.out.println("The total no. of records is: "+cnt);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
