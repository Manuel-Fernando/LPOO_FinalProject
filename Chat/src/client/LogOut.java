package client;

import client.UserData;

/**
 * Classe que guarda a informa��o de LogOut do cliente
 * @author Utilizador 
 */
public class LogOut {
	
	/**
	 * Atributo que guarda informa��o sobre o cliente
	 */
	private UserData user;

	/**
	 * Construtor da classe 
	 * @param user UserData com a informa��o do cliente
	 */
	public LogOut(UserData user) {
		super();
		this.user = user;
	}

	/**
	 * M�todo para obter a informa��o sobre o cliente
	 * @return UserData com a informa��o do cliente
	 */
	public UserData getUser() {
		return user;
	}

	/**
	 * M�todo para atribuir informa��o sobre o cliente
	 * @param user UserData com a informa��o do cliente
	 */
	public void setUser(UserData user) {
		this.user = user;
	}

	/**
	 * M�todo para requisitar permiss�o para logOut
	 * @return accepted true caso seja permitido
	 */
	public Boolean logOutRequest() {
		return true; //*****************************************
	}
};
