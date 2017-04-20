package client;

import client.FriendData;

/**
 * Classe que guarda a informa��o acerca da mensagem recebida
 * @author Utilizador
 */
public class ReceiveMessage {
	
	/**
	 * Atributo que guarda a mensagem recebida 
	 */
	public String message;
	
	/**
	 * Atributo que guarda a informa��o sobre o amigo que envia a mensagem
	 */
	public FriendData friend;

	/**
	 * Construtor da classe
	 * @param message String com a mensagem recebida
	 * @param friend FriendData com informa��o sobre o amigo
	 */
	public ReceiveMessage(String message, FriendData friend) {
		super();
		this.message = message;
		this.friend = friend;
	}

	/**
	 * M�todo para obter a mensagem recebida
	 * @return String com a mensagem
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * M�todo para atribuir a mensagem recebida
	 * @param message String com a mensagem 
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * M�todo para obter o amigo 
	 * @return FriendData com a informa��o do amigo
	 */
	public FriendData getFriend() {
		return friend;
	}

	/**
	 * M�todo para atribuir um amigo � mensagem
	 * @param friend FriendData com a informa��o do amigo
	 */
	public void setFriend(FriendData friend) {
		this.friend = friend;
	}

	/**
	 * M�todo que verificar se a mensagem foi recebida com sucesso
	 * @return success true caso seja recebi com sucesso
	 */
	public Boolean receive() {
		return true; //**********************************************
	}
};
