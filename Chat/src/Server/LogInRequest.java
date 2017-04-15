package Server;

import Client.LogIn;

/**
 * Classe que guarda a informação sobre o pedido de logIn
 * @author Utilizador
 */
public class LogInRequest {
	
	/**
	 * Atributo que guarda informação acerca do logIn
	 */
	public LogIn login;

	/**
	 * Contrutor da classe
	 * @param login LogIn com a informação de logIn
	 */
	public LogInRequest(LogIn login) {
		super();
		this.login = login;
	}

	/**
	 * Método para obter a informação sobre o logIn
	 * @return LogIn com a informação sobre o logIn
	 */
	public LogIn getLogin() {
		return login;
	}

	/**
	 * Método para atribuir a informação sobre o logIn
	 * @param login LogIn com a informação sobre o login
	 */
	public void setLogin(LogIn login) {
		this.login = login;
	}

	/**
	 * Método para verificar se o login foi efetuado com sucesso
	 * @return success true caje o login tenha sido feito com sucesso
	 */
	public Boolean logInAccepted() {
		return true; //**************************************************
	}
};
