package client;

import mySQLConnection.ConnectorFile;

/**
 * Classe que � respons�vel pelo LogOut do utilizador
 * @author Carolina e Manuel 
 */
public class LogOut {
	
	/**
	 * M�todo que altera o estado do utilizador para offline, na base de dados
	 * @param user UserData com o utilizador
	 */
	public static void logOutRequest(UserData user) {
		ConnectorFile conector = new ConnectorFile();
		conector.AddMySQLData("UPDATE `utilizador` SET `conectado`='offline', `IP`='NULL' WHERE email = '"+user.getEmail()+"'");
	user=null;
	}
}
