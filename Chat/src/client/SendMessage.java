package client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Classe responsável por enviar mensagens
 * @author Carolina e Manuel
 *
 */
public class SendMessage extends Thread{

	PrintWriter out;
	String serverAddress;
	UserData user;
	String message;
	Boolean newmessage;
	String destinationEmail;
	FriendData friend;

	/**
	 * Método para atribuir um amigo
	 * @param f FriendData com o amigo a enviar a mensagem
	 */
	public void setFriendData(FriendData f){
		friend = f;
	}
	
	/**
	 * Método para atribuir o ip
	 * @param serverAddress String com o ip do amigo a enviar a mensagem
	 */
	public void setServerAddress(String serverAddress) {
		this.serverAddress=serverAddress;
	}
	
	/**
	 * Método para atribuir um utilizador
	 * @param user UserData co o utilizador
	 */
	public void setUserData(UserData user) {
		this.user=user;
	}
	
	/**
	 * Método para atribuir o email de destino
	 * @param destinationEmail String com o email de destino
	 */
	public void setDestinationEmail(String destinationEmail) {
		this.destinationEmail=destinationEmail;
	}
	
	/**
	 * Método para atribuir um mensagem 
	 * @param m String com a mensagem
	 */
	public void setMessage(String m){
		message = m;
	}
	
	/**
	 * Método para indicar de existe uma nova mensagem a ser enviada
	 * @param b true se houver nova mensagem a ser enviada
	 */
	public void newMessages(Boolean b){
		newmessage = b;
	}

	/**
	 * Método que implementa o run() da thread e envia e guarda a mensagem sempre que existir
	 */
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