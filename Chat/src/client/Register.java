package client;

import client.UserData;

/**
 * Classe que guarda a informa��o para o registo do cliente
 * @author Utilizador
 */
public class Register {
	
	/**
	 * Atributo que guarda a informa��o sobre o cliente
	 */
	private UserData user;

	/**
	 * Construtor da classe
	 * @param user UserData coma informa��o sobre o cliente
	 */
	public Register(UserData user) {
		super();
		this.user = user;
	}

	/**
	 * M�todo para obter a informa��o sobre o cliente
	 * @return UserData com a informa��o sobre o cliente
	 */
	public UserData getUser() {
		return user;
	}

	/**
	 * M�todo para atribuir informa��o acerca do cliente
	 * @param user UserData com a informa��o acerca do cliente
	 */
	public void setUser(UserData user) {
		this.user = user;
	}

	/**
	 * M�todo para requisitar permiss�o para o registo
	 * @return accepted true caso seja feita com sucesso
	 */
	public Boolean RegisterRequest() {
		return true; //***************************************************************
	}
};
