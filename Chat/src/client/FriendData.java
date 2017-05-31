package client;

/**
 * Classe que guarda informa��ess sobre um amigo do cliente
 * @author Carolina e Manuel
 */
public class FriendData {
	
	private String name;

	private String email;
	
	private String ip;
	
	private String conectado;

	/**
	 * M�todo para retornar o ip
	 * @return String com o ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * M�todo para atribuir um ip
	 * @param ip String com o ip
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * M�todo para retornar o estado (online ou offline)
	 * @return String com o estado
	 */
	public String getConectado() {
		return conectado;
	}

	/**
	 * M�todo para atribuir um estado (online ou offline)
	 * @param conectado String com o estado
	 */
	public void setConectado(String conectado) {
		this.conectado = conectado;
	}

	/**
	 * Construtor da classe
	 * @param name String com o nome do amigo
	 * @param email String com o email do amigo
	 * @param ip String com o ip do amigo
	 * @param conectado String com o estado do amigo
	 */
	public FriendData(String name, String email, String ip, String conectado) {
		super();
		this.name = name;
		this.email = email;
		this.ip = ip;
		this.conectado = conectado;
	}

	/**
	 * M�todo para obter o nome
	 * @return String com o nome
	 */
	public String getName() {
		return name;
	}

	/**
	 * M�todo que atribui um nome
	 * @param name String com o nome
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * M�todo para obter o email
	 * @return String com o email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * M�todo que atribui um email
	 * @param email String com o email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

};
