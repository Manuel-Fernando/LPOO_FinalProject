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
		} catch (ClassNotFoundException e) {System.out.println("Falha ao ler SQL driver!");}

		String url = "jdbc:mysql://db.fe.up.pt/ee12314";
		String user = "ee12314";
		String password = "UmcPYB4Nr";


		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {System.out.println("Falha ao conectar com a base de dados!");}
		if (con == null) {System.out.println("Não conectado com a base de dados!");}
	}

	public void AddMySQLData( String command) {
		try {
			PreparedStatement statement = con.prepareStatement(command);
			statement.execute();
		} catch (SQLException e) {System.out.println("Erro na Base de dados!");}
	}

	public ResultSet SearchMySQLData(String command) {
		ResultSet result = null;
		try {
			PreparedStatement statement = con.prepareStatement(command);
			result = statement.executeQuery();
		} catch (SQLException e) {System.out.println("Erro na Base de dados!");}
		return result;	
	}
}