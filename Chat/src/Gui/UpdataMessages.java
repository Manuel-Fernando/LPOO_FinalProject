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
//		FileReader fileReader;
//		
//		
//		try(BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
//		    StringBuilder sb = new StringBuilder();
//		    String line = br.readLine();
//
//		    while (line != null) {
//		        sb.append(line);
//		        sb.append(System.lineSeparator());
//		        line = br.readLine();
//		    }
//		    String everything = sb.toString();
//		}
		
		String line = null;
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			StringBuilder sb = new StringBuilder();
			
			try {
				line = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        try {
					line = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
		    }
			
		    String everything = sb.toString();
		    messages.add(everything);    
//			fileReader = new FileReader(fileName);
//			InputStream in = Files.newInputStream(fileReader);
//			BufferedReader bufferedReader = new BufferedReader(fileReader);

//			try {
//				while(bufferedReader.readLine()!=null){
//					messages.add(bufferedReader.readLine());	
//				}
//				bufferedReader.close();
//			} catch (IOException e) {
//				return -1;
//			}
			
		} catch (FileNotFoundException e) {
			return -1;
		}
		
		return 1;
	}
	
	public ArrayList<String> getMessages(){
		return messages;
	}

}
