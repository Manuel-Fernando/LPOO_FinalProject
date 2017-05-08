package client;

import java.sql.SQLException;

import mySQLConnection.ConnectorFile;

public class AddFriend {

	public static void add(String friendEmail, UserData user){
		
		ConnectorFile conector = new ConnectorFile();
		try {
			conector.AddMySQLData("INSERT INTO `amizade`(`uti1`, `uti2`) VALUES ('"+user.getEmail()+"','"+friendEmail+"')");
		} catch (SQLException e) {e.printStackTrace();}
		
	}
	
}
