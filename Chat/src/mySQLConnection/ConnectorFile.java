package mySQLConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectorFile {
 
	public static Connection ConnectToMySQL() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://db.fe.up.pt/ee12314";
		String user = "ee12314";
		String password = "UmcPYB4Nr";

		Connection con = DriverManager.getConnection(url, user, password);
		if (con == null) {
			System.out.println("NOT connected to the database test1");
		}
		return con;
	}
	
	public static void AddMySQLData(Connection con, String command) throws SQLException {
		PreparedStatement statement = con.prepareStatement(command);
		statement.execute();
	}
	
	public static ResultSet SearchMySQLData(Connection con, String command) throws SQLException{
		PreparedStatement statement = con.prepareStatement(command);
		ResultSet result = statement.executeQuery();
		
		return result;
		
	}
	
}
