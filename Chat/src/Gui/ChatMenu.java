package Gui;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import client.FriendData;
import client.GetFriends;
import client.LogOut;
import client.ReceiveMessage;
import client.SearchFriend;
import client.SendMessage;
import client.UserData;
import mySQLConnection.ConnectorFile;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JLabel;

public class ChatMenu extends JFrame {

	private static JPanel contentPane;
	private JTextField messageTextField;
	private JTextField searchTextField;
	private JTextArea messagesTextArea;
	private JButton btnSend;
	private JButton btnSearch;
	private JComboBox <String> comboBox;
	private JPanel horizontalSeparator;
	private static JPanel backgroundMessages;
	private JPanel lineMessages;
	private static JPanel backgroundFriends;
	static JList <String> friendsList;
	private static UserData userdata;
	private SendMessage sendmessage;
	private JLabel lblWarning;
	private static DefaultListModel <String> model;
	private static ArrayList<FriendData> friends = new ArrayList<FriendData>();
	private static FriendData friendtoSendMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatMenu frame = new ChatMenu(userdata);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChatMenu(UserData userdata) {
		this.userdata = userdata;
		createJFrame();
		createTextAreas();
		createSearchButton();
		createComboBox();
		createWarnings();
		createHorizontalSeparator();
		createBackgrounds("");
		createTxtFields();
		createSendButton();	
		sendMessage();
		new MonitorSelectedFriends(this.userdata).start();
		new ReceiveMessage().start();
	}
	
	private void createTxtFields(){
		
		searchTextField = new JTextField();
		searchTextField.setToolTipText("Select a friend");
		searchTextField.setBounds(31, 12, 126, 20);
		contentPane.add(searchTextField);
		searchTextField.setColumns(10);
		
		messageTextField = new JTextField();
		messageTextField.setBounds(10, 298, 375, 20);
		messageTextField.setBorder(null);
		contentPane.add(messageTextField);
		messageTextField.setColumns(10);
	}
	
	private void createJFrame(){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 370);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	
	private void createFriendsList(){
		model = new DefaultListModel <String>();
		friendsList = new JList <String>(model);
		friendsList.setBounds(405, 74, 120, 193);
		
		contentPane.add(friendsList);	
	}
	
	public static void updateList(){
		ArrayList<FriendData> userFriends = userdata.getFriendsList().getFriendsList();
		model.clear();
		
		if (!friends.isEmpty()){
			friends.clear();
		}

		for (int i=0; i<userFriends.size(); i++){			
			String online = userFriends.get(i).getConectado();	
			model.addElement(userFriends.get(i).getName() + " - " + online);
			friends.add(userFriends.get(i));
		}
		
		System.out.println("list size chatmenu " + friendsList.getModel().getSize());
		
	}

	private void createTextAreas(){		
		createFriendsList();
		messagesTextArea = new JTextArea();
		messagesTextArea.setBounds(25, 74, 350, 193);
		messagesTextArea.setEditable(false);
		contentPane.add(messagesTextArea);
	}
	
