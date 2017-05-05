package client;

import java.sql.ResultSet;

import client.UserData;
import mySQLConnection.ConnectorFile;

/**
 * Classe que guarda a informa��o para o registo do cliente
 * @author Utilizador
 */
public class Register {

	/**
	 * M�todo para requisitar permiss�o para o registo
	 * @return 1 - Email j� existe; 2 - Email ainda n�o existe; 3 - Erro; 4 - Password n�o v�lida
	 */
	public static int RegisterRequest(UserData user) {

		try {
			ConnectorFile conector = new ConnectorFile();		
			ResultSet rs = conector.SearchMySQLData("SELECT email FROM utilizador WHERE email = '" + user.getEmail() + "' ");

			if (rs.isBeforeFirst() ) {    
				return 1;
			} else if (user.getPassword().equals("") || user.getEmail().equals("") || user.getUserName().equals("")) {
				return 4;

			} else {
				if (user.getEmail()!=null && user.getPassword()!=null && user.getUserName()!=null){
					if (!user.getEmail().isEmpty() && !user.getPassword().isEmpty() && !user.getUserName().isEmpty()){
						String sql = "INSERT INTO utilizador (email, nome, password)" + "VALUES ('"+user.getEmail()+"', '"+user.getUserName()+"', '"+user.getPassword()+"')";

						conector.AddMySQLData(sql);
					}
				}
				return 2;
			}
		} catch (Exception e1) {
			e1.printStackTrace();
			return 3;
		}

	}
}