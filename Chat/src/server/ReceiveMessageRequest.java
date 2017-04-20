package server;

import client.SendMessage;
import client.UserData;

/**
 * Classe que guarda informa��o sobre os pedidos acerca das mensagens recebidas
 * @author Utilizador
 */
public class ReceiveMessageRequest {
	
	/**
	 * Atributo que guarda informa��o acerca da mensagem a enviar
	 */
	private SendMessage message;
	
	/**
	 * Atributo que guarda informa��o acerca do cliente
	 */
	private UserData client;

	/**
	 * Construtor da classe
	 * @param message SendMessage com a informa��o acerca da mensagem a enviar
	 * @param client UserData com a informa��o acerca do cliente
	 */
	public ReceiveMessageRequest(SendMessage message, UserData client) {
		super();
		this.message = message;
		this.client = client;
	}

	/**
	 * M�todo para obter a informa��o acerca da mensagem
	 * @return SendMessage com a informa��o acerca da mensagem
	 */
	public SendMessage getMessage() {
		return message;
	}

	/**
	 * M�todo para atribuir a informa��o acerca da mensagem
	 * @param message SendMessage com a informa��o acerca da mensagem
	 */
	public void setMessage(SendMessage message) {
		this.message = message;
	}

	/**
	 * M�todo para obter a informa��o acerca do cliente
	 * @return UserData com a informa��o acerca do cliente
	 */
	public UserData getClient() {
		return client;
	}

	/**
	 * M�todo para atribuir informa��o ao cliente
	 * @param client UserData com a informa��o acerca do cliente
	 */
	public void setClient(UserData client) {
		this.client = client;
	}

	/**
	 * M�todo para verificar se a permiss�o foi dada com sucesso
	 * @return success true caso seja permitido
	 */
	public Boolean received() {
		return true; //**************************************
	}
};
