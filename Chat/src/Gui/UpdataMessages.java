package Gui;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class UpdataMessages {
	
	private FileInputStream in = null;
	private String fileName;
	private ArrayList <String> messages;
	
	public UpdataMessages(String fileName){
		this.fileName = fileName;
		messages = new ArrayList <String>();
	}
	
	public int readFile(){	
		FileReader fileReader;
		
		try {
			fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			try {
				while(bufferedReader.readLine()!=null){
					messages.add(bufferedReader.readLine());		
				}
				bufferedReader.close();
			} catch (IOException e) {
				return -1;
			}
			
		} catch (FileNotFoundException e) {
			return -1;
		}
		
		return 1;
	}
	
	public ArrayList<String> getMessages(){
		return messages;
	}

}
