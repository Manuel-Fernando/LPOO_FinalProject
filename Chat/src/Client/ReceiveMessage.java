package Client;

import Client.FriendData;

/**
 * Classe que guarda a informação acerca da mensagem recebida
 * @author Utilizador
 */
public class ReceiveMessage {
	
	/**
	 * Atributo que guarda a mensagem recebida 
	 */
	public String message;
	
	/**
	 * Atributo que guarda a informação sobre o amigo que envia a mensagem
	 */
	public FriendData friend;

	/**
	 * Construtor da classe
	 * @param message String com a mensagem recebida
	 * @param friend FriendData com informação sobre o amigo
	 */
	public ReceiveMessage(String message, FriendData friend) {
		super();
		this.message = message;
		this.friend = friend;
	}

	/**
	 * Método para obter a mensagem recebida
	 * @return String com a mensagem
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Método para atribuir a mensagem recebida
	 * @param message String com a mensagem 
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Método para obter o amigo 
	 * @return FriendData com a informação do amigo
	 */
	public FriendData getFriend() {
		return friend;
	}

	/**
	 * Método para atribuir um amigo à mensagem
	 * @param friend FriendData com a informação do amigo
	 */
	public void setFriend(FriendData friend) {
		this.friend = friend;
	}

	/**
	 * Método que verificar se a mensagem foi recebida com sucesso
	 * @return success true caso seja recebi com sucesso
	 */
	public Boolean receive() {
		return true; //**********************************************
	}
};
