package jdbcdemo;
/**
 * Author   : Sonu.2
 * Date     : Sep 10, 2025
 * Time     : 2:12:28 PM
 * Project  : AdvancedJava
 */

import java.sql.*;

public class SelectDemo {

	private static final String URL = "jdbc:mysql://localhost:3306/classicmodels";
	private static final String USER = "root";
	private static final String PASSWORD = "tiger";

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// Step-1: load MySQL JDBC Driver (optional for JDBC 4.0+, but safer)
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("✅ MySQL driver loader successfully.");

			// Step-2: establish connection
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("✅ Connected to database successfully");

			// Step-3: Create Statement
			stmt = conn.createStatement();

			// Step-4: Execute Query
			String sql = "SELECT customerNumber, customerName, city, creditLimit FROM customers";
			rs = stmt.executeQuery(sql);

			System.out.println("------------- Employee Records -------------");

			// Step 5: Process ResultSet
			while(rs.next()) {
				int customerNumber = rs.getInt("customerNumber");
				String customerName = rs.getString("customerName");
				String city = rs.getString("city"); // also applicable 1,2 the column number starts with 1
				double creditLimit = rs.getDouble("creditLimit");

				System.out.printf("customerNumber: %d  |  customerName: %s  |  city: %s  |  creditLimit: %.2f\n", customerNumber, customerName, city, creditLimit);
			}
		} catch (Exception e) {
			System.out.println("❌Database operation failed");
			e.printStackTrace();
		} finally {
			// step-6: Close resources manually
			try {
				if(rs != null) {
					rs.close();
				}
				if(stmt != null) {
					stmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Resources Closed");
		}
	}
}

