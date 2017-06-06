package client;


	//////////////////UserData user = LogInFace.LogIn_Face();//////////////////


import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;

import Gui.ChatMenu;
import mySQLConnection.ConnectorFile;

import java.net.InetAddress;
import java.sql.ResultSet;
import java.util.Timer;
import java.util.TimerTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Classe que é responsável pelo LogIn através do Facebook
 * @author Carolina e Manuel
 *
 */
public class LogInFace {
	
	/**
	 * Método estático que cria um utilizador com as informações obtidas através do Facebook
	 * @return UserData com o utilizador 
	 */
	public static UserData LogIn_Face(){
		UserData utilizador = LogInFaceRequest();
		LogIn_Register(utilizador);
		return utilizador;
	}

	/**
	 * Método estático cria uma drive para o google chrome e faz login com o facebook
	 * @return UserData com o utilizador (id, email)
	 */
	public static UserData LogInFaceRequest() {

		String domain = "http://google.com";
		String appId = "1356146527755617";

		String authUrl ="https://graph.facebook.com/oauth/authorize?type=user_agent&client_id="+appId+"&display=popup&redirect_uri="+domain+"&scope=email,public_profile,user_friends";

		
		String os = System.getProperty("os.name").toLowerCase();
		WebDriver driver = new ChromeDriver();

		if(os.contains("mac")){
			System.setProperty("webdirver.chrome.driver", getDirectory() + "/chromedriver");
		}else{
			System.setProperty("webdirver.chrome.driver", getDirectory() + "/chromedriver.exe");
		}
		
		driver.get(authUrl);
		String accessToken;

		while(true){

			if(!driver.getCurrentUrl().contains("facebook.com")){
				String url = driver.getCurrentUrl();
				accessToken = url.replaceAll(".*#access_token=(.+)&.*", "$1");

				driver.quit();

				@SuppressWarnings("deprecation")
				FacebookClient fbClient = new DefaultFacebookClient(accessToken);
				User user = fbClient.fetchObject("me",User.class);

				UserData utilizador = new UserData(user.getId(), "ShallNotPass");
				utilizador.setUserName(user.getName());
				return utilizador;
				
			}
		}
	}
	
	/**
	 * Método estático que insere a informação do utilizador na base de dados e faz login
	 * @param utilizador UserData com o utilizador
	 */
	public static void LogIn_Register(UserData utilizador) {
		ConnectorFile conector = new ConnectorFile();
		try {
			ResultSet rs = conector.SearchMySQLData("SELECT  `nome` FROM utilizador WHERE email = '" + utilizador.getEmail() + "'");
			if (!rs.isBeforeFirst()){
				String sql = "INSERT INTO utilizador (email, nome, password)" + "VALUES ('"+utilizador.getEmail()+"', '"+utilizador.getUserName()+"', '"+utilizador.getPassword()+"')";
				conector.AddMySQLData(sql);
			}
			String c = InetAddress.getLocalHost().getHostAddress();
			conector.AddMySQLData("UPDATE `utilizador` SET `conectado`='online', `IP`='"+ c +"' WHERE email = '"+utilizador.getEmail()+"'");
			
			GetFriends.getFriends(conector, utilizador);
			
			TimerTask timerTask = new MonitorFriends(utilizador);
	        Timer timer = new Timer(true);
	        timer.scheduleAtFixedRate(timerTask, 0, 10*1000);
	        


		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	private static String getDirectory(){
		String x = System.getProperty("user.dir");
		
		return x.substring(0, x.length()-5);
	}
	
}