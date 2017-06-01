package mySQLConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Classe que faz a ligação à base de dados
 * @author Carolina e Manuel
 *
 */
public class ConnectorFile {

	static Connection con = null;

	/**
	 * Construtor da classe
	 */
	public ConnectorFile() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Falha ao ler SQL driver!");
		}

		String url = "jdbc:mysql://db.fe.up.pt/ee12314";
		String user = "ee12314";
		String password = "UmcPYB4Nr";


		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("Falha ao conectar com a base de dados!");
			}
		if (con == null) {
			System.out.println("NÃ£o conectado com a base de dados!");
			}
	}

	/**
	 * Método para enviar instruções à base de dados
	 * @param command String com o comando SQL
	 */
	public void AddMySQLData( String command) {
		try {
			PreparedStatement statement = con.prepareStatement(command);
			statement.execute();
		} catch (SQLException e) {
			System.out.println("Erro na Base de dados!");
		}
	}

	/**
	 * Método para pesquisar informação na base de dados
	 * @param command String com o comando SQL
	 * @return ResultSet com os resultados da pesquisa obtidos
	 */
	public ResultSet SearchMySQLData(String command) {
		ResultSet result = null;
		try {
			PreparedStatement statement = con.prepareStatement(command);
			result = statement.executeQuery();
		} catch (SQLException e) {
			System.out.println("Erro na Base de dados!");
		}
		return result;	
	}
}