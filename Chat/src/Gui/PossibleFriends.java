package Gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import client.AddFriend;
import client.FriendData;
import client.UserData;

import javax.swing.JList;

public class PossibleFriends extends JFrame {

	private JPanel contentPane;
	private JLabel lblTitle;
	private JPanel horizontalSeparator;
	private JList friendsList;
	private JButton btnBack;
	private JButton btnAdd;
	private JPanel background;
	private DefaultListModel model;
	private static ArrayList<FriendData> friends;
	private static UserData userdata;
	private JLabel lblWarning;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PossibleFriends frame = new PossibleFriends(friends, userdata);
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
	public PossibleFriends(ArrayList<FriendData> friends, UserData userdata) {
		this.friends = friends;
		this.userdata = userdata;
		createJFrame();
		createtitles();
		createLineSeparators();
		createList();
		createBackButton();
		createAddButton();
		createBackgrounds();
		createWarnings();
	}

	public void createJFrame(){
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 291, 381);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	private void createtitles() {
		lblTitle = new JLabel("Possible Friends");
		lblTitle.setFont(new Font("Kristen ITC", Font.BOLD, 24));
		lblTitle.setBounds(35, 11, 220, 33);
		lblTitle.setForeground(new Color (8, 83, 148));
		contentPane.add(lblTitle);
	}
	
	private void createLineSeparators(){		
		horizontalSeparator = new JPanel();
		horizontalSeparator.setBackground(new Color(8, 83, 148, 70));
		horizontalSeparator.setBorder(new EmptyBorder(10,10,10,10));
		horizontalSeparator.setBounds(25, 50, 220, 3);
		contentPane.add(horizontalSeparator);
	}
	
	public void createList(){
		model = new DefaultListModel();
		friendsList = new JList(model);
		friendsList.setBounds(51, 80, 167, 191);
		
		for (int i=0; i<friends.size(); i++){
			model.addElement(friends.get(i).getName());
		}
		
		contentPane.add(friendsList);
	}
	
	public void createBackButton(){
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnBack.setBounds(40, 300, 60, 23);
		btnBack.setFont(new Font("Kristen ITC", Font.BOLD, 10));
		btnBack.setBorder(new LineBorder(new Color(0, 0, 0))); 
		btnBack.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		btnBack.setForeground(Color.BLACK);
		contentPane.add(btnBack);
	}
	
	private Boolean canAdd(String email){
		
		ArrayList<FriendData> userFriends = userdata.getFriendsList().getFriendsList();
		
		for (int i=0; i<userFriends.size(); i++){
			if (userFriends.get(i).getEmail().equals(email)){
				return false;
			}	
		}
		
		return true;
	}
	
	public void createAddButton(){
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				addButtonAction();
			}
		});
		btnAdd.setBounds(170, 300, 60, 23);
		btnAdd.setFont(new Font("Kristen ITC", Font.BOLD, 10));
		btnAdd.setBorder(new LineBorder(new Color(0, 0, 0))); 
		btnAdd.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		btnAdd.setForeground(Color.BLACK);
		contentPane.add(btnAdd);
	}
	
	private void addButtonAction(){
		int index = friendsList.getSelectedIndex();
		String friendEmail = friends.get(index).getEmail(); 
		
		Boolean add = canAdd(friendEmail);
		
		if (add){
			AddFriend.add(friendEmail, userdata);
		} else {
			lblWarning.setVisible(true);
		}

		setVisible(false);
	}
	
	public void createBackgrounds(){
		background = new JPanel();
		background.setForeground(Color.WHITE);
		background.setBorder(new EmptyBorder(10,10,10,10));
		background.setBackground(new Color(8, 83, 148));
		background.setBorder(BorderFactory.createTitledBorder(null, "Add your friend", TitledBorder.LEFT, TitledBorder.TOP, new Font("Kristen ITC", Font.BOLD, 9), Color.WHITE));
		background.setBounds(44, 65, 180, 215);
		contentPane.add(background);
		
	}
	
	public void createWarnings(){
		lblWarning = new JLabel("This user is already your friend.");
		lblWarning.setBounds(58, 281, 152, 14);
		lblWarning.setFont(new Font("Kristen ITC", Font.PLAIN, 9));
		lblWarning.setForeground(new Color (8, 83, 148));
		lblWarning.setVisible(false);
		contentPane.add(lblWarning);
	}
}
