package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignInMenu extends JFrame {

	private JPanel contentPane;
	private JTextField emailTextField;
	private JTextField UsernameTextField;
	private JPasswordField passwordField1;
	private JPasswordField passwordField2;
	private JLabel lblEmail;
	private JLabel lblUsername;
	private JLabel lblEnterAPassword;
	private JLabel lblReWriteYour;
	private JButton btnSignIn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignInMenu frame = new SignInMenu();
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
	public SignInMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		emailTextField = new JTextField();
		emailTextField.setBounds(220, 99, 86, 20);
		contentPane.add(emailTextField);
		emailTextField.setColumns(10);
		
		lblEmail = new JLabel("Email");
		lblEmail.setBounds(167, 108, 24, 14);
		contentPane.add(lblEmail);
		
		UsernameTextField = new JTextField();
		UsernameTextField.setBounds(220, 68, 86, 20);
		contentPane.add(UsernameTextField);
		UsernameTextField.setColumns(10);
		
		lblUsername = new JLabel("Username");
		lblUsername.setBounds(145, 71, 52, 14);
		contentPane.add(lblUsername);
		
		passwordField1 = new JPasswordField();
		passwordField1.setBounds(220, 136, 86, 20);
		contentPane.add(passwordField1);
		
		passwordField2 = new JPasswordField();
		passwordField2.setBounds(220, 167, 86, 20);
		contentPane.add(passwordField2);
		
		lblEnterAPassword = new JLabel("Password");
		lblEnterAPassword.setBounds(145, 139, 46, 14);
		contentPane.add(lblEnterAPassword);
		
		lblReWriteYour = new JLabel("Re write your password");
		lblReWriteYour.setBounds(77, 173, 114, 14);
		contentPane.add(lblReWriteYour);
		
		btnSignIn = new JButton("Sign In");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//VERIFICAR SE JÁ EXISTE NA BASE DE DADOS
				//SE NÃO EXISTIR GUARDAR NA BASE DE DADOS
			}
		});
		btnSignIn.setBounds(179, 209, 89, 23);
		contentPane.add(btnSignIn);
	}
}
