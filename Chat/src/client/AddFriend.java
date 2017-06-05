package client;

import mySQLConnection.ConnectorFile;

/**
 * Classe para adicionar uma dado amigo � lista de amigos do utilizador
 * @author Carolina e Manuel
 *
 */
public class AddFriend {

	/**
	 * M�todo que insere uam nova entrada na base de dados de forma a adicionar o amigo � lista de amigos
	 * @param friendEmail String com o email do amigo
	 * @param user UserData com utilizador
	 */
	public static void add(String friendEmail, UserData user){
		
		ConnectorFile conector = new ConnectorFile();
		conector.AddMySQLData("INSERT INTO `amizade`(`uti1`, `uti2`) VALUES ('"+user.getEmail()+"','"+friendEmail+"')");
		conector.AddMySQLData("INSERT INTO `amizade`(`uti1`, `uti2`) VALUES ('"+friendEmail+"','"+user.getEmail()+"')");
		
	}
	
}
