package Server;

import java.util.ArrayList;

import Client.UserData;

/**
 * Classe que guarda a informação a guarda na base de dados
 */
public class SQLInformations {
	
	/**
	 * Atributo que guarda a lista do clientes online
	 */
	private ArrayList<UserData> onlineUsers = new ArrayList<UserData>();
	
	/**
	 * Método que adiciona um cliente à lista de clientes online
	 * @param user UserData com a informação acerca do cliente
	 */
	public void addUser(UserData user){
		onlineUsers.add(user);
	}

};
