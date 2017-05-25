package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import Gui.UpdataMessages;
import client.WriteToFile;

public class TestUpdateMessages {
	
	private WriteToFile writeToFile = new WriteToFile();

	@Test
	public void testUpdate() {
		
		writeToFile.setFILENAME("testFile");
		writeToFile.setMessage("test message");		
		writeToFile.Write();
		
		UpdataMessages updateMessages = new UpdataMessages("testFile");
		int result = updateMessages.readFile();
		assertEquals(result, -1);
		
		updateMessages = new UpdataMessages("testFile" + ".txt");
		result = updateMessages.readFile();
		assertEquals(result, 1);
		
		ArrayList<String> messages = updateMessages.getMessages();
		assertEquals(messages.get(0), "test message");
		

	}

}
