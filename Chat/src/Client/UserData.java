package Client;

/**
 * Classe que guarda a informação de cada cliente
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

};
