package Client;

import java.util.ArrayList;

import Client.FriendData;

/**
 * Classe que guarda uma lista de todos os amigos de um cliente
 * @author Utilizador
 */
public class Friends {
	
	/**
	 * Atributo que guarda todos os amigos
	 */
	private ArrayList<FriendData> friendsList = new ArrayList<FriendData>();

	/**
	 * Construtor da classe
	 * @param friendsList ArrayList<FriendData> com a lista de amigos
	 */
	public Friends(ArrayList<FriendData> friendsList) {
		super();
		this.friendsList = friendsList;
	}

	/**
	 * Método para obter a lista de amigos
	 * @return ArrayList<FriendData> com a lista de amigos
	 */
	public ArrayList<FriendData> getFriendsList() {
		return friendsList;
	}

	/**
	 * Método para atribuir uma lista de amigos
	 * @param friendsList FriendData[] com a lista de amigos
	 */
	public void setFriendsList(ArrayList<FriendData> friendsList) {
		this.friendsList = friendsList;
	}

	/**
	 * Método para adicionar um novo amigo à lista
	 * @param friend FriendData com o amigo a adicionar 
	 */
	public void addFriend(FriendData friend) {
		friendsList.add(friend);
	}

	/**
	 * Método que remove um amigo da lista de amigos
	 * @param friend FriendData com o amigo a remover
	 */
	public void removeFriend(FriendData friend) {
		friendsList.removeIf(i -> i==friend);
	}
};
