package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import client.SendMessage;
import client.UserData;
import server.SendMessageRequest;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ChatMenu extends JFrame {

	private JPanel contentPane;
	private JTextField messageTextField;
	private JTextField searchTextField;
	private JTextArea friendsTextArea;
	private JTextArea messagesTextArea;
	private JButton btnSend;
	private JButton btnSearch;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatMenu frame = new ChatMenu();
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
	public ChatMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		friendsTextArea = new JTextArea();
		friendsTextArea.setBounds(408, 45, 126, 232);
		contentPane.add(friendsTextArea);
		
		messagesTextArea = new JTextArea();
		messagesTextArea.setBounds(10, 45, 375, 232);
		contentPane.add(messagesTextArea);
		
		messageTextField = new JTextField();
		messageTextField.setBounds(10, 288, 375, 32);
		contentPane.add(messageTextField);
		messageTextField.setColumns(10);
		
		btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ENVIAR MENSAGEM
			}
		});
		btnSend.setBounds(431, 293, 89, 23);
		contentPane.add(btnSend);
		
		searchTextField = new JTextField();
		searchTextField.setToolTipText("");
		searchTextField.setBounds(10, 12, 145, 20);
		contentPane.add(searchTextField);
		searchTextField.setColumns(10);
		
		btnSearch = new JButton("Search ");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//VERIFICAR SE O NOME EXISTE NA BASE DE DADOS E MOSTRAR
			}
		});
		btnSearch.setBounds(165, 11, 89, 23);
		contentPane.add(btnSearch);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Settings", "Log Out"}));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedItem().equals("Settings")){
					SettingsMenu settings = new SettingsMenu();
					settings.setVisible(true);
				} else if (comboBox.getSelectedItem().equals("Log Out")){
					//LOG OUT
				}
			}
		});
		comboBox.setBounds(408, 14, 126, 20);
		contentPane.add(comboBox);		
	}
}
