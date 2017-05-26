package client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class SendMessage extends Thread{

	PrintWriter out;
	String serverAddress;
	UserData user;
	String message;
	Boolean newmessage;
	String destinationEmail;
	FriendData friend;

	public void setFriendData(FriendData f){
		friend = f;
	}
	
	public void setServerAddress(String serverAddress) {
		this.serverAddress=serverAddress;
	}
	
	public void setUserData(UserData user) {
		this.user=user;
	}
	
	public void setDestinationEmail(String destinationEmail) {
		this.destinationEmail=destinationEmail;
	}
	
	public void setMessage(String m){
		message = m;
	}
	
	public void newMessages(Boolean b){
		newmessage = b;
	}

	public void run() {
		
		WriteToFile escrever = new WriteToFile();
		Socket socket = null;

		String message_out;
		while (true) {
			
			if (newmessage){
				
				try {
					socket = new Socket(serverAddress, 9001);
					
				} catch (IOException e) {e.printStackTrace();}	
				
				try {
					out = new PrintWriter(socket.getOutputStream(), true);
				} catch (IOException e) {e.printStackTrace();}
				
				message_out=user.getEmail() + " " + user.getUserName() + " " + message;
				out.println(message_out);
				newmessage = false;
				
				escrever.setFILENAME(friend);
				escrever.setMessage(message_out);
				escrever.Write();
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}

	}
}