package client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SendMessage extends Thread{

	PrintWriter out;
	String serverAddress;
	UserData user;

	public void setServerAddress(String serverAddress) {
		this.serverAddress=serverAddress;
	}
	
	public void setUserData(UserData user) {
		this.user=user;
	}

	public void run() {

		Socket socket = null;
		try {
			socket = new Socket(serverAddress, 9001);
		} catch (IOException e) {e.printStackTrace();}	
		try {
			out = new PrintWriter(socket.getOutputStream(), true);
		} catch (IOException e) {e.printStackTrace();}

		String line;

		while (true) {
			Scanner scanner = new Scanner(System.in);
			line=scanner.nextLine();
			out.println(user.getEmail() + " " + line);
		}
	}
}