package Gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import client.LogIn;
import client.Register;
import client.UserData;
import mySQLConnection.ConnectorFile;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class SignInMenu extends JFrame {

	private JPanel contentPane;
	private JLabel lblEmail;
	private JLabel lblUsername;
	private JLabel lblEnterAPassword;
	private JLabel lblReWriteYour;
	private JButton btnSignIn;
	private JLabel lblTitle;
	private JPanel horizontalSeparator;
	private JLabel lblEmailAlreadyTaken;
	private JPanel lineUsername;
	private JPanel lineEmail;
	private JPanel linePassword;
	private JPanel linePassword2;
	private JTextField usernameTxtField;
	private JTextField emailTxtField;
	private JPasswordField passwordField1;
	private JPasswordField passwordField2;
	private JButton btnBack;
	private ConnectorFile connectorFile;
	private String email, username, password;
	private JLabel lblAllFieldsAre;
	private JLabel lblPasswordsMustBe;
	private static JFrame jframeLogIn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignInMenu frame = new SignInMenu(jframeLogIn);
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
	public SignInMenu(JFrame j) {
		this.jframeLogIn = j;
		createJFrame();
		createLabels();
		createWarnings();
		createTextFields();
		createSeparators();
		createSignInButton();
		createBackButton();
	}
	
	private void createJFrame(){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	
	private void createLabels(){
		
		lblTitle = new JLabel("Chat");
		lblTitle.setFont(new Font("Kristen ITC", Font.BOLD, 24));
		lblTitle.setBounds(164, 11, 64, 33);
		lblTitle.setForeground(new Color (8, 83, 148));
		contentPane.add(lblTitle);
		
		lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Kristen ITC", Font.BOLD, 10));
		lblUsername.setForeground(new Color (8, 83, 148));
		lblUsername.setBounds(40, 71, 74, 14);
		contentPane.add(lblUsername);
		
		lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Kristen ITC", Font.BOLD, 10));
		lblEmail.setForeground(new Color (8, 83, 148));
		lblEmail.setBounds(40, 117, 68, 14);
		contentPane.add(lblEmail);
		
		lblEnterAPassword = new JLabel("Password");
		lblEnterAPassword.setFont(new Font("Kristen ITC", Font.BOLD, 10));
		lblEnterAPassword.setForeground(new Color (8, 83, 148));
		lblEnterAPassword.setBounds(40, 163, 68, 14);
		contentPane.add(lblEnterAPassword);
		
		lblReWriteYour = new JLabel("Re write your password");
		lblReWriteYour.setFont(new Font("Kristen ITC", Font.BOLD, 10));
		lblReWriteYour.setForeground(new Color (8, 83, 148));
		lblReWriteYour.setBounds(40, 209, 152, 14);
		contentPane.add(lblReWriteYour);
	}
	
	private void createWarnings(){
		
		lblEmailAlreadyTaken = new JLabel("Email already taken");
		lblEmailAlreadyTaken.setFont(new Font("Kristen ITC", Font.PLAIN, 9));
		lblEmailAlreadyTaken.setVisible(false);
		lblEmailAlreadyTaken.setForeground(new Color (8, 83, 148));
		lblEmailAlreadyTaken.setBounds(247, 136, 89, 14);
		contentPane.add(lblEmailAlreadyTaken);
		
		lblAllFieldsAre = new JLabel("All fields are mandatory");
		lblAllFieldsAre.setFont(new Font("Kristen ITC", Font.PLAIN, 9));
		lblAllFieldsAre.setVisible(false);
		lblAllFieldsAre.setForeground(new Color (8, 83, 148));
		lblAllFieldsAre.setBounds(145, 234, 113, 14);
		contentPane.add(lblAllFieldsAre);
		
		lblPasswordsMustBe = new JLabel("Passwords must be the same");
		lblPasswordsMustBe.setFont(new Font("Kristen ITC", Font.PLAIN, 9));
		lblPasswordsMustBe.setVisible(false);
		lblPasswordsMustBe.setForeground(new Color (8, 83, 148));
		lblPasswordsMustBe.setBounds(227, 181, 128, 14);
		contentPane.add(lblPasswordsMustBe);
	}
	
	private void createTextFields(){
		
		usernameTxtField = new JTextField();
		usernameTxtField.setBounds(227, 68, 128, 20);
		usernameTxtField.setBorder(null);
		contentPane.add(usernameTxtField);
		usernameTxtField.setColumns(10);
		
		emailTxtField = new JTextField();
		emailTxtField.setBounds(227, 114, 128, 20);
		emailTxtField.setBorder(null);
		contentPane.add(emailTxtField);
		emailTxtField.setColumns(10);
		
		passwordField1 = new JPasswordField();
		passwordField1.setBounds(227, 160, 128, 20);
		passwordField1.setBorder(null);
		contentPane.add(passwordField1);
		
		passwordField2 = new JPasswordField();
		passwordField2.setBorder(null);
		passwordField2.setBounds(227, 206, 128, 20);
		contentPane.add(passwordField2);
	}
	
	private void createSeparators(){
		
		horizontalSeparator = new JPanel();
		horizontalSeparator.setBorder(new EmptyBorder(10,10,10,10));
		horizontalSeparator.setBackground(new Color(8, 83, 148, 70));
		horizontalSeparator.setBounds(20, 45, 335, 2);
		contentPane.add(horizontalSeparator);
		
		lineUsername = new JPanel();
		lineUsername.setBorder(new EmptyBorder(10,10,10,10));
		lineUsername.setBackground(Color.BLACK);
		lineUsername.setBounds(227, 87, 128, 3);
		contentPane.add(lineUsername);
		
		lineEmail = new JPanel();
		lineEmail.setBorder(new EmptyBorder(10,10,10,10));
		lineEmail.setBackground(Color.BLACK);
		lineEmail.setBounds(227, 133, 128, 3);
		contentPane.add(lineEmail);
		
		linePassword = new JPanel();
		linePassword.setBorder(new EmptyBorder(10,10,10,10));
		linePassword.setBackground(Color.BLACK);
		linePassword.setBounds(227, 179, 128, 3);
		contentPane.add(linePassword);
		
		linePassword2 = new JPanel();
		linePassword2.setBorder(new EmptyBorder(10,10,10,10));
		linePassword2.setBackground(Color.BLACK);
		linePassword2.setBounds(227, 225, 128, 3);
		contentPane.add(linePassword2);
	}
	
	private void createSignInButton(){
		
		btnSignIn = new JButton("Sign In");
		btnSignIn.setFont(new Font("Kristen ITC", Font.BOLD, 10));
		btnSignIn.setBorder(new LineBorder(new Color(0, 0, 0))); 
		btnSignIn.setBackground(new Color (8, 83, 148));
		btnSignIn.setForeground(Color.WHITE);
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				UserData meu = new UserData(getEmail(), getPassword());
				meu.setUserName(getName());
				int x = Register.RegisterRequest(meu);

				if (x == 1) {
					lblEmailAlreadyTaken.setVisible(true);
					lblAllFieldsAre.setVisible(false);
				} else if (x == 2){
					lblEmailAlreadyTaken.setVisible(false);	
					lblAllFieldsAre.setVisible(false);
					LogInMenu login = new LogInMenu();
					login.setVisible(true);
				} else if (x == 4){
					lblAllFieldsAre.setVisible(true);
					lblEmailAlreadyTaken.setVisible(false);
				}

			}
		});
		btnSignIn.setBounds(151, 262, 89, 23);
		contentPane.add(btnSignIn);
		
	}
	
	private void createBackButton(){
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jframeLogIn.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Kristen ITC", Font.BOLD, 9));
		btnBack.setBorder(new LineBorder(new Color(0, 0, 0))); 
		btnBack.setBackground(new Color (8, 83, 148));
		btnBack.setForeground(Color.WHITE);
		btnBack.setBounds(20, 21, 45, 20);
		contentPane.add(btnBack);
	}
	
	private String getEmail(){
		email = emailTxtField.getText();
		
		//VERIFICAR SE O UTILIZADOR INTRODUZ EMAIL
		
		return email;
	}
	
	private String getPassword(){
		String password1 = passwordField1.getText();
		String password2 = passwordField2.getText();
		
		if (!password1.isEmpty() && !password2.isEmpty()){
			if (!password1.equals(password2)){
				lblPasswordsMustBe.setVisible(true);
			} else {
				lblPasswordsMustBe.setVisible(false);
				password = password1;
			}
		}
		
		return password;		
	}
	
	private String getUsername(){
		String user = usernameTxtField.getText();
		
		return user;
	}
}
