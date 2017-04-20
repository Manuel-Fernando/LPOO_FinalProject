package client;

import client.FriendData;

/**
 * Classe que guarda informa��o sobre a mensagem a enviar
 * @author Utilizador
 */
public class SendMessage {
	
	/**
	 * Atributo para guarda a mensagem a enviar
	 */
	private String message;
	
	/**
	 * Atributo para guarda a informa��o acerca do amigo 
	 */
	public FriendData friend;
	
	/**
	 * Construtor da classe
	 * @param message String com a mensagem
	 * @param friend FriendData com a informa��o acerca do amigo
	 */
	public SendMessage(String message, FriendData friend) {
		super();
		this.message = message;
		this.friend = friend;
	}

	/**
	 * M�todo para obter a mensagem 
	 * @return String com a mensagem
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * M�todo para atribuir a mensagem a enviar
	 * @param message String com a mensagem
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * M�todo para obter a informa��o sobre o amigo
	 * @return FriendData com a informa��o sobre o amigo
	 */
	public FriendData getFriend() {
		return friend;
	}

	/**
	 * M�todo que atribui informa��o acerca do amigo
	 * @param friend FriendData com a informa��o acerca do amigo
	 */
	public void setFriend(FriendData friend) {
		this.friend = friend;
	}

	/**
	 * M�todo para verifica se a mensagem foi enviada com sucesso
	 * @return success true caso tenha sido enviada com sucesso
	 */
	public Boolean send() {
		return true; //******************************************************
	}
};
