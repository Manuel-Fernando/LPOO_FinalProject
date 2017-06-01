package client;

import java.sql.ResultSet;
import java.sql.SQLException;

import mySQLConnection.ConnectorFile;
 
/**
 * Classe usada para alterar a informação do utilizador
 * @author Carolina e Manuel
 *
 */
public class Change {

	/**
	 * Método estático para alterar o nome do utilizador na base de dados
	 * @param newName String com o novo nome a ser guardado
	 * @param user UserData com utilizador
	 * @return UserData com a informação atualizada
	 */
	public static UserData userName(String newName, UserData user){
		
		ConnectorFile conector = new ConnectorFile();
		String sql ="UPDATE `utilizador` SET `nome`='"+newName+"' WHERE `email` = '"+user.getEmail()+"'";
		conector.AddMySQLData(sql);
		user.setUserName(newName);
		return user;
	}
	
	/**
	 * Método estático para alterar a palavra-passe do utilizador na base de dados
	 * @param newPass String com a nova palavra-passe a guardar
	 * @param user UserData com o utilizador
	 * @return UserData com a informação atualizada
	 */
	public static UserData password(String newPass, UserData user){
		ConnectorFile conector = new ConnectorFile();
		String sql ="UPDATE `utilizador` SET `password`='"+newPass+"' WHERE `email` = '"+user.getEmail()+"'";
		conector.AddMySQLData(sql);
		user.setPassword(newPass);
		return user;
	}

	/**
	 * Método estático para alterar o email do utilizador na base de dados
	 * @param newEmail String com o novo email a guardar
	 * @param user UserData com o utilizador
	 * @return int: 1 - alteração com sucesso
	 * -1 - email já existe
	 * -2 - erro na ligação
	 */
	public static int email(String newEmail, UserData user){
		ConnectorFile conector = new ConnectorFile();
		String sql ="SELECT `email` FROM `utilizador` WHERE `email` = '"+newEmail+"'";
		try {
			ResultSet rs = conector.SearchMySQLData(sql);
			if (!rs.isBeforeFirst()){
				System.out.println("1");
				sql ="UPDATE `utilizador` SET `email`='"+newEmail+"' WHERE `email` = '"+user.getEmail()+"'";
				conector.AddMySQLData(sql);
				user.setEmail(newEmail);
			}
			else {
				System.out.println("2");
				return -1;
			}
		} catch (SQLException e) {return -2;}
		return 1;
	}
}
