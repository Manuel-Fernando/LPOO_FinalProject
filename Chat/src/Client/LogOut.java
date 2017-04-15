package Client;

import Client.UserData;

/**
 * Classe que guarda a informação de LogOut do cliente
 * @author Utilizador 
 */
public class LogOut {
	
	/**
	 * Atributo que guarda informação sobre o cliente
	 */
	private UserData user;

	/**
	 * Construtor da classe 
	 * @param user UserData com a informação do cliente
	 */
	public LogOut(UserData user) {
		super();
		this.user = user;
	}

	/**
	 * Método para obter a informação sobre o cliente
	 * @return UserData com a informação do cliente
	 */
	public UserData getUser() {
		return user;
	}

	/**
	 * Método para atribuir informação sobre o cliente
	 * @param user UserData com a informação do cliente
	 */
	public void setUser(UserData user) {
		this.user = user;
	}

	/**
	 * Método para requisitar permissão para logOut
	 * @return accepted true caso seja permitido
	 */
	public Boolean logOutRequest() {
		return true; //*****************************************
	}
};
