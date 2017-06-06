package client;

import mySQLConnection.ConnectorFile;

public class RemoveFriend {

public static void add(String friendEmail, UserData user){
		
		ConnectorFile conector = new ConnectorFile();
		conector.AddMySQLData("DELETE FROM `amizade` WHERE `uti1` = '"+user.getEmail()+"' AND `uti2` = '"+friendEmail+"')");
		conector.AddMySQLData("DELETE FROM `amizade` WHERE `uti1` = '"+friendEmail+"' AND `uti2` = '"+user.getEmail()+"')");
		
	}
	
}
