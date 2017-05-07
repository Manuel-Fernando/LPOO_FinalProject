package face;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Autenticar {

	public static void main(String[] args){

		String domain = "http://google.com";
		String appId = "1356146527755617";

		String authUrl ="https://graph.facebook.com/oauth/authorize?type=user_agent&client_id="+appId+"&display=popup&redirect_uri="+domain+"&scope=email,public_profile,user_friends";

		System.setProperty("webdirver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
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

				System.out.println(user.getName()+" "+user.getId());
				break;
			}
		}
	}
}