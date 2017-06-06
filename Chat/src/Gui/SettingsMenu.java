package Gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import client.Change;
import client.UserData;
import mySQLConnection.ConnectorFile;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class SettingsMenu extends JFrame {

	private JPanel contentPane;
	private JTextField UsernameTextField;
	private JTextField emailTextField;
	private JPasswordField passwordField1;
	private JPasswordField passwordField2;
	private JLabel lblUsername;
	private JLabel lblEmail;
	private JLabel lblPassword1;
	private JLabel lblPassword2;
	private JButton btnEditUsername;
	private JButton btnEditEmail;
	private JButton btnEditPassword;
	private JButton btnSaveUsername;
	private JButton btnSaveEmail;
	private JButton btnSavePassword;
	private JButton btnCancelUsername;
	private JButton btnCancelEmail;
	private JButton btnCancelPassword;
	private char[] password1;
	private char[] password2;
	private String username;
	private String email;
	private JLabel lblError;
	private JLabel lblTitle;
	private JPanel horizontalSeparator;
	private JPanel usernameLine;
	private JPanel passwordLine1;
	private JPanel passwordLine2;
	private JPanel emailLine;
	private static UserData userdata;
	private JLabel lblEmailAlreadyExists;
	private JLabel lblConnectionError;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SettingsMenu frame = new SettingsMenu(userdata);
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
	public SettingsMenu(UserData userdata) {
		this.userdata = userdata;
		createJFrame();
		createTitle();
		createSeparator();
		createLabels1();
		createLabels2();
		createSaveButtons();
		createWarnings1();
		createWarnings2();
		createLines1();
		createLines2();
		createTxtFields1();
		createTxtFields2();
	}
	
	private void createLines1(){
		usernameLine = new JPanel();
		usernameLine.setBorder(new EmptyBorder(10,10,10,10));
		usernameLine.setBackground(Color.BLACK);
		usernameLine.setBounds(155, 83, 86, 3);
		contentPane.add(usernameLine);
		
		passwordLine1 = new JPanel();
		passwordLine1.setBorder(new EmptyBorder(10,10,10,10));
		passwordLine1.setBackground(Color.BLACK);
		passwordLine1.setBounds(155, 153, 86, 3);
		contentPane.add(passwordLine1);
		
	}
	
	private void createLines2(){
		passwordLine2 = new JPanel();
		passwordLine2.setBorder(new EmptyBorder(10,10,10,10));
		passwordLine2.setBackground(Color.BLACK);
		passwordLine2.setBounds(155, 184, 86, 3);
		passwordLine2.setVisible(false);
		contentPane.add(passwordLine2);
		
		emailLine = new JPanel();
		emailLine.setBorder(new EmptyBorder(10,10,10,10));
		emailLine.setBackground(Color.BLACK);
		emailLine.setBounds(155, 115, 86, 3);
		contentPane.add(emailLine);
	}
	
	private void createTxtFields1(){
		UsernameTextField = new JTextField();
		UsernameTextField.setEditable(false);
		UsernameTextField.setText(userdata.getUserName());
		UsernameTextField.setBounds(155, 64, 86, 20);
		contentPane.add(UsernameTextField);
		UsernameTextField.setBackground(Color.WHITE);
		UsernameTextField.setBorder(null);
		UsernameTextField.setColumns(10);
		
		passwordField1 = new JPasswordField();
		passwordField1.setEditable(false);
		passwordField1.setBackground(Color.WHITE);
		passwordField1.setBounds(155, 134, 86, 20);
		passwordField1.setBorder(null);
		contentPane.add(passwordField1);
		
	}
	
	private void createTxtFields2(){
		emailTextField = new JTextField();
		emailTextField.setEditable(false);
		emailTextField.setText(userdata.getEmail());
		emailTextField.setBounds(155, 96, 86, 20);
		emailTextField.setBackground(Color.WHITE);
		emailTextField.setBorder(null);
		contentPane.add(emailTextField);
		emailTextField.setColumns(10);
		
		passwordField2 = new JPasswordField();
		passwordField2.setVisible(false);
		passwordField2.setBounds(155, 165, 86, 20);
		passwordField2.setBackground(Color.WHITE);
		passwordField2.setBorder(null);
		contentPane.add(passwordField2);
	}
	
	private void createWarnings1(){
		lblError = new JLabel("Passwords don't match");
		lblError.setVisible(false);
		lblError.setFont(new Font("Kristen ITC", Font.PLAIN, 9));
		lblError.setForeground(new Color (8, 83, 148));
		lblError.setBounds(155, 196, 140, 14);
		contentPane.add(lblError);
	}
	
	private void createWarnings2(){
		lblEmailAlreadyExists = new JLabel("Email already exists");
		lblEmailAlreadyExists.setBounds(155, 115, 91, 14);
		lblEmailAlreadyExists.setFont(new Font("Kristen ITC", Font.PLAIN, 9));
		lblEmailAlreadyExists.setForeground(new Color (8, 83, 148));
		lblEmailAlreadyExists.setVisible(false);
		contentPane.add(lblEmailAlreadyExists);
		
		lblConnectionError = new JLabel("Connection error please try again");
		lblConnectionError.setBounds(168, 236, 161, 14);
		lblConnectionError.setFont(new Font("Kristen ITC", Font.PLAIN, 9));
		lblConnectionError.setForeground(new Color (8, 83, 148));
		lblConnectionError.setVisible(false);
		contentPane.add(lblConnectionError);
	}
	
	private void createJFrame(){
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	
	private void createLabels1(){
		lblUsername = new JLabel("Username");
		lblUsername.setBounds(33, 67, 60, 14);
		lblUsername.setFont(new Font("Kristen ITC", Font.BOLD, 10));
		lblUsername.setForeground(new Color (8, 83, 148));
		contentPane.add(lblUsername);
		
		lblEmail = new JLabel("Email");
		lblEmail.setBounds(33, 99, 46, 14);
		lblEmail.setFont(new Font("Kristen ITC", Font.BOLD, 10));
		lblEmail.setForeground(new Color (8, 83, 148));
		contentPane.add(lblEmail);
		
	}
	
	private void createLabels2(){
		lblPassword1 = new JLabel("Password");
		lblPassword1.setBounds(33, 137, 60, 14);
		lblPassword1.setFont(new Font("Kristen ITC", Font.BOLD, 10));
		lblPassword1.setForeground(new Color (8, 83, 148));
		contentPane.add(lblPassword1);
		
		lblPassword2 = new JLabel("Re-enter Password");
		lblPassword2.setVisible(false);
		lblPassword2.setBounds(33, 168, 110, 14);
		lblPassword2.setFont(new Font("Kristen ITC", Font.BOLD, 10));
		lblPassword2.setForeground(new Color (8, 83, 148));
		contentPane.add(lblPassword2);
	}
	
	private void createTitle(){
		lblTitle = new JLabel("Settings");
		lblTitle.setFont(new Font("Kristen ITC", Font.BOLD, 24));
		lblTitle.setBounds(190, 11, 150, 33);
		lblTitle.setForeground(new Color (8, 83, 148));
		contentPane.add(lblTitle);
	}
	
	private void createSeparator(){
		horizontalSeparator = new JPanel();
		horizontalSeparator.setBackground(new Color(8, 83, 148, 70));
		horizontalSeparator.setBorder(new EmptyBorder(10,10,10,10));
		horizontalSeparator.setBounds(25, 50, 435, 3);
		contentPane.add(horizontalSeparator);
	}
	
	private void createSaveButtons(){
		createEditUsernameButton();
		createEditEmailButton();
		createEditPasswordButton();
		createSavePasswordButton();
		createSaveEmailButton();
		createSaveUsernameButton();
		createCancelPasswordButton();
		createCancelEmailButton();
		createCancelUsernameButton();
	}
	
	private void createCancelUsernameButton(){
		btnCancelUsername = new JButton("Cancel");
		btnCancelUsername.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cancelUsernameAction();
			}
		});
		btnCancelUsername.setVisible(false);
		btnCancelUsername.setFont(new Font("Kristen ITC", Font.BOLD, 10));
		btnCancelUsername.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnCancelUsername.setBounds(397, 63, 62, 21);
		btnCancelUsername.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		btnCancelUsername.setForeground(Color.BLACK);
		contentPane.add(btnCancelUsername);
		
	}
	
	private void cancelUsernameAction(){
		UsernameTextField.setEditable(false);
		UsernameTextField.setText("");
		btnSaveUsername.setVisible(false);
		btnEditUsername.setVisible(true);
		btnCancelUsername.setVisible(false);
	}
	
	private void createCancelEmailButton(){
		btnCancelEmail = new JButton("Cancel");
		btnCancelEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cancelEmailAction();
			}
		});
		btnCancelEmail.setVisible(false);
		btnCancelEmail.setFont(new Font("Kristen ITC", Font.BOLD, 10));
		btnCancelEmail.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnCancelEmail.setBounds(397, 95, 62, 21);
		btnCancelEmail.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		btnCancelEmail.setForeground(Color.BLACK);
		contentPane.add(btnCancelEmail);
		
	}
	
	private void cancelEmailAction(){
		emailTextField.setEditable(false);
		emailTextField.setText("");
		btnSaveEmail.setVisible(false);
		btnEditEmail.setVisible(true);
		btnCancelEmail.setVisible(false);
	}
	
	private void createCancelPasswordButton(){
		btnCancelPassword = new JButton("Cancel");
		btnCancelPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cancelPasswordAction();
			}
		});
		btnCancelPassword.setVisible(false);
		btnCancelPassword.setFont(new Font("Kristen ITC", Font.BOLD, 10));
		btnCancelPassword.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnCancelPassword.setBounds(397, 133, 62, 21);
		btnCancelPassword.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		btnCancelPassword.setForeground(Color.BLACK);
		contentPane.add(btnCancelPassword);
	}
	
	private void cancelPasswordAction(){
		passwordField1.setEditable(false);
		passwordField1.setText("");
		passwordField2.setVisible(false);
		passwordField2.setText("");
		lblPassword2.setVisible(false);
		btnSavePassword.setVisible(false);
		btnEditPassword.setVisible(true);
		btnCancelPassword.setVisible(false);
	}
	
	private void createEditPasswordButton(){
		btnEditPassword = new JButton("Edit");
		btnEditPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editPasswordAction();
			}
		});
		btnEditPassword.setFont(new Font("Kristen ITC", Font.BOLD, 10));
		btnEditPassword.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnEditPassword.setBounds(265, 133, 56, 21);
		btnEditPassword.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		btnEditPassword.setForeground(Color.BLACK);
		contentPane.add(btnEditPassword);
		
	}
	
	private void editPasswordAction(){
		passwordField1.setText("");
		passwordField1.setEditable(true);
		passwordField2.setVisible(true);
		lblPassword2.setVisible(true);
		btnSavePassword.setVisible(true);
		btnEditPassword.setVisible(false);
		btnCancelPassword.setVisible(true);
		passwordLine2.setVisible(true);
	}
	
	private void createEditEmailButton(){
		btnEditEmail = new JButton("Edit");
		btnEditEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editEmailAction();
			}
		});
		btnEditEmail.setFont(new Font("Kristen ITC", Font.BOLD, 10));
		btnEditEmail.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnEditEmail.setBounds(265, 95, 56, 21);
		btnEditEmail.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		btnEditEmail.setForeground(Color.BLACK);
		contentPane.add(btnEditEmail);
		
	}
	
	private void editEmailAction(){
		emailTextField.setText("");
		emailTextField.setEditable(true);
		btnSaveEmail.setVisible(true);
		btnEditEmail.setVisible(false);
		btnCancelEmail.setVisible(true);
	}
	
	private void createEditUsernameButton(){
		btnEditUsername = new JButton("Edit");
		btnEditUsername.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editUsernameAction();
			}
		});
		btnEditUsername.setFont(new Font("Kristen ITC", Font.BOLD, 10));
		btnEditUsername.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnEditUsername.setBounds(265, 63, 56, 21);
		btnEditUsername.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		btnEditUsername.setForeground(Color.BLACK);
		contentPane.add(btnEditUsername);
		
	}
	
	private void editUsernameAction(){
		UsernameTextField.setText("");
		UsernameTextField.setEditable(true);
		btnSaveUsername.setVisible(true);
		btnEditUsername.setVisible(false);
		btnCancelUsername.setVisible(true);
	}
	
	private void createSaveUsernameButton(){
		btnSaveUsername = new JButton("Save");
		btnSaveUsername.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveUsernameAction();
			}
		});
		btnSaveUsername.setVisible(false);
		btnSaveUsername.setFont(new Font("Kristen ITC", Font.BOLD, 10));
		btnSaveUsername.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnSaveUsername.setBounds(331, 63, 56, 21);
		btnSaveUsername.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		btnSaveUsername.setForeground(Color.BLACK);
		contentPane.add(btnSaveUsername);
	}
	
	private void saveUsernameAction(){
		String name = UsernameTextField.getText();
		changeUsername(name);
		
		UsernameTextField.setEditable(false);
		UsernameTextField.setText(userdata.getUserName());
		btnSaveUsername.setVisible(false);
		btnEditUsername.setVisible(true);
		btnCancelUsername.setVisible(false);
	}
	
	private void createSavePasswordButton(){
		btnSavePassword = new JButton("Save");
		btnSavePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				savePasswordAction();
				}
		});
		btnSavePassword.setVisible(false);
		btnSavePassword.setFont(new Font("Kristen ITC", Font.BOLD, 10));
		btnSavePassword.setBorder(new LineBorder(new Color(0, 0, 0))); 
		btnSavePassword.setBounds(331, 133, 56, 21);
		btnSavePassword.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		btnSavePassword.setForeground(Color.BLACK);
		contentPane.add(btnSavePassword);
	}
	
	private void savePasswordAction(){		
		String password1 = passwordField1.getText();
		String password2 = passwordField2.getText();				
		changePassword(password1, password2);
		
		passwordField1.setEditable(false);
		passwordField1.setText("");
		passwordField2.setVisible(false);
		passwordField2.setText("");
		lblPassword2.setVisible(false);
		btnSavePassword.setVisible(false);
		btnEditPassword.setVisible(true);
		btnCancelPassword.setVisible(false);
	}
	
	private void createSaveEmailButton(){
		btnSaveEmail = new JButton("Save");
		btnSaveEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveEmailAction();
			}
		});
		btnSaveEmail.setVisible(false);
		btnSaveEmail.setFont(new Font("Kristen ITC", Font.BOLD, 10));
		btnSaveEmail.setBorder(new LineBorder(new Color(0, 0, 0))); 
		btnSaveEmail.setBounds(331, 95, 56, 21);
		btnSaveEmail.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		btnSaveEmail.setForeground(Color.BLACK);
		contentPane.add(btnSaveEmail);
	}
	
	private void saveEmailAction(){
		String email = emailTextField.getText();
		changeEmail(email);
		
		emailTextField.setEditable(false);
		emailTextField.setText(userdata.getEmail());
		btnSaveEmail.setVisible(false);
		btnEditEmail.setVisible(true);
		btnCancelEmail.setVisible(false);
	}
	
	private void changePassword(String password1, String password2){
		lblError.setVisible(false);
		if (password1.equals(password2)){
			Change.password(password1, userdata);
		} else {
			lblError.setVisible(true);
		}
	}
	
	private void changeEmail(String email){
		//VERIFICAR FORMATO DE EMAIL
		lblEmailAlreadyExists.setVisible(false);
		lblConnectionError.setVisible(false);
		int x = Change.email(email, userdata);
		
		if (x==-1){
			lblEmailAlreadyExists.setVisible(true);
		} else if (x==-2){
			lblConnectionError.setVisible(true);
		}
		
	}
	
	private void changeUsername(String name){
		Change.userName(name, userdata);
	}

}
