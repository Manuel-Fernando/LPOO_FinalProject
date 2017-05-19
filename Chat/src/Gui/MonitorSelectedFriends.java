package Gui;

import java.util.ArrayList;
import java.util.TimerTask;

import client.FriendData;
import client.UserData;

public class MonitorSelectedFriends extends Thread{
	
	private ArrayList<FriendData> friends;
	private UserData userdata;
	private FriendData frienddata;
	
	public void run(){		

		while(true){
			friends=userdata.getFriendsList().getFriendsList();
			int index = ChatMenu.friendsList.getSelectedIndex();
//			System.out.println("list size " + ChatMenu.friendsList.getModel().getSize());
//			System.out.println("selected index " + ChatMenu.friendsList.getSelectedValue());
//			System.out.println("index " + index);
			if (index!=-1){
				frienddata = friends.get(index);
				ChatMenu.changeFriend(frienddata);
				ChatMenu.createBackgrounds(frienddata.getName());
			}	
		}

	}	
	
	public void setUserdata(UserData userdata){
		this.userdata = userdata;
	}

}
