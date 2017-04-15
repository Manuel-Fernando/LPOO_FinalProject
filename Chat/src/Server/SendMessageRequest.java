package Server;

import Client.SendMessage;
import Client.UserData;

/**
 * Classe que guarda o pedido de envio de mensagem
 * @author Utilizador
 */
public class SendMessageRequest {
	
	/**
	 * Atributo que guarda a informação acerca da mensagem a enviar
	 */
	private SendMessage message;
	
	/**
	 * Atributo que guarda a informação acerca do cliente
	 */
	private UserData client;
	
	/**
	 * Construtor da classe
	 * @param message SendMessage com a informação da mensagem a enviar
	 * @param client UserData com a informação acerca do cliente
	 */
	public SendMessageRequest(SendMessage message, UserData client) {
		super();
		this.message = message;
		this.client = client;
	}

	/**
	 * Método para obter a informação acerca da mensagem a enviar
	 * @return SendMessage com a informação acerca da mensagem
	 */
	public SendMessage getMessage() {
		return message;
	}

	/**
	 * Método para atribuir a informação acerca da mensagem a enviar
	 * @param message SendMessage com a informação acerca da mensagem
	 */
	public void setMessage(SendMessage message) {
		this.message = message;
	}

	/**
	 * Método para obter a informação sobre o cliente
	 * @return UserData com a informação acerca do cliente
	 */
	public UserData getClient() {
		return client;
	}

	/**
	 * Método para atribuir infromação acerca do cliente
	 * @param client UserData com a informação acerca do cliente
	 */
	public void setClient(UserData client) {
		this.client = client;
	}

	/**
	 * Método para verificar se o pedido foi efetuado com sucesso
	 * @param success true caso o pedido seja efetuado com sucesso
	 */
	public Boolean sent() {
		return true;
	}
};
