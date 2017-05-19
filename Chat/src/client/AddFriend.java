package client;

import mySQLConnection.ConnectorFile;

public class AddFriend {

	public static void add(String friendEmail, UserData user){
		
		ConnectorFile conector = new ConnectorFile();
		conector.AddMySQLData("INSERT INTO `amizade`(`uti1`, `uti2`) VALUES ('"+user.getEmail()+"','"+friendEmail+"')");
		
	}
	
}
