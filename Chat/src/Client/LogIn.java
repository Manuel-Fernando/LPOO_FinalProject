package Client;

import Client.UserData;

/**
 * Classe que guarda guarda a informação para LogIn
 * @author Utilizador
 */
public class LogIn {
	
	/**
	 * Atributo que guarda a informação do cliente
	 */
	private UserData user;

	/**
	 * Construtor da classe
	 * @param user UserData com a informação do cliente
	 */
	public LogIn(UserData user) {
		super();
		this.user = user;
	}

	/**
	 * Método para requisitar uma permissão de login ao servidor
	 * @return accepted true caso seja permitido
	 */
	protected Boolean LogInRequest() {
		return true; //******************************************
	}
};
