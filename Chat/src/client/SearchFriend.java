package client;

import java.util.ArrayList;

			/*		ArrayList<FriendData> x = SearchFriend.Search("12");
					for(FriendData o:x){
						System.out.println(o.getEmail()+" "+o.getName());
					}*/

import java.sql.ResultSet;
import java.sql.SQLException;
import mySQLConnection.ConnectorFile;

public class SearchFriend {

	public static ArrayList<FriendData> Search(String procura, UserData user) {

		FriendData friend;
		ArrayList<FriendData> friends = new ArrayList<FriendData>();
		ResultSet rs = null;

		ConnectorFile conector = new ConnectorFile();
		try {
			rs = conector.SearchMySQLData("SELECT `nome`, `email` FROM utilizador WHERE email LIKE '%" + procura + "%' OR nome LIKE '%"+procura+"%'");
			if (!rs.isBeforeFirst()){return null;}
			else {
				while (rs.next()){	
					if(!user.getEmail().equals(rs.getString("email"))){
						friend = new FriendData(rs.getString("nome"), rs.getString("email") , null, null);
						friends.add(friend);
					}
				}
			}
		} catch (SQLException e) {e.printStackTrace();}
		return friends;
	}
}
