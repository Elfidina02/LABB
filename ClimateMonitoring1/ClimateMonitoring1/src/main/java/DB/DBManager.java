package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException; 
import java.sql.Statement; 
import java.io.*;
public class DBManager {
 
	 public static Connection connect(String url,String username, String password)throws SQLException {
		Connection conn= DriverManager.getConnection(url, username, password);
	            return conn;
	 }
	 public static void closeConnection(Connection connection)throws SQLException{
		 if(connection != null && !connection.isClosed()) {
			 connection.close();
		 }

	            }
}
