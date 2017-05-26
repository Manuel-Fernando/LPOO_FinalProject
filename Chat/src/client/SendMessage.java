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
		
//		WriteToFile escrever = new WriteToFile();
		Socket socket = null;
		try {
			System.out.println(serverAddress);
			socket = new Socket(serverAddress, 9001);
			
		} catch (IOException e) {e.printStackTrace();}	
		try {
			out = new PrintWriter(socket.getOutputStream(), true);
		} catch (IOException e) {e.printStackTrace();}

		String message_out;
		while (true) {
			
			if (newmessage){
				message_out=user.getEmail() + " " + message;
				out.println(message_out);
				newmessage = false;
				
//				escrever.setFILENAME(destinationEmail);
//				escrever.setMessage(message_out);
//				escrever.Write();
			}
			
		}

	}
}