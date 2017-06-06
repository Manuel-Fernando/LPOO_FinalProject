package client;

////////////  new ReceiveMessage().start(); ////////////////


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import Gui.ChatMenu;

/**
 * Classe que é responsável por verificar se existem mensagens a serem recebidas
 * @author Carolina e Manuel
 *
 */
public class ReceiveMessage extends Thread {

	private static final int PORT = 9001;
	
	/**
	 * Métoto que implementa o run() da thread para monitorizar a chegada de mensagens
	 */
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

/**
 * Classe que é responsável por ler e guardar a mensagem recebida
 * @author Carolina e Manuel
 *
 */
class Handler extends Thread {
	
	private Socket socket;
	private BufferedReader in;

	/**
	 * Construtor da classe
	 * @param socket Socket com o socket a considerar
	 */
	public Handler(Socket socket) {this.socket = socket;}

	/**
	 * Método que implementa o run() da thread de forma ler as mensagens e guardá-las num ficheiro
	 */
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
				String data[] = input.split(" ", 3);

				FriendData friend = new FriendData(data[1], data[0], null, null);
				
				escrever.setFILENAME(friend);
				escrever.setMessage(data[1] + ": " + data[2]);
				escrever.Write();	

				ChatMenu.showReceivedMessages(data[1], data[2]);

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
