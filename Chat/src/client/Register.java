package client;

import java.sql.ResultSet;

import client.UserData;
import mySQLConnection.ConnectorFile;

/**
 * Classe é responsável por fazer o registo do utilizador
 * @author Carolina e Manuel
 */
public class Register {

	/**
	 * Método para requisitar permissão para o registo
	 * @return 1 - Email já existe; 2 - Email ainda não existe; 3 - Erro; 4 - Password não válida
	 */
	public static int RegisterRequest(UserData user) {

		try {
			ConnectorFile conector = new ConnectorFile();		
			ResultSet rs = conector.SearchMySQLData("SELECT email FROM utilizador WHERE email = '" + user.getEmail() + "' ");
			
			if (rs.isBeforeFirst() ) {    
				return 1;
			} else if (user.getPassword()==null || user.getEmail().equals("") || user.getUserName().equals("")) {
				return 4;

			} else {
				String sql = "INSERT INTO utilizador (email, nome, password)" + "VALUES ('"+user.getEmail()+"', '"+user.getUserName()+"', '"+user.getPassword()+"')";

				conector.AddMySQLData(sql);
				return 2;
			}
		} catch (Exception e1) {
			return 3;
		}

	}
}