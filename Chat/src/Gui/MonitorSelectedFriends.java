package Gui;

import java.util.ArrayList;
import java.util.TimerTask;

import client.FriendData;
import client.UserData;

public class MonitorSelectedFriends extends Thread{
	
	private ArrayList<FriendData> friends;
	private UserData userdata;
	private FriendData frienddata;
	private int lastIndex = -1;
	private int nextIndex = 0;
	
	public void run(){		

		while(true){
			friends=userdata.getFriendsList().getFriendsList();
			int index = ChatMenu.friendsList.getSelectedIndex();
			
			nextIndex = index;
			
			if (index!=-1){
				if (nextIndex!=lastIndex){  //só faz alterações quando há nova escolha de amigo
					
					lastIndex = nextIndex;
					
					frienddata = friends.get(index);
					ChatMenu.changeTitle(frienddata);
					ChatMenu.changeFriend(frienddata);
				}
			}	
		}

	}	
	
	public void setUserdata(UserData userdata){
		this.userdata = userdata;
	}

}
