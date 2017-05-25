package test;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import org.junit.Test;

import client.ReceiveMessage;
import client.SendMessage;
import client.UserData;
import client.WriteToFile;

public class TestMessage {

	@Test
	public void testWriteToFile() throws IOException{
		WriteToFile escrever = new WriteToFile();
		String text="Faculdade de Engenharia da Universidade do Porto";
		escrever.setFILENAME("test0@fe.up.pt");
		escrever.setMessage(text);
		escrever.Write();

//		String fileName = "test0@fe.up.pt.txt";
//		FileReader fileReader = new FileReader(fileName);
//		BufferedReader bufferedReader = new BufferedReader(fileReader); 
//		assertEquals(0, bufferedReader.readLine().compareTo(text));
//		bufferedReader.close();
//		
//		File file = new File(fileName);
//		file.delete();
	}
	
	@Test
	public void testReceiveMessage() throws UnknownHostException, IOException, InterruptedException{
		new ReceiveMessage().start();
		
        Thread.sleep(1000);

		Socket socket = new Socket(InetAddress.getLocalHost().getHostAddress(), 9001);
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		String mensagem = "test1@fe.up.pt Mensagem a enviar";
		out.println(mensagem);
		
        Thread.sleep(1000);
        
//		String fileName = "test1@fe.up.pt.txt";
//		FileReader fileReader = new FileReader(fileName);
//		BufferedReader bufferedReader = new BufferedReader(fileReader); 
//		assertEquals(0, bufferedReader.readLine().compareTo(mensagem));
//		bufferedReader.close();
//		
//		File file = new File(fileName);
//		file.delete();	
	}
	
	@Test
	public void testSendMessage() throws IOException, InterruptedException{
		new ReceiveMessage().start();
		UserData user = new UserData("test2@fe.up.pt", "test_pass");
		
		SendMessage sendMsg = new SendMessage();
		sendMsg.setDestinationEmail("test3@fe.up.pt");
		sendMsg.setMessage("Faculdade de Engenharia");
		sendMsg.setServerAddress(InetAddress.getLocalHost().getHostAddress());
		sendMsg.setUserData(user);
		sendMsg.newMessages(true);
		sendMsg.start();
        
		Thread.sleep(1000);

		String fileName = "test2@fe.up.pt.txt";
//		FileReader fileReader = new FileReader(fileName);
//		BufferedReader bufferedReader = new BufferedReader(fileReader); 
//		assertEquals(0, bufferedReader.readLine().compareTo("test2@fe.up.pt Faculdade de Engenharia"));
//		bufferedReader.close();
//		
//		File file = new File(fileName);
//		file.delete();
//		File file1 = new File("test3@fe.up.pt.txt");
//		file1.delete();
	}
}
