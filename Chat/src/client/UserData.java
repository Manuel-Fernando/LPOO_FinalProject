package client;

/**
 * Classe que guarda a informa��o de cada cliente
 * @author Utilizador
 */
public class UserData {
	
	/**
	 * Atributo que guarda o email do cliente
	 */
	private String email;
	
	/**
	 * Atributo que guarda o nome do cliente
	 */
	private String userName;
	
	private int num_amigos;
	


	/**
	 * Atributo que guarda a password do cliente
	 */
	private String password;
	
	/**
	 * Atributo que guarda o ip do cliente
	 */
	private String ipAddress;
	
	/**
	 * Atributo que guarda a porta
	 */
	private int portNumber;
	
	/**
	 * Construtor da classe
	 * @param email String com o email do cliente
	 * @param userName String com o nome do cliente
	 * @param password String com a password do cliente
	 */
	public UserData(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	public int getNum_amigos() {
		return num_amigos;
	}

	public void setNum_amigos(int num_amigos) {
		this.num_amigos = num_amigos;
	}

	/**
	 * M�todo para obter o email do cliente
	 * @return String com o email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * M�todo para atribuir um email ao cliente
	 * @param email String com o email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * M�todo para obter o nome de utilizador do cliente
	 * @return String com o nome do cliente
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * M�todo para atribuir um nome ao cliente
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * M�todo para obter a password do cliente
	 * @return String com a password do cliente
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * M�todo para atribuir uma password ao cliente
	 * @param password String com a nova password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * M�todo para obter o ip do cliente
	 * @return String com o ip
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * M�todo para atribuir um ip ao cliente
	 * @param ipAddress com o ip
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	/**
	 * M�todo para obter a porta
	 * @return int com a porta
	 */
	public int getPortNumber() {
		return portNumber;
	}
	
	/**
	 * M�todo para atribuir a porta ao cliente
	 * @param portNumber inteiro com a porta
	 */
	public void setPortNumber(int portNumber) {
		this.portNumber = portNumber;
	}

};
