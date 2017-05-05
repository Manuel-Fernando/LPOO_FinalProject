package client;


public class MonitorFriends extends Thread{
	
	private UserData user;
	
	public MonitorFriends(UserData user)
	{
		this.user = user;
	}

	public void run(){

		user.getFriendsList();

	}
	
}
