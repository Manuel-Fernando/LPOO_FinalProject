package client;

import java.sql.SQLException;

import mySQLConnection.ConnectorFile;

/**
 * Classe que guarda a informa��o de LogOut do cliente
 * @author Utilizador 
 */
public class LogOut {
	
	/**
	 * M�todo para requisitar permiss�o para logOut
	 * @return accepted true caso seja permitido
	 */
	public void logOutRequest(UserData user) {
		ConnectorFile conector = new ConnectorFile();
		try {
			conector.AddMySQLData("UPDATE `utilizador` SET `conectado`='offline', `IP`='NULL' WHERE email = '"+user.getEmail()+"'");
		} catch (SQLException e) {e.printStackTrace();}
	user=null;
	}
}
