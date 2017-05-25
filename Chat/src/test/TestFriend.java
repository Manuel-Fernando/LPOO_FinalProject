package test;

import static org.junit.Assert.assertEquals;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import org.junit.Test;

import client.AddFriend;
import client.FriendData;
import client.Friends;
import client.GetFriends;
import client.MonitorFriends;
import client.SearchFriend;
import client.UserData;
import mySQLConnection.ConnectorFile;

public class TestFriend {

	ConnectorFile conector = new ConnectorFile();

	
	@Test
	public void testAddFriend() throws SQLException{
		UserData user = new UserData("XPTO@fe.up.pt", "holdTheDoor");
		AddFriend.add("hodor@fe.up.pt", user);
		ResultSet rs = conector.SearchMySQLData("SELECT `uti2` FROM `amizade` WHERE `uti1` = '" + user.getEmail() + "'");
		rs.next();
		assertEquals("hodor@fe.up.pt", rs.getString("uti2"));
		conector.AddMySQLData("DELETE FROM `amizade` WHERE `uti1` = '"+user.getEmail()+"'");	
	}
	
	@Test
	public void testGetFriends() throws SQLException{
		UserData user = new UserData("XPTO@fe.up.pt", "holdTheDoor");
		AddFriend.add("hor@fe.up.pt", user);
		GetFriends.getFriends(conector, user);
		FriendData friend = new FriendData(null, "hor@fe.up.pt" , null, null);
		user.getFriendsList().getFriendsList().contains(friend);
		conector.AddMySQLData("DELETE FROM `amizade` WHERE `uti1` = '"+user.getEmail()+"'");	
	}
	
	@Test
	public void testSearchFriend() throws SQLException{
		UserData user = new UserData("XPTO@fe.up.pt", "holdTheDoor");
		String sql = "INSERT INTO utilizador (email, nome, password)" + "VALUES ('hodor@fe.up.pt', 'val1', 'test')";
		conector.AddMySQLData(sql);
		sql = "INSERT INTO utilizador (email, nome, password)" + "VALUES ('val2', 'hodor', 'test')";
		conector.AddMySQLData(sql);
		ArrayList<FriendData> list = SearchFriend.Search("odo", user);
		FriendData friend1 = new FriendData("hodor@fe.up.pt", "val1" , null, null);
		FriendData friend2 = new FriendData("val2", "hodor" , null, null);
		list.contains(friend1);
		list.contains(friend2);
		conector.AddMySQLData("DELETE FROM `utilizador` WHERE `email` = 'hodor@fe.up.pt' OR `email` = 'val2'");	
	}
	
	@Test
	public void testMonitorFriends() throws SQLException, InterruptedException{
		UserData user = new UserData("XPTO@fe.up.pt", "holdTheDoor");
		String sql = "INSERT INTO utilizador (email, nome, password, conectado)" + "VALUES ('hodor@fe.up.pt', 'val1', 'test', 'on_teste')";
		conector.AddMySQLData(sql);
		AddFriend.add("hodor@fe.up.pt", user);
		GetFriends.getFriends(conector, user);		
		TimerTask timerTask = new MonitorFriends(user);
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask, 0, 10*1000);

        Thread.sleep(1500);
		user.getFriendsList().getFriendsList().get(0).getConectado().equals("test_online");
		conector.AddMySQLData("DELETE FROM `utilizador` WHERE `email` = 'hodor@fe.up.pt'");	
		conector.AddMySQLData("DELETE FROM `amizade` WHERE `uti2` = 'hodor@fe.up.pt'");	
	}
	
	@Test
	public void testFriendsClass(){
		
		FriendData friend1 = new FriendData("friend1", "friend1Email", "1234", "online");
		
		ArrayList<FriendData> friends = new ArrayList<FriendData>();
		friends.add(friend1);
		
		Friends friendList = new Friends(new ArrayList<FriendData>());
		friendList.setFriendsList(friends);		
		assertEquals("friend1", friendList.getFriendsList().get(0).getName());
		
		FriendData friend2 = new FriendData("friend2", "friend2Email", "5678", "online");
		friendList.addFriend(friend2);
		assertEquals("friend2", friendList.getFriendsList().get(1).getName());
		
		friendList.removeFriend(friend1);
		assertEquals(1, friendList.getFriendsList().size());
	}
	
	
}
