package client;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import mySQLConnection.ConnectorFile;

/**
 * Classe recolher da base de dados todos os amigos de um dado utilizador
 * @author Carolina e Manuel
 *
 */
public class GetFriends {
	
	/**
	 * Método para ir buscar à base de dados a lista de todos os amigos do utilizador
	 * @param conector ConnectorFile com a ligação à base de dados
	 * @param user UserData com o utilizador
	 * @throws SQLException
	 */
	public static void getFriends(ConnectorFile conector, UserData user) throws SQLException{
		
		FriendData friend;
		ArrayList<FriendData> friends = new ArrayList<FriendData>();

		ResultSet rs = conector.SearchMySQLData("SELECT `uti2` FROM `amizade` WHERE `uti1` = '" + user.getEmail() + "'");

		while (rs.next()){					
			friend = new FriendData(null, rs.getString("uti2") , null, null);
			friends.add(friend);

		}

		Friends friendsList = new Friends(friends);

		user.setFriendsList(friendsList);
	}
}
