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
import java.awt.Font;
import java.awt.event.ActionListener;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SettingsMenu frame = new SettingsMenu();
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
	public SettingsMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblUsername = new JLabel("Username");
		lblUsername.setBounds(33, 67, 60, 14);
		contentPane.add(lblUsername);
		
		UsernameTextField = new JTextField();
		UsernameTextField.setEditable(false);
		UsernameTextField.setBounds(155, 64, 86, 20);
		contentPane.add(UsernameTextField);
		UsernameTextField.setColumns(10);
		
		lblEmail = new JLabel("Email");
		lblEmail.setBounds(33, 99, 46, 14);
		contentPane.add(lblEmail);
		
		emailTextField = new JTextField();
		emailTextField.setEditable(false);
		emailTextField.setBounds(155, 96, 86, 20);
		contentPane.add(emailTextField);
		emailTextField.setColumns(10);
		
		lblPassword1 = new JLabel("Password");
		lblPassword1.setBounds(33, 137, 60, 14);
		contentPane.add(lblPassword1);
		
		passwordField1 = new JPasswordField();
		passwordField1.setEditable(false);
		passwordField1.setBounds(155, 134, 86, 20);
		contentPane.add(passwordField1);
		
		passwordField2 = new JPasswordField();
		passwordField2.setVisible(false);
		passwordField2.setBounds(155, 165, 86, 20);
		contentPane.add(passwordField2);
		
		lblPassword2 = new JLabel("Re-enter Password");
		lblPassword2.setVisible(false);
		lblPassword2.setBounds(33, 168, 110, 14);
		contentPane.add(lblPassword2);
		
		lblError = new JLabel("Passwords don't match");
		lblError.setVisible(false);
		lblError.setBounds(155, 196, 140, 14);
		contentPane.add(lblError);
		
		btnEditUsername = new JButton("Edit");
		btnEditUsername.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsernameTextField.setText("");
				UsernameTextField.setEditable(true);
				btnSaveUsername.setVisible(true);
				btnEditUsername.setVisible(false);
				btnCancelUsername.setVisible(true);
			}
		});
		btnEditUsername.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnEditUsername.setBounds(265, 63, 56, 21);
		contentPane.add(btnEditUsername);
		
		btnEditEmail = new JButton("Edit");
		btnEditEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				emailTextField.setText("");
				emailTextField.setEditable(true);
				btnSaveEmail.setVisible(true);
				btnEditEmail.setVisible(false);
				btnCancelEmail.setVisible(true);
			}
		});
		btnEditEmail.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnEditEmail.setBounds(265, 95, 56, 21);
		contentPane.add(btnEditEmail);
		
		btnEditPassword = new JButton("Edit");
		btnEditPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordField1.setText("");
				passwordField1.setEditable(true);
				passwordField2.setVisible(true);
				lblPassword2.setVisible(true);
				btnSavePassword.setVisible(true);
				btnEditPassword.setVisible(false);
				btnCancelPassword.setVisible(true);
			}
		});
		btnEditPassword.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnEditPassword.setBounds(265, 133, 56, 21);
		contentPane.add(btnEditPassword);
		
		btnSaveUsername = new JButton("Save");
		btnSaveUsername.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//VERIFICAR SE É POSSÍVEL E GUARDAR NA BASE DE DADOS
			}
		});
		btnSaveUsername.setVisible(false);
		btnSaveUsername.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnSaveUsername.setBounds(331, 63, 56, 21);
		contentPane.add(btnSaveUsername);
		
		btnSaveEmail = new JButton("Save");
		btnSaveEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//VERIFICAR SE É POSSÍVEL E GUARDAR NA BASE DE DADOS
			}
		});
		btnSaveEmail.setVisible(false);
		btnSaveEmail.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnSaveEmail.setBounds(331, 95, 56, 21);
		contentPane.add(btnSaveEmail);
		
		btnSavePassword = new JButton("Save");
		btnSavePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//VERIFICAR SE AS PASSWORDS SÃO IGUAIS E GUARDA NA BASE DE DADOS
				}
		});
		btnSavePassword.setVisible(false);
		btnSavePassword.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnSavePassword.setBounds(331, 133, 56, 21);
		contentPane.add(btnSavePassword);
		
		btnCancelUsername = new JButton("Cancel");
		btnCancelUsername.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsernameTextField.setEditable(false);
				btnSaveUsername.setVisible(false);
				btnEditUsername.setVisible(true);
				btnCancelUsername.setVisible(false);
				//DEIXAR TUDO COMO ESTAVA ANTES
			}
		});
		btnCancelUsername.setVisible(false);
		btnCancelUsername.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnCancelUsername.setBounds(397, 63, 62, 21);
		contentPane.add(btnCancelUsername);
		
		btnCancelEmail = new JButton("Cancel");
		btnCancelEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				emailTextField.setEditable(false);
				btnSaveEmail.setVisible(false);
				btnEditEmail.setVisible(true);
				btnCancelEmail.setVisible(false);
				//DEIXAR TUDO COMO ESTAVA ANTES
			}
		});
		btnCancelEmail.setVisible(false);
		btnCancelEmail.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnCancelEmail.setBounds(397, 95, 62, 21);
		contentPane.add(btnCancelEmail);
		
		btnCancelPassword = new JButton("Cancel");
		btnCancelPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordField1.setEditable(false);
				passwordField2.setVisible(false);
				lblPassword2.setVisible(false);
				btnSavePassword.setVisible(false);
				btnEditPassword.setVisible(true);
				btnCancelPassword.setVisible(false);
				//DEIXAR TUDO COMO ESTAVA ANTES
			}
		});
		btnCancelPassword.setVisible(false);
		btnCancelPassword.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnCancelPassword.setBounds(397, 133, 62, 21);
		contentPane.add(btnCancelPassword);
	}

}
