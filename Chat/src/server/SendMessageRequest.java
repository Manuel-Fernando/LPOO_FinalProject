package server;

import client.SendMessage;
import client.UserData;

/**
 * Classe que guarda o pedido de envio de mensagem
 * @author Utilizador
 */
public class SendMessageRequest {
	
	/**
	 * Atributo que guarda a informa��o acerca da mensagem a enviar
	 */
	private SendMessage message;
	
	/**
	 * Atributo que guarda a informa��o acerca do cliente
	 */
	private UserData client;
	
	/**
	 * Construtor da classe
	 * @param message SendMessage com a informa��o da mensagem a enviar
	 * @param client UserData com a informa��o acerca do cliente
	 */
	public SendMessageRequest(SendMessage message, UserData client) {
		super();
		this.message = message;
		this.client = client;
	}

	/**
	 * M�todo para obter a informa��o acerca da mensagem a enviar
	 * @return SendMessage com a informa��o acerca da mensagem
	 */
	public SendMessage getMessage() {
		return message;
	}

	/**
	 * M�todo para atribuir a informa��o acerca da mensagem a enviar
	 * @param message SendMessage com a informa��o acerca da mensagem
	 */
	public void setMessage(SendMessage message) {
		this.message = message;
	}

	/**
	 * M�todo para obter a informa��o sobre o cliente
	 * @return UserData com a informa��o acerca do cliente
	 */
	public UserData getClient() {
		return client;
	}

	/**
	 * M�todo para atribuir infroma��o acerca do cliente
	 * @param client UserData com a informa��o acerca do cliente
	 */
	public void setClient(UserData client) {
		this.client = client;
	}

	/**
	 * M�todo para verificar se o pedido foi efetuado com sucesso
	 * @param success true caso o pedido seja efetuado com sucesso
	 */
	public Boolean sent() {
		return true;
	}
};
