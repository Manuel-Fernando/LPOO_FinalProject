package client; 

import java.net.InetAddress;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import mySQLConnection.ConnectorFile;

/**
 * Classe que guarda guarda a informa��o para LogIn
 * @author Utilizador
 */
public class LogIn {


	/**
	 * M�todo para requisitar uma permiss�o de login ao servidor
	 * @return accepted true caso seja permitido
	 */
	public static int LogInRequest(UserData user) {
		
		ConnectorFile conector = new ConnectorFile();

		try{
			ResultSet rs = conector.SearchMySQLData("SELECT `password`, `nome`, `num_amigos` FROM utilizador WHERE email = '" + user.getEmail() + "'");

			if (!rs.isBeforeFirst()){return -1;}
			else {
				rs.next();
				if(!rs.getString("password").equals(user.getPassword())){return 0;}
				user.setUserName(rs.getString("nome"));
				user.setNum_amigos(rs.getInt("num_amigos"));
				String c = InetAddress.getLocalHost().getHostAddress();
				conector.AddMySQLData("UPDATE `utilizador` SET `conectado`='online', `IP`='"+ c +"' WHERE email = '"+user.getEmail()+"'");
				
				getFriends(conector, user);
				
				MonitorFriends monitor = new MonitorFriends(user);
			}

		}catch (Exception e1){
			e1.printStackTrace();
			return 2;
		}	
		return 1; 
	}
	
	public static void getFriends(ConnectorFile conector, UserData user) throws SQLException{
		
		FriendData friend;
		ArrayList<FriendData> friends = new ArrayList<FriendData>();

		ResultSet rs1 = conector.SearchMySQLData("SELECT `uti2` FROM `amizade` WHERE `uti1` = '" + user.getEmail() + "'");

		while (rs1.next()){					
			ResultSet rs3 = conector.SearchMySQLData("SELECT `nome`, `conectado`, `IP` FROM `utilizador` WHERE `email` = '" + rs1.getString("uti2") + "'");

			rs3.next();
			friend = new FriendData(rs3.getString("nome"), rs1.getString("uti2") , rs3.getString("IP"), rs3.getString("conectado"));
			friends.add(friend);

		}

		ResultSet rs2 = conector.SearchMySQLData("SELECT `uti1` FROM `amizade` WHERE `uti2` = '" + user.getEmail() + "'");

		while (rs2.next()){
			ResultSet rs3 = conector.SearchMySQLData("SELECT `nome`, `conectado`, `IP` FROM `utilizador` WHERE `email` = '" + rs2.getString("uti1") + "'");
			rs3.next();
			friend = new FriendData(rs3.getString("nome"), rs2.getString("uti1") , rs3.getString("IP"), rs3.getString("conectado"));

			friends.add(friend);
		}

		Friends friendsList = new Friends(friends);

		user.setFriendsList(friendsList);
	}
	
	
}