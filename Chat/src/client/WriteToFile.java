package client;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFile {

	private FriendData FILENAME;
	private String message;

	public void setFILENAME(FriendData fILENAME) {
		FILENAME = fILENAME;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void Write() {

		try(FileWriter fw = new FileWriter(FILENAME.getName() + ".txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw))
		{
			out.println(message);

		} catch (IOException e) {System.out.print("Erro ao escrever em ficheiro!");}
	}
}