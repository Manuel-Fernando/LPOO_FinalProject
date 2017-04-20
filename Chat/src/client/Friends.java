package client;

import java.util.ArrayList;

import client.FriendData;

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
	 * M�todo para obter a lista de amigos
	 * @return ArrayList<FriendData> com a lista de amigos
	 */
	public ArrayList<FriendData> getFriendsList() {
		return friendsList;
	}

	/**
	 * M�todo para atribuir uma lista de amigos
	 * @param friendsList FriendData[] com a lista de amigos
	 */
	public void setFriendsList(ArrayList<FriendData> friendsList) {
		this.friendsList = friendsList;
	}

	/**
	 * M�todo para adicionar um novo amigo � lista
	 * @param friend FriendData com o amigo a adicionar 
	 */
	public void addFriend(FriendData friend) {
		friendsList.add(friend);
	}

	/**
	 * M�todo que remove um amigo da lista de amigos
	 * @param friend FriendData com o amigo a remover
	 */
	public void removeFriend(FriendData friend) {
		friendsList.removeIf(i -> i==friend);
	}
};
