package client;

import client.UserData;

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
		this.user = user;
	}

	/**
	 * M�todo para requisitar uma permiss�o de login ao servidor
	 * @return accepted true caso seja permitido
	 */
	protected Boolean LogInRequest() {
		return true; //******************************************
	}
};
