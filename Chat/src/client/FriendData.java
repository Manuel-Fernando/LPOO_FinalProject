package client;

/**
 * Classe que guarda informaçõess sobre um amigo do cliente
 * @author Carolina e Manuel
 */
public class FriendData {
	
	private String name;

	private String email;
	
	private String ip;
	
	private String conectado;

	/**
	 * Método para retornar o ip
	 * @return String com o ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * Método para atribuir um ip
	 * @param ip String com o ip
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * Método para retornar o estado (online ou offline)
	 * @return String com o estado
	 */
	public String getConectado() {
		return conectado;
	}

	/**
	 * Método para atribuir um estado (online ou offline)
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
	 * Método para obter o nome
	 * @return String com o nome
	 */
	public String getName() {
		return name;
	}

	/**
	 * Método que atribui um nome
	 * @param name String com o nome
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Método para obter o email
	 * @return String com o email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Método que atribui um email
	 * @param email String com o email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

};
