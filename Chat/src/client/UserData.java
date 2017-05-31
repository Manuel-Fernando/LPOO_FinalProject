package client;

/**
 * Classe que guarda a informação de cada utilizador
 * @author Carolina e Manuel
 */
public class UserData {

	private String email;

	private String userName;

	private String password;

	private String ipAddress;
	
	private Friends friendsList;
	
	/**
	 * Construtor da classe
	 * @param email String com o email do cliente
	 * @param password String com a password do cliente
	 */
	public UserData(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	/**
	 * Método para obter o email do cliente
	 * @return String com o email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Método para atribuir um email ao cliente
	 * @param email String com o email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Método para obter o nome de utilizador do cliente
	 * @return String com o nome do cliente
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * Método para atribuir um nome ao cliente
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * Método para obter a password do cliente
	 * @return String com a password do cliente
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * Método para atribuir uma password ao cliente
	 * @param password String com a nova password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Método para obter o ip do cliente
	 * @return String com o ip
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * Método para atribuir um ip ao cliente
	 * @param ipAddress com o ip
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	/**
	 * Método para retornar a lista de amigos do utilizador
	 * @return Friends com os amigos do utilizador
	 */
	public Friends getFriendsList() {
		return friendsList;
	}

	/**
	 * Método para atribuir uma lista de amigos ao utilizador
	 * @param friendsList Friends com os amigos a atribuir ao utilizador
	 */
	public void setFriendsList(Friends friendsList) {
		this.friendsList=null;
		this.friendsList = friendsList;
	}
	
	
}
