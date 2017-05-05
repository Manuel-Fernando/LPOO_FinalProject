package client; 

import java.net.InetAddress;
import java.sql.ResultSet;
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
				}
		}catch (Exception e1){
			e1.printStackTrace();
		}	
		return 1; 
	}
	
}