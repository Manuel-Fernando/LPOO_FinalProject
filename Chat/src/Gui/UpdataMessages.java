package Gui;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
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
		
		String line = null;
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			StringBuilder sb = new StringBuilder();
			
			try {
				line = br.readLine();
			} catch (IOException e) {
				return -1;
			}
			
			while (line != null) {
//		        sb.append(line);
//		        sb.append(System.lineSeparator());
				messages.add(line); 
		        try {
					line = br.readLine();
				} catch (IOException e) {
					return -1;
				}
		    }
			
//		    String everything = sb.toString();
//		    messages.add(everything);    
			
		} catch (FileNotFoundException e) {
			return -1;
		}
		
		return 1;
	}
	
	public ArrayList<String> getMessages(){
		return messages;
	}

}
