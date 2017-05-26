package test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;

import org.junit.Test;

import Gui.UpdataMessages;
import client.FriendData;
import client.WriteToFile;

public class TestUpdateMessages {
	
	private WriteToFile writeToFile = new WriteToFile();

	@Test
	public void testUpdate() {
		
		File file = new File("testFile.txt");
		file.delete();
		
		FriendData friend = new FriendData(null, "testFile", null, null);
		writeToFile.setFILENAME(friend);
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
