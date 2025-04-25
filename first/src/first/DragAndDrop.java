package first;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DragAndDrop {

	private JFrame frame;
	private JTextField textRegNo;
	private JTextField textName;

	/**
	 * Launch the application.
	 */
	public void Main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DragAndDrop window = new DragAndDrop();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DragAndDrop() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Drag and Drop");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRegNo = new JLabel("RegNo");
		lblRegNo.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblRegNo);
		
		textRegNo = new JTextField();
		textRegNo.setBounds(77, 8, 166, 20);
		frame.getContentPane().add(textRegNo);
		textRegNo.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 55, 46, 14);
		frame.getContentPane().add(lblName);
		
		textName = new JTextField();
		textName.setBounds(77, 52, 166, 20);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textRegNo.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Enter RegNo");
					textRegNo.requestFocus();
					return;
				}
				if(textName.getText().length() == 0) {
					JOptionPane.showMessageDialog(null, "Enter Name");
					textName.requestFocus();
					return;
				}
				JOptionPane.showMessageDialog(null, "Record Saved");
				textRegNo.setText("");
				textName.setText("");
				textRegNo.requestFocus();
			}
		});
		btnSave.setBounds(53, 227, 89, 23);
		frame.getContentPane().add(btnSave);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(170, 227, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textName.setText("");
				textRegNo.setText("");
			}
		});
		btnClear.setBounds(296, 227, 89, 23);
		frame.getContentPane().add(btnClear);
	}
}
