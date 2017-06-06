package client;

import mySQLConnection.ConnectorFile;

/**
 * Classe utilizada para remover amigos da lista de amigos de um dado utilizador
 * @author Carolina e Manuel
 *
 */
public class RemoveFriend {

/**
 * Método estático que remove da base de dados o amigo da lista de amigos
 * @param friendEmail email do amigo a remover
 * @param user utilizador
 */
public static void add(String friendEmail, UserData user){
		
		ConnectorFile conector = new ConnectorFile();
		conector.AddMySQLData("DELETE FROM `amizade` WHERE `uti1` = '" + user.getEmail() + "' AND `uti2` = '" + friendEmail + "'");
		conector.AddMySQLData("DELETE FROM `amizade` WHERE `uti1` = '" + friendEmail + "' AND `uti2` = '" + user.getEmail() + "'");
		
	}
	
}
