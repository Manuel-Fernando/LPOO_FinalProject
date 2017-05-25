package client; 

import java.net.InetAddress;
import java.sql.ResultSet;

import java.util.Timer;
import java.util.TimerTask;

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
			ResultSet rs = conector.SearchMySQLData("SELECT `password`, `nome` FROM utilizador WHERE email = '" + user.getEmail() + "'");

			if (!rs.isBeforeFirst()){return -1;}
			else {
				rs.next();
				if(!rs.getString("password").equals(user.getPassword())){return 0;}
				user.setUserName(rs.getString("nome"));
				String c = InetAddress.getLocalHost().getHostAddress();
				conector.AddMySQLData("UPDATE `utilizador` SET `conectado`='online', `IP`='"+ c +"' WHERE email = '"+user.getEmail()+"'");
				
				GetFriends.getFriends(conector, user);				
				
				TimerTask timerTask = new MonitorFriends(user);
		        Timer timer = new Timer(true);
		        timer.scheduleAtFixedRate(timerTask, 0, 10*1000);
		        
			}

		}catch (Exception e1){
			e1.printStackTrace();
			return 2;
		}	
		return 1; 
	}	
}