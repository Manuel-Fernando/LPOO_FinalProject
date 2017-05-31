package Gui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.TimerTask;

import client.FriendData;
import client.UserData;

/**
 * Classe responsável por monitorizar qual o amigo que foi selecionado na lista de amigos
 * @author Carolina e Manuel
 *
 */
public class MonitorSelectedFriends extends Thread{
	
	private ArrayList<FriendData> friends;
	private UserData userdata;
	private FriendData frienddata;
	private int lastIndex = -1;
	private int nextIndex = 0;
	
	/**
	 * Método que implementa o run() da thread e é responsável por verificar se foi selecionado um 
	 * novo amigo da lista de amigos do GUI
	 */
	public void run(){		

		while(true){
			friends=userdata.getFriendsList().getFriendsList();
			int index = ChatMenu.friendsList.getSelectedIndex();
			
			nextIndex = index;
			
			if (index!=-1){
				if (nextIndex!=lastIndex){
					
					lastIndex = nextIndex;
					
					frienddata = friends.get(index);
					ChatMenu.changeTitle(frienddata);
					
					try {
						ChatMenu.changeFriend(frienddata);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}	
	
	public void setUserdata(UserData userdata){
		this.userdata = userdata;
	}

}
