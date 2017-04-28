package client;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import client.UserData;
import mySQLConnection.ConnectorFile;

/**
 * Classe que guarda a informaï¿½ï¿½o para o registo do cliente
 * @author Utilizador
 */
public class Register {
	
	/**
	 * Atributo que guarda a informaï¿½ï¿½o sobre o cliente
	 */
	private UserData user;

	/**
	 * Construtor da classe
	 * @param user UserData coma informaï¿½ï¿½o sobre o cliente
	 */
	public Register(UserData user) {
		super();
		this.user = user;
	}

	/**
	 * Mï¿½todo para obter a informaï¿½ï¿½o sobre o cliente
	 * @return UserData com a informaï¿½ï¿½o sobre o cliente
	 */
	public UserData getUser() {
		return user;
	}

	/**
	 * Mï¿½todo para atribuir informaï¿½ï¿½o acerca do cliente
	 * @param user UserData com a informaï¿½ï¿½o acerca do cliente
	 */
	public void setUser(UserData user) {
		this.user = user;
	}

	/**
	 * Mï¿½todo para requisitar permissï¿½o para o registo
	 * @return 1 - Email já existe; 2 - Email ainda não existe; 3 - Erro; 4 - Password não válida
	 */
	public int RegisterRequest() {
		
		try {
			Connection connection = ConnectorFile.ConnectToMySQL();			
			ResultSet rs = ConnectorFile.SearchMySQLData(connection, "SELECT email FROM utilizador WHERE email = '" + user.getEmail() + "' ");
			
			if (rs.isBeforeFirst() ) {    
			    return 1;
			} else if (user.getPassword().equals("") || user.getEmail().equals("") || user.getUserName().equals("")) {
				return 4;
				
			} else {
				if (user.getEmail()!=null && user.getPassword()!=null && user.getUserName()!=null){
					if (!user.getEmail().isEmpty() && !user.getPassword().isEmpty() && !user.getUserName().isEmpty()){
						String sql = "INSERT INTO utilizador (email, nome, password)" + "VALUES (?, ?, ?)";

						PreparedStatement preparedStatement = connection.prepareStatement(sql);
						preparedStatement.setString(1, user.getEmail());
						preparedStatement.setString(2, user.getPassword());
						preparedStatement.setString(3, user.getUserName());
						preparedStatement.executeUpdate();

					}
				}
				
				return 2;
			}
			
		} catch (Exception e1) {
			e1.printStackTrace();
			return 3;
		}

	}
};
