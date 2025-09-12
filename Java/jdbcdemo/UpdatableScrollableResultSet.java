package jdbcdemo;
/**
* Author   : Sonu.2
* Date     : Sep 11, 2025
* Time     : 9:56:28 AM
* Project  : AdvancedJava
*/

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatableScrollableResultSet {

	public static void main(String[] args) throws Exception {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			// Step 1: Establish a connection
			connection = ConnectionUtil.createConnection();

			// Step 2: Create a Statement with scrollable and updatable ResultSet
			statement = connection.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE, 
					ResultSet.CONCUR_UPDATABLE);

			// Step 3: Execute a query to get data from the Candidate table
			resultSet = statement.executeQuery("SELECT * FROM Candidates");
			
			while (resultSet.next()) {
				System.out
						.println("ID: " + resultSet.getInt("id") + ", Last Name: " + resultSet.getString("last_name"));
			}
			System.out.println();
			System.out.println("*************************************************************");

			// Step 4: Move to the first row
			if (resultSet.first()) {
				System.out.println("First Record: " + resultSet.getInt("id") + ", " + resultSet.getString("last_name"));

				// Update the first candidate's name in rs
				resultSet.updateString("last_name", "Gosling");
				resultSet.updateRow(); //Update Table
				System.out.println("First record updated successfully.");
			}

			// Step 5: Move to the last row
			if (resultSet.last()) {
				System.out.println("Last Record: " + resultSet.getInt("id") + ", " + resultSet.getString("last_name"));

				// Update the last candidate's name
				resultSet.updateString("last_name", "Navin");
				resultSet.updateRow();
				System.out.println("Last record updated successfully.");
			}

			// Step 6: Move to a specific row, e.g., second row
			if (resultSet.absolute(2)) {
				System.out.println("Second Record: " + resultSet.getInt("id") + ", " + resultSet.getString("last_name"));

				// Update the second candidate's name
				resultSet.updateString("last_name", "Ravi");
				resultSet.updateRow();
				System.out.println("Second record updated successfully.");
			}
			
			System.out.println("*************************************************************");
			System.out.println();
			resultSet.beforeFirst();
			while (resultSet.next()) {
				System.out
						.println("ID: " + resultSet.getInt("id") + ", Last Name: " + resultSet.getString("last_name"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) resultSet.close();
				if (statement != null) statement.close();
				if (connection != null) connection.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}


	}

}
