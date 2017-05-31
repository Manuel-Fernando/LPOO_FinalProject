package Gui;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Classe responsável por atualizar o histórico das mensagens quando um determinado amigo é selecionado
 * @author Carolina e Manuel
 *
 */
public class UpdataMessages {
	
	private FileInputStream in = null;
	private String fileName;
	private ArrayList <String> messages;
	
	/**
	 * Construtor da classe
	 * @param fileName String com o nome do ficheiro
	 */
	public UpdataMessages(String fileName){
		this.fileName = fileName;
		messages = new ArrayList <String>();
	}
	
	/**
	 * Método responsável por ler o ficheiro com as mensagens
	 * @return int 1 - ficheiro lido com sucesso
	 * -1 - erro na leitura do ficheiro
	 */
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
				messages.add(line); 
		        try {
					line = br.readLine();
				} catch (IOException e) {
					return -1;
				}
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
