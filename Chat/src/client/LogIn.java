package client; 

import java.net.InetAddress;
import java.sql.ResultSet;

import java.util.Timer;
import java.util.TimerTask;

import mySQLConnection.ConnectorFile;

/**
 * Classe que é responsável pelo LogIn
 * @author Carolina e Manuel
 */
public class LogIn {

	/**
	 * Método para requisitar uma permissão de login ao servidor
	 * @return 1 - LogIn com sucesso
	 * -1 - utilizador não existe
	 * 2 - erro no LogIn
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
			return 2;
		}	
		return 1; 
	}	
}