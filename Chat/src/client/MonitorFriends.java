package client;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.TimerTask;

import Gui.ChatMenu;
import mySQLConnection.ConnectorFile;

public class MonitorFriends extends TimerTask{
	
	private UserData user;
	
	public MonitorFriends(UserData user)
	{
		this.user = user;
	}

	public void run(){
		ArrayList<FriendData> amigos = user.getFriendsList().getFriendsList();
		if(amigos!=null){

			String sql = "SELECT `email`, `nome`, `conectado`, `IP` FROM `utilizador` WHERE 0";
			ConnectorFile conector = new ConnectorFile();
			FriendData friend;
			ArrayList<FriendData> friends = new ArrayList<FriendData>();

			for(FriendData temp : amigos){ 
				sql=sql + " or `email` = '" + temp.getEmail() + "'";
			}
			try {
				ResultSet rs = conector.SearchMySQLData(sql);
				while (rs.next()){	
					friend = new FriendData(rs.getString("nome"), rs.getString("email") , rs.getString("IP"), rs.getString("conectado"));
					friends.add(friend);
				}
			} catch (SQLException e) {e.printStackTrace();}

			Friends friendsList = new Friends(friends);
			user.setFriendsList(friendsList);	
			
		}
		
//		
//		for (int i=0;i<user.getFriendsList().getFriendsList().size();i++){
//			System.out.println(user.getFriendsList().getFriendsList().get(i));
//		}
//		
		
		ChatMenu.updateList();
	}
}