	private void createSearchButton(){
		
		btnSearch = new JButton("Search ");
		btnSearch.setFont(new Font("Kristen ITC", Font.BOLD, 10));
		btnSearch.setBorder(new LineBorder(new Color(0, 0, 0))); 
		btnSearch.setBackground(new Color (8, 83, 148));
		btnSearch.setForeground(Color.WHITE);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String friend = searchTextField.getText();
				
				if (friend!=""){
					ArrayList<FriendData> possibleFriends = SearchFriend.Search(friend, userdata);

					if (possibleFriends!=null){
						PossibleFriends pFriends = new PossibleFriends(possibleFriends, userdata);
						pFriends.setVisible(true);
					} else{
						lblWarning.setVisible(true);
					}
				} else {
					lblWarning.setVisible(true);
				}

			}
		});
		btnSearch.setBounds(167, 12, 64, 20);
		contentPane.add(btnSearch);
	}
	
	private void createComboBox(){
		
		comboBox = new JComboBox <String>();
		comboBox.setModel(new DefaultComboBoxModel <String>(new String[] {userdata.getUserName(), "Settings", "Log Out"}));
		comboBox.setFont(new Font("Kristen ITC", Font.BOLD, 10));
		comboBox.setBorder(new LineBorder(new Color(0, 0, 0))); 
		comboBox.setBackground(new Color (8, 83, 148));
		comboBox.setForeground(Color.WHITE);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedItem().equals("Settings")){
					SettingsMenu settings = new SettingsMenu(userdata);
					settings.setVisible(true);
				} else if (comboBox.getSelectedItem().equals("Log Out")){
					LogOut.logOutRequest(userdata);
					
					LogInMenu login = new LogInMenu();
					login.setVisible(true);
					
					//Fecha janela - logout
				}
			}
		});
		comboBox.setBounds(384, 12, 126, 20);
		contentPane.add(comboBox);	
	}
	
	private void createHorizontalSeparator(){
		
		horizontalSeparator = new JPanel();
		horizontalSeparator.setBorder(new EmptyBorder(10,10,10,10));
		horizontalSeparator.setBackground(new Color(8, 83, 148, 70));
		horizontalSeparator.setBounds(15, 43, 510, 3);
		contentPane.add(horizontalSeparator);
		
		lineMessages = new JPanel();
		lineMessages.setBorder(new EmptyBorder(10,10,10,10));
		lineMessages.setBackground(Color.BLACK);
		lineMessages.setBounds(10, 317, 375, 3);
		contentPane.add(lineMessages);
	}
	
	private static void createBackgrounds(String friendName){
		
		backgroundMessages = new JPanel();
		backgroundMessages.setForeground(Color.WHITE);
		backgroundMessages.setBorder(new EmptyBorder(10,10,10,10));
		backgroundMessages.setBackground(new Color(8, 83, 148));
		backgroundMessages.setBorder(BorderFactory.createTitledBorder(null, friendName, TitledBorder.LEFT, TitledBorder.TOP, new Font("Kristen ITC", Font.BOLD, 9), Color.WHITE));
		backgroundMessages.setBounds(15, 57, 370, 220);
		contentPane.add(backgroundMessages);
		
		backgroundFriends = new JPanel();
		backgroundFriends.setForeground(Color.WHITE);
		backgroundFriends.setBorder(new EmptyBorder(10,10,10,10));
		backgroundFriends.setBorder(BorderFactory.createTitledBorder(null, "Online Friends", TitledBorder.LEFT, TitledBorder.TOP, new Font("Kristen ITC", Font.BOLD, 9), Color.WHITE));
		backgroundFriends.setBackground(new Color(8, 83, 148));
		backgroundFriends.setBounds(394, 57, 140, 220);
		contentPane.add(backgroundFriends);
	}
	
	private void createSendButton(){
		
		btnSend = new JButton("Send");
		btnSend.setFont(new Font("Kristen ITC", Font.BOLD, 10));
		btnSend.setBorder(new LineBorder(new Color(0, 0, 0))); 
		btnSend.setBackground(new Color (8, 83, 148));
		btnSend.setForeground(Color.WHITE);
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message = messageTextField.getText();				
				sendmessage.setMessage(message);
				sendmessage.newMessages(true);
				messageTextField.setText("");
			}
		});
		btnSend.setBounds(405, 297, 64, 23);
		contentPane.add(btnSend);
		
	}
	
	private void sendMessage(){
		sendmessage = new SendMessage();
		sendmessage.setUserData(userdata);
		sendmessage.setServerAddress("172.30.15.134"); //-----------------------------------			
		sendmessage.start();
		sendmessage.newMessages(false);
		
	}
	
	private void createWarnings(){
		lblWarning = new JLabel("User not found.");
		lblWarning.setBounds(241, 15, 80, 14);
		lblWarning.setFont(new Font("Kristen ITC", Font.PLAIN, 9));
		lblWarning.setForeground(new Color (8, 83, 148));
		lblWarning.setVisible(false);
		contentPane.add(lblWarning);
	}
	
	public static void changeFriend(FriendData friend){
		friendtoSendMessage =  friend;
		System.out.println("friendEmail " + friend.getEmail());
	}
}
