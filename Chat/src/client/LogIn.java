package client;

import java.sql.Connection;
import java.sql.ResultSet;

import client.UserData;
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
	public int LogInRequest(UserData user) {
		try{
			Connection conector = ConnectorFile.ConnectToMySQL();
			ResultSet rs = ConnectorFile.SearchMySQLData(conector, "SELECT `password`, `nome`, `num_amigos` FROM utilizador WHERE email = '" + user.getEmail() + "'");
			
			if (!rs.isBeforeFirst()){return -1;}
			else {
				rs.next();
				if(rs.getString("password")!=user.getPassword()){return 0;}
				user.setUserName(rs.getString("nome"));
				user.setNum_amigos(rs.getInt("num_amigos"));
				}

		}catch (Exception e1){
			e1.printStackTrace();
		}	
		return 1; 
	}
	
}