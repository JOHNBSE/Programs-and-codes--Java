package bse1_oop_groupa_2022;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class LoginNewInner extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldInner;

	/**
	 * Launch the application.
	 */
	public void Main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginNewInner frame = new LoginNewInner();
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
	public LoginNewInner() {
		textFieldInner.setText("Welcome: ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldInner = new JTextField();
		textFieldInner.setBounds(138, 110, 139, 20);
		contentPane.add(textFieldInner);
		textFieldInner.setColumns(10);
	}

}
