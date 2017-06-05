package client;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.TimerTask;

import Gui.ChatMenu;
import mySQLConnection.ConnectorFile;

/**
 * Classe que é responsável por monitorizar constantemente o estado dos amigos do utilizador
 * @author Carolina e Manuel
 *
 */
public class MonitorFriends extends TimerTask{
	
	private UserData user;
	
	/**
	 * Contrutor da classe
	 * @param user UserData com o utilizador
	 */
	public MonitorFriends(UserData user)
	{
		this.user = user;
	}

	/**
	 * Método que implementa o run() da thread para estar constantemente 
	 * e verificar o estado dos amigos
	 */
	public void run(){
		ConnectorFile conector = new ConnectorFile(); //////////////////////
		try {
			GetFriends.getFriends(conector, user);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		ArrayList<FriendData> amigos = user.getFriendsList().getFriendsList();

		if(amigos!=null){

			String sql = "SELECT `email`, `nome`, `conectado`, `IP` FROM `utilizador` WHERE 0";

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
		
		ChatMenu.updateList();
	}
}
