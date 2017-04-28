package client;

/**
 * Classe que guarda a informaï¿½ï¿½o de cada cliente
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
	public UserData(String email, String userName, String password) {
		super();
		this.email = email;
		this.userName = userName;
		this.password = password;
	}

	/**
	 * Mï¿½todo para obter o email do cliente
	 * @return String com o email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Mï¿½todo para atribuir um email ao cliente
	 * @param email String com o email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Mï¿½todo para obter o nome de utilizador do cliente
	 * @return String com o nome do cliente
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * Mï¿½todo para atribuir um nome ao cliente
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * Mï¿½todo para obter a password do cliente
	 * @return String com a password do cliente
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * Mï¿½todo para atribuir uma password ao cliente
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
	 * Método para obter a porta
	 * @return int com a porta
	 */
	public int getPortNumber() {
		return portNumber;
	}
	
	/**
	 * Método para atribuir a porta ao cliente
	 * @param portNumber inteiro com a porta
	 */
	public void setPortNumber(int portNumber) {
		this.portNumber = portNumber;
	}

};
