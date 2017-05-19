package client;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFile {

	private String FILENAME;
	private String message;

	public void setFILENAME(String fILENAME) {
		FILENAME = fILENAME;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void Write() {

		try(FileWriter fw = new FileWriter(FILENAME + ".txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw))
		{
			out.println(message);

		} catch (IOException e) {System.out.print("Erro ao escrever em ficheiro!");}
	}
}