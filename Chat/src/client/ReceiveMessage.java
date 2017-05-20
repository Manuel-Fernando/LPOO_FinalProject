package client;

////////////  new ReceiveMessage().start(); ////////////////


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import Gui.ChatMenu;

public class ReceiveMessage extends Thread {

	private static final int PORT = 9001;
	
	public void run(){
		ServerSocket listener = null;
		try {
			listener = new ServerSocket(PORT);
		} catch (IOException e) {e.printStackTrace();}
		try {
			while(true){
				try {
					new Handler(listener.accept()).start();
				} catch (IOException e) {e.printStackTrace();}
			}
		} finally {
			try {
				listener.close();
			} catch (IOException e) {e.printStackTrace();}
		}
	}
}
class Handler extends Thread {
	
	private Socket socket;
	private BufferedReader in;

	public Handler(Socket socket) {this.socket = socket;}

	public void run() {
		WriteToFile escrever = new WriteToFile();
	
		try {
			in = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));

			while (true) {
				String input = in.readLine();
				if (input == null) {
					return;
				}
				String data[] = input.split(" ", 2);

				escrever.setFILENAME(data[0]);
				escrever.setMessage(input);
				escrever.Write();	
				ChatMenu.showReceivedMessages(data[1]);
//////////////////////////////////////////////////////////Avisar que há msg nova!
			}
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				socket.close();
			} catch (IOException e) {}
		}
	}
}
