package Server;

import Client.UserData;

/**
 * Classe que guarda a informação sobre o cliente a registar no servidor
 * @author Utilizador
 */
public class AcceptClients {
	
	/**
	 * Atributo que guarda informação sobre o cliente
	 */
	private UserData client;
	
	/**
	 * Construtor da classe
	 * @param client UserData com a informação do cliente a registar
	 */
	public AcceptClients(UserData client) {
		super();
		this.client = client;
	}

	/**
	 * Método para obter a informação sobre o cliente
	 * @return UserData com a informação sobre o cliente
	 */
	public UserData getClient() {
		return client;
	}

	/**
	 * Método que atribui informação ao cliente
	 * @param client UserData com a informação do cliente
	 */
	public void setClient(UserData client) {
		this.client = client;
	}

	/**
	 * Método que verifica se o registo foi efetuado com sucesso
	 * @return success true caso o registo tenha sido feito com sucesso
	 */
	public Boolean accepted() {
		return true; //*************************************
	}
};
