package jdbcdemo;
/**
* Author   : Sonu.2
* Date     : Sep 11, 2025
* Time     : 9:40:44 AM
* Project  : AdvancedJava
*/

import java.sql.Connection;
import java.sql.DriverManager;

// Utility class to create connection with MySQL database
public class ConnectionUtil {
	
	public static Connection createConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","tiger");
	}
}
