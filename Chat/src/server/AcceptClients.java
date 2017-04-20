package server;

import client.UserData;

/**
 * Classe que guarda a informa��o sobre o cliente a registar no servidor
 * @author Utilizador
 */
public class AcceptClients {
	
	/**
	 * Atributo que guarda informa��o sobre o cliente
	 */
	private UserData client;
	
	/**
	 * Construtor da classe
	 * @param client UserData com a informa��o do cliente a registar
	 */
	public AcceptClients(UserData client) {
		super();
		this.client = client;
	}

	/**
	 * M�todo para obter a informa��o sobre o cliente
	 * @return UserData com a informa��o sobre o cliente
	 */
	public UserData getClient() {
		return client;
	}

	/**
	 * M�todo que atribui informa��o ao cliente
	 * @param client UserData com a informa��o do cliente
	 */
	public void setClient(UserData client) {
		this.client = client;
	}

	/**
	 * M�todo que verifica se o registo foi efetuado com sucesso
	 * @return success true caso o registo tenha sido feito com sucesso
	 */
	public Boolean accepted() {
		return true; //*************************************
	}
};
