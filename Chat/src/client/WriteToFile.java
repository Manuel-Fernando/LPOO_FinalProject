package client;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Classe respons�vel pela escrita de um ficheiro de texto
 * @author Carolina e Manuel
 *
 */
public class WriteToFile {

	private FriendData FILENAME;
	private String message;

	/**
	 * M�todo para atribuir um nome ao ficheiro
	 * @param fILENAME FriendData com o amigo
	 */
	public void setFILENAME(FriendData fILENAME) {
		FILENAME = fILENAME;
	}

	/**
	 * M�todo para atribuir a mensagem a escrever
	 * @param message String com a mensagem a escrever 
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * M�todo para escrever no ficheiro
	 */
	public void Write() {

		try(FileWriter fw = new FileWriter(FILENAME.getEmail() + ".txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw))
		{
			out.println(message);

		} catch (IOException e) {System.out.print("Erro ao escrever em ficheiro!");}
	}
}