package client;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.sql.Connection;

import Gui.ChatMenu;
import client.UserData;
import mySQLConnection.ConnectorFile;

/**
 * Classe que guarda guarda a informa��o para LogIn
 * @author Utilizador
 */
public class LogIn {
	
	/**
	 * Atributo que guarda a informa��o do cliente
	 */
	private UserData user;

	/**
	 * Construtor da classe
	 * @param user UserData com a informa��o do cliente
	 */
	public LogIn(UserData user) {
		super();
		
		try {
			Connection connection = ConnectorFile.ConnectToMySQL();

		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	/**
	 * M�todo para requisitar uma permiss�o de login ao servidor
	 * @return accepted true caso seja permitido
	 */
	public Boolean LogInRequest() {
		return true; //******************************************
	}
};
