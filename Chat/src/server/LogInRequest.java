package server;

import client.LogIn;

/**
 * Classe que guarda a informa��o sobre o pedido de logIn
 * @author Utilizador
 */
public class LogInRequest {
	
	/**
	 * Atributo que guarda informa��o acerca do logIn
	 */
	public LogIn login;

	/**
	 * Contrutor da classe
	 * @param login LogIn com a informa��o de logIn
	 */
	public LogInRequest(LogIn login) {
		super();
		this.login = login;
	}

	/**
	 * M�todo para obter a informa��o sobre o logIn
	 * @return LogIn com a informa��o sobre o logIn
	 */
	public LogIn getLogin() {
		return login;
	}

	/**
	 * M�todo para atribuir a informa��o sobre o logIn
	 * @param login LogIn com a informa��o sobre o login
	 */
	public void setLogin(LogIn login) {
		this.login = login;
	}

	/**
	 * M�todo para verificar se o login foi efetuado com sucesso
	 * @return success true caje o login tenha sido feito com sucesso
	 */
	public Boolean logInAccepted() {
		return true; //**************************************************
	}
};
