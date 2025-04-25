package first;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField textUserName;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setTitle("LOG IN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("UserName");
		lblName.setBounds(10, 11, 80, 17);
		contentPane.add(lblName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 68, 46, 14);
		contentPane.add(lblPassword);
		
		textUserName = new JTextField();
		textUserName.setBounds(84, 9, 212, 20);
		contentPane.add(textUserName);
		textUserName.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(84, 65, 212, 20);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textUserName.getText().length() == 0) {
					JOptionPane.showMessageDialog(null, "Field UserName requires input");
					textUserName.requestFocus();
					return;
				}if(passwordField.getText().length()==0) {
					JOptionPane.showMessageDialog(null, "Field Password requires input");
					passwordField.requestFocus();
					return;
				}
				
				if(textUserName.getText().equals("John") && passwordField.getText().equals("John")) {
					new DragAndDrop().Main();
					dispose();
				}
			}
		});
		btnLogin.setBounds(53, 214, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(233, 214, 89, 23);
		contentPane.add(btnExit);
	}
}
