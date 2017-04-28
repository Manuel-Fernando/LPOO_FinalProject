package Gui;

import java.awt.Color;
import java.awt.EventQueue;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import client.UserData;
import mySQLConnection.ConnectorFile;

import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;

public class LogInMenu extends JFrame {

	private JPanel contentPane;
	private JTextField txtEmail;
	private JButton btnLogIn;
	private JLabel lblEmailWarning;
	private JLabel lblPasswordWarning;
	private UserData userdata = null;
	private JLabel lblEmailDontExist;
	private JLabel lblTitle;
	private JLabel lblEmail;
	private JPanel emailLine;
	private JLabel lblPassword;
	private JPanel passwordLine;
	private JPasswordField passwordField;
	private JButton btnSignIn;
	private JPanel horizontalSeparator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInMenu frame = new LogInMenu();
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
	public LogInMenu() {
		
		createJFrame();		
		createtitles();
		createWarnings();
		createLineSeparators();
		createTxtFields();
		createLogInButton();
		createSignInButton();
	}
	
	/**
	 * Criar os títulos do JFrame
	 */
	private void createtitles(){
		
		lblTitle = new JLabel("Chat");
		lblTitle.setFont(new Font("Kristen ITC", Font.BOLD, 24));
		lblTitle.setBounds(105, 11, 64, 33);
		lblTitle.setForeground(new Color (8, 83, 148));
		contentPane.add(lblTitle);
		
		lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Kristen ITC", Font.BOLD, 10));
		lblEmail.setForeground(new Color (8, 83, 148));
		lblEmail.setBounds(120, 64, 37, 14);
		contentPane.add(lblEmail);
		
		lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(8, 83, 148));
		lblPassword.setFont(new Font("Kristen ITC", Font.BOLD, 10));
		lblPassword.setBounds(108, 140, 69, 14);
		contentPane.add(lblPassword);
	}
	
	/**
	 * Criar o JFrame
	 */
	private void createJFrame(){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 291, 381);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	
	/**
	 * Criar os labels com os warnings
	 */
	private void createWarnings(){
		
		lblEmailWarning = new JLabel("Please insert a valid email");
		lblEmailWarning.setFont(new Font("Kristen ITC", Font.PLAIN, 9));
		lblEmailWarning.setForeground(new Color (8, 83, 148));
		lblEmailWarning.setVisible(false);
		lblEmailWarning.setBounds(83, 116, 112, 14);
		contentPane.add(lblEmailWarning);
		
		lblPasswordWarning = new JLabel("Please insert a password");
		lblPasswordWarning.setFont(new Font("Kristen ITC", Font.PLAIN, 9));
		lblPasswordWarning.setForeground(new Color (8, 83, 148));
		lblPasswordWarning.setVisible(false);
		lblPasswordWarning.setBounds(83, 178, 112, 14);
		contentPane.add(lblPasswordWarning);
		
		lblEmailDontExist = new JLabel("Email don't exist");
		lblEmailDontExist.setFont(new Font("Kristen ITC", Font.PLAIN, 9));
		lblEmailDontExist.setForeground(new Color (8, 83, 148));
		lblEmailDontExist.setVisible(false);
		lblEmailDontExist.setBounds(100, 78, 74, 14);
		contentPane.add(lblEmailDontExist);
	}
	
	/**
	 * Criar os separadores
	 */
	private void createLineSeparators(){
		
		horizontalSeparator = new JPanel();
		horizontalSeparator.setBackground(new Color(8, 83, 148, 70));
		horizontalSeparator.setBorder(new EmptyBorder(10,10,10,10));
		horizontalSeparator.setBounds(25, 50, 220, 3);
		contentPane.add(horizontalSeparator);
		
		passwordLine = new JPanel();
		passwordLine.setBorder(new EmptyBorder(10,10,10,10));
		passwordLine.setBackground(Color.BLACK);
		passwordLine.setBounds(75, 174, 128, 3);
		contentPane.add(passwordLine);
		
		emailLine = new JPanel();
		emailLine.setBorder(new EmptyBorder(10,10,10,10));
		emailLine.setBackground(Color.BLACK);
		emailLine.setBounds(75, 113, 128, 3);
		contentPane.add(emailLine);
	}
	
	/**
	 * Criar os campos de texto
	 */
	private void createTxtFields(){
		
		txtEmail = new JTextField();
		txtEmail.setBounds(75, 95, 128, 20);
		txtEmail.setBorder(null);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(75, 156, 128, 20);
		passwordField.setBorder(null);
		contentPane.add(passwordField);
	}
	
	/**
	 * Criar o botão de login
	 */
	private void createLogInButton(){
		
		btnLogIn = new JButton("Log In");
		btnLogIn.setFont(new Font("Kristen ITC", Font.BOLD, 10));
		btnLogIn.setBorder(new LineBorder(new Color(0, 0, 0))); 
		btnLogIn.setBounds(95, 214, 89, 23);
		btnLogIn.setBackground(new Color (8, 83, 148));
		btnLogIn.setForeground(Color.WHITE);
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				try {
					Connection connection = ConnectorFile.ConnectToMySQL();
					
					userdata = getInformationFromDB(connection);
					
//					userdata.setIpAddress(InetAddress.getLocalHost().getHostAddress());
//					
//					ServerSocket s = new ServerSocket(0);
//					userdata.setPortNumber(s.getLocalPort());
//					s.close();
		
					if (userdata!=null){
						ChatMenu CM = new ChatMenu();
						CM.setVisible(true);
					}


				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btnLogIn);
	}
	
	/**
	 * Criar o botão de signin
	 */
	private void createSignInButton(){
		
		btnSignIn = new JButton("Sign In");
		btnSignIn.setFont(new Font("Kristen ITC", Font.BOLD, 10));
		btnSignIn.setBorder(new LineBorder(new Color(0, 0, 0))); 
		btnSignIn.setBounds(95, 258, 89, 23);
		btnSignIn.setBackground(new Color (8, 83, 148));
		btnSignIn.setForeground(Color.WHITE);
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SignInMenu signIn = new SignInMenu();
				signIn.setVisible(true);
			}
		});
		contentPane.add(btnSignIn);
	}
	
	
	/**
	 * Método para obter a informação presente na base de dados e compará-la com a informação inserida pelo utilizador
	 * @param con Connection com a coneção à base de dados
	 * @return UserData com a informação do utilizador
	 * @throws SQLException
	 */
	private UserData getInformationFromDB(Connection con) throws SQLException{
		
		ResultSet rs = ConnectorFile.SearchMySQLData(con, "SELECT email, nome, password FROM utilizador WHERE email = '" + getEmail() + "' ");		
		boolean exists = false, validPassword = false;
		UserData user = null;

		while(rs.next()){
			String email  = rs.getString("email");
			String nome = rs.getString("nome");
			String password = rs.getString("password");
			
			if (email.equals(getEmail())){
				exists = true;
				if (password.equals(getPassword())){
					validPassword=true;
					user = new UserData(email, nome, password);
					break;
				}				        	 
			}
		}
		
		if (exists==false){
			lblEmailDontExist.setVisible(true);
		} else {
			lblEmailDontExist.setVisible(false);
		}
		
		if (validPassword==false){
			lblPasswordWarning.setVisible(true);
		} else {
			lblPasswordWarning.setVisible(false);
		}
		
		return user;
	}
	
	/**
	 * Método para obter o email introduzido pelo utilizador
	 * @return String com o email introduzido
	 */
	private String getEmail(){
		String email = txtEmail.getText();
		
		if (email.isEmpty()){
			lblEmailWarning.setVisible(true);
		} else {
			lblEmailWarning.setVisible(false);
		}
		
		//VERIFICAR SE O UTILIZADOR INTRODUZ FORMATO DE EMAIL
		
		return email;
	}
	
	/**
	 * Método para obter a password introduzida pelo utilizador
	 * @return String com a password introduzida
	 */
	private String getPassword(){
		String password = passwordField.getText();
		
		if (!password.isEmpty()){
			lblPasswordWarning.setVisible(false);
		} else {
			lblPasswordWarning.setVisible(true);
		}
		
		return password;		
	}
}
