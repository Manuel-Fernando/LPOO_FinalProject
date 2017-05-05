package mySQLConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectorFile {
	
	static Connection con = null;
 
	public ConnectorFile() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {e.printStackTrace();}

		String url = "jdbc:mysql://db.fe.up.pt/ee12314";
		String user = "ee12314";
		String password = "UmcPYB4Nr";

		
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {e.printStackTrace();}
		if (con == null) {
			System.out.println("NOT connected to the database test1");
		}
	}
	
	public void AddMySQLData( String command) throws SQLException {
		PreparedStatement statement = con.prepareStatement(command);
		statement.execute();
	}
	
	public ResultSet SearchMySQLData(String command) throws SQLException{
		PreparedStatement statement = con.prepareStatement(command);
		ResultSet result = statement.executeQuery();
		
		return result;
		
	}
	
}
