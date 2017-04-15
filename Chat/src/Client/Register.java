package Client;

import Client.UserData;

/**
 * Classe que guarda a informação para o registo do cliente
 * @author Utilizador
 */
public class Register {
	
	/**
	 * Atributo que guarda a informação sobre o cliente
	 */
	private UserData user;

	/**
	 * Construtor da classe
	 * @param user UserData coma informação sobre o cliente
	 */
	public Register(UserData user) {
		super();
		this.user = user;
	}

	/**
	 * Método para obter a informação sobre o cliente
	 * @return UserData com a informação sobre o cliente
	 */
	public UserData getUser() {
		return user;
	}

	/**
	 * Método para atribuir informação acerca do cliente
	 * @param user UserData com a informação acerca do cliente
	 */
	public void setUser(UserData user) {
		this.user = user;
	}

	/**
	 * Método para requisitar permissão para o registo
	 * @return accepted true caso seja feita com sucesso
	 */
	public Boolean RegisterRequest() {
		return true; //***************************************************************
	}
};
