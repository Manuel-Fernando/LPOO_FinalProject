package client;

import java.sql.ResultSet;
import java.sql.SQLException;

import mySQLConnection.ConnectorFile;

public class Change {

	public static UserData userName(String newName, UserData user){
		
		ConnectorFile conector = new ConnectorFile();
		String sql ="UPDATE `utilizador` SET `nome`='"+newName+"' WHERE `email` = '"+user.getEmail()+"'";
		try {
			conector.AddMySQLData(sql);
		} catch (SQLException e) {return null;}
		user.setUserName(newName);
		return user;
	}
	
	public static UserData password(String newPass, UserData user){
		ConnectorFile conector = new ConnectorFile();
		String sql ="UPDATE `utilizador` SET `password`='"+newPass+"' WHERE `email` = '"+user.getEmail()+"'";
		try {
			conector.AddMySQLData(sql);
		} catch (SQLException e) {return null;}
		user.setPassword(newPass);
		return user;
	}

	public static UserData email(String newEmail, UserData user){
		ConnectorFile conector = new ConnectorFile();
		String sql ="SELECT `email` FROM `utilizador` WHERE `email` = '"+newEmail+"'";
		try {
			ResultSet rs = conector.SearchMySQLData(sql);
			if (!rs.isBeforeFirst()){
				sql ="UPDATE `utilizador` SET `email`='"+newEmail+"' WHERE `email` = '"+user.getEmail()+"'";
				conector.AddMySQLData(sql);
				user.setEmail(newEmail);
			}
			else {return null;}
		} catch (SQLException e) {return null;}
		return user;
	}
}
