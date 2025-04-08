package bse1_oop_groupa_2022;

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

public class LoginNew extends JFrame {
	

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginNew frame = new LoginNew();
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
	public LoginNew() {
		String username;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("UserName");
		lblName.setBounds(38, 55, 60, 14);
		contentPane.add(lblName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(38, 137, 46, 14);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(108, 52, 155, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(108, 134, 155, 20);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("JOHN") && passwordField.getText().equals("john")) {
			 	//username = textField.getText();
				new LoginNewInner().setVisible(true);
			}
			}
		});
		btnLogin.setBounds(55, 214, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBounds(220, 214, 89, 23);
		contentPane.add(btnExit);
	}
}
