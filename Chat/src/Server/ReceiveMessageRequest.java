package Server;

import Client.SendMessage;
import Client.UserData;

/**
 * Classe que guarda informação sobre os pedidos acerca das mensagens recebidas
 * @author Utilizador
 */
public class ReceiveMessageRequest {
	
	/**
	 * Atributo que guarda informação acerca da mensagem a enviar
	 */
	private SendMessage message;
	
	/**
	 * Atributo que guarda informação acerca do cliente
	 */
	private UserData client;

	/**
	 * Construtor da classe
	 * @param message SendMessage com a informação acerca da mensagem a enviar
	 * @param client UserData com a informação acerca do cliente
	 */
	public ReceiveMessageRequest(SendMessage message, UserData client) {
		super();
		this.message = message;
		this.client = client;
	}

	/**
	 * Método para obter a informação acerca da mensagem
	 * @return SendMessage com a informação acerca da mensagem
	 */
	public SendMessage getMessage() {
		return message;
	}

	/**
	 * Método para atribuir a informação acerca da mensagem
	 * @param message SendMessage com a informação acerca da mensagem
	 */
	public void setMessage(SendMessage message) {
		this.message = message;
	}

	/**
	 * Método para obter a informação acerca do cliente
	 * @return UserData com a informação acerca do cliente
	 */
	public UserData getClient() {
		return client;
	}

	/**
	 * Método para atribuir informação ao cliente
	 * @param client UserData com a informação acerca do cliente
	 */
	public void setClient(UserData client) {
		this.client = client;
	}

	/**
	 * Método para verificar se a permissão foi dada com sucesso
	 * @return success true caso seja permitido
	 */
	public Boolean received() {
		return true; //**************************************
	}
};
