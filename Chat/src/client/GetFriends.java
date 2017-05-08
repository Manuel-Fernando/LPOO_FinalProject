package client;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import mySQLConnection.ConnectorFile;

public class GetFriends {
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
