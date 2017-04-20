package client;

/**
 * Classe que guarda informa��es sobre um amigo do cliente
 * @author Utilizador
 */
public class FriendData {
	
	/**
	 * Atributo que guarda o nome do amigo
	 */
	private String name;
	
	/**
	 * Atributo que guarda o email do amigo
	 */
	private String email;

	/**
	 * Construtor da classe
	 * @param name String com o nome do cliente
	 * @param email String com o email do cliente
	 */
	public FriendData(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	/**
	 * M�todo para obter o nome do amigo
	 * @return String com o nome do amigo
	 */
	public String getName() {
		return name;
	}

	/**
	 * M�todo que atribui um nome ao amigo
	 * @param name String com o nome do amigo
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * M�todo para obter o email do amigo
	 * @return String com o email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * M�todo que atribui um email ao amigo
	 * @param email String com o email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

};
