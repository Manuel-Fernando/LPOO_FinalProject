package test;

import static org.junit.Assert.assertEquals;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import client.Change;
import client.LogIn;
import client.LogInFace;
import client.LogOut;
import client.Register;
import client.UserData;
import mySQLConnection.ConnectorFile;

public class TestLogs {
	
	ConnectorFile conector = new ConnectorFile();

	@Test
	public void testRegister() throws SQLException {
		UserData user = new UserData("test@fe.up.pt","test_password");
		user.setUserName("name_test");
		assertEquals(Register.RegisterRequest(user),2);
		ResultSet rs = conector.SearchMySQLData("SELECT email FROM utilizador WHERE email = 'test@fe.up.pt' ");
		rs.next();
		assertEquals("test@fe.up.pt", rs.getString("email"));
		assertEquals(Register.RegisterRequest(user),1);
		conector.AddMySQLData("DELETE FROM `utilizador` WHERE `email` = 'test@fe.up.pt'");	
	}
	
	@Test
	public void testLogIn() throws SQLException{
		UserData user = new UserData("test@fe.up.pt","test_password");
		assertEquals(-1, LogIn.LogInRequest(user));
		String sql = "INSERT INTO utilizador (email, nome, password)" + "VALUES ('test@fe.up.pt', 'hodor', 'wrong_pass')";
		conector.AddMySQLData(sql);
		assertEquals(0, LogIn.LogInRequest(user));
		user.setPassword("wrong_pass");
		assertEquals(1, LogIn.LogInRequest(user));
		conector.AddMySQLData("DELETE FROM `utilizador` WHERE `email` = 'test@fe.up.pt'");	
	}
	
	@Test
	public void testLogInFace() throws SQLException{
		UserData user = new UserData("test@fe.up.pt","test_password");
		user.setUserName("test_name");
		LogInFace.LogIn_Register(user);
		ResultSet rs = conector.SearchMySQLData("SELECT conectado FROM utilizador WHERE email = 'test@fe.up.pt' ");
		rs.next();
		assertEquals("online", rs.getString("conectado"));
		conector.AddMySQLData("DELETE FROM `utilizador` WHERE `email` = 'test@fe.up.pt'");	
	}
	
	@Test
	public void testLogOut() throws SQLException{
		UserData user = new UserData("test@fe.up.pt","test_password");
		String sql = "INSERT INTO utilizador (email, nome, password, conectado)" + "VALUES ('test@fe.up.pt', 'test_name', 'test_pass', 'online')";
		conector.AddMySQLData(sql);
		LogOut.logOutRequest(user);
		ResultSet rs = conector.SearchMySQLData("SELECT conectado FROM utilizador WHERE email = 'test@fe.up.pt' ");
		rs.next();
		assertEquals("offline", rs.getString("conectado"));
		conector.AddMySQLData("DELETE FROM `utilizador` WHERE `email` = 'test@fe.up.pt'");	
	}
	
	@Test
	public void testChange(){
		UserData user = new UserData("test@fe.up.pt","test_password");
		user.setUserName("test_name");
		LogInFace.LogIn_Register(user);
		String sql = "INSERT INTO utilizador (email, nome, password)" + "VALUES ('"+user.getEmail()+"', '"+user.getUserName()+"', '"+user.getPassword()+"')";
		conector.AddMySQLData(sql);
		Change.userName("test_new_name", user);
		Change.password("test_new_password", user);
		Change.email("newtest@fe.up.pt", user);
		assertEquals(user.getUserName(), "test_new_name");
		assertEquals(user.getPassword(), "test_new_password");
		assertEquals(user.getEmail(), "newtest@fe.up.pt");
		conector.AddMySQLData("DELETE FROM `utilizador` WHERE `email` = 'newtest@fe.up.pt'");	
	}
} 
