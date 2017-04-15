package Client;

import Client.FriendData;

/**
 * Classe que guarda informação sobre a mensagem a enviar
 * @author Utilizador
 */
public class SendMessage {
	
	/**
	 * Atributo para guarda a mensagem a enviar
	 */
	private String message;
	
	/**
	 * Atributo para guarda a informação acerca do amigo 
	 */
	public FriendData friend;
	
	/**
	 * Construtor da classe
	 * @param message String com a mensagem
	 * @param friend FriendData com a informação acerca do amigo
	 */
	public SendMessage(String message, FriendData friend) {
		super();
		this.message = message;
		this.friend = friend;
	}

	/**
	 * Método para obter a mensagem 
	 * @return String com a mensagem
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Método para atribuir a mensagem a enviar
	 * @param message String com a mensagem
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Método para obter a informação sobre o amigo
	 * @return FriendData com a informação sobre o amigo
	 */
	public FriendData getFriend() {
		return friend;
	}

	/**
	 * Método que atribui informação acerca do amigo
	 * @param friend FriendData com a informação acerca do amigo
	 */
	public void setFriend(FriendData friend) {
		this.friend = friend;
	}

	/**
	 * Método para verifica se a mensagem foi enviada com sucesso
	 * @return success true caso tenha sido enviada com sucesso
	 */
	public Boolean send() {
		return true; //******************************************************
	}
};
