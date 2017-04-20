package server;

import java.util.ArrayList;

import client.UserData;

/**
 * Classe que guarda a informa��o a guarda na base de dados
 */
public class SQLInformations {
	
	/**
	 * Atributo que guarda a lista do clientes online
	 */
	private ArrayList<UserData> onlineUsers = new ArrayList<UserData>();
	
	/**
	 * M�todo que adiciona um cliente � lista de clientes online
	 * @param user UserData com a informa��o acerca do cliente
	 */
	public void addUser(UserData user){
		onlineUsers.add(user);
	}

};
