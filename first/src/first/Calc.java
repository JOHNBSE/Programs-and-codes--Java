package first;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc frame = new Calc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	static int value1;
	static int value2;
	static String operator;

	/**
	 * Create the frame.
	 */
	public Calc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 414, 64);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if(textField.getText().isEmpty())
			        {
			            textField.setText(btn1.getText());
			            value1 = 1;          
			        } 
				 else {
			            textField.setText(textField.getText()+ "" + btn1.getText());
			            value2 = 1;
			        }
			}
		});
		btn1.setBounds(10, 95, 89, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().length()==0) {
					textField.setText(btn2.getText());
					value1 = 2;
				}else {
					textField.setText(textField.getText()+ "" + btn2.getText());
					value2 = 2;
				}
			}});
		btn2.setBounds(113, 95, 89, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()) {
					textField.setText(btn3.getText());
					value1 = 3;
				}else {
					textField.setText(textField.getText()+ "" + btn3.getText());
					value2 = 3;
				}
			}
		});
		btn3.setBounds(224, 95, 89, 23);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().length() == 0){
					textField.setText(btn4.getText());
					value1 = 4;
				}else {
					textField.setText(textField.getText()+ "" + btn4.getText());
					value2 = 4;
				}
				}
		});
		btn4.setBounds(10, 129, 89, 23);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()) {
					textField.setText(btn5.getText());
					value1 = 5;
				}else {
					textField.setText(textField.getText()+ "" + btn5.getText());
					value2 = 5;
				}
			}
		});
		btn5.setBounds(113, 129, 89, 23);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()) {
					textField.setText(btn6.getText());
					value1 = 6;
				}else {
					textField.setText(textField.getText()+ "" + btn6.getText());
					value2 = 6;
				}
			}
		});
		btn6.setBounds(224, 129, 89, 23);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()) {
					textField.setText(btn7.getText());
					value1 = 7;
				}else {
					textField.setText(textField.getText()+ "" + btn7.getText());
					value2 = 7;
				}
			}
		});
		btn7.setBounds(10, 163, 89, 23);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()) {
					textField.setText(btn8.getText());
					value1 = 8;
				}else {
					textField.setText(textField.getText()+ "" + btn8.getText());
					value2 = 8;
				}
			}
		});
		btn8.setBounds(113, 163, 89, 23);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()) {
					textField.setText(btn9.getText());
					value1 = 9;
				}else {
					textField.setText(textField.getText()+ "" + btn9.getText());
					value2 = 9;
				}
			}
		});
		btn9.setBounds(224, 163, 89, 23);
		contentPane.add(btn9);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 double answer = 0;
		         if(operator == "Add")
		             answer = value1 + value2;
		         else if(operator== "Subtract")
		             answer = value1 - value2;
		         else if (operator == "Product")
		             answer = value1 * value2;
		         else if(operator == "Divide")
		             answer = value1/value2;
		        
		         String Result = Double.toString(answer);
		         textField.setText(Result);
			}
		});
		
		btnEquals.setBounds(335, 197, 89, 23);
		contentPane.add(btnEquals);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()) {
					textField.setText(btn0.getText());
					value1 = 0;
				}else {
					textField.setText(textField.getText()+ "" + btn0.getText());
					value2 = 0;
				}
			}
		});
		btn0.setBounds(113, 197, 89, 23);
		contentPane.add(btn0);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().length() != 0) {
					operator = "Subtract";
					textField.setText(textField.getText()+ "-");
				}
			}
		});
		btnSub.setBounds(335, 129, 89, 23);
		contentPane.add(btnSub);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().length() != 0){
			        operator = "Add";
			        textField.setText(textField.getText()+ "+");
			        }
			}
		});
		btnAdd.setBounds(335, 95, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnPro = new JButton("*");
		btnPro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().length() != 0){
			        operator = "Product";
			        textField.setText(textField.getText()+ "*");
			        }
			}
		});
		btnPro.setBounds(224, 197, 89, 23);
		contentPane.add(btnPro);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().length() != 0){
			        operator = "Divide";
			        textField.setText(textField.getText()+ "/");
			        }
			}
		});
		btnDiv.setBounds(335, 163, 89, 23);
		contentPane.add(btnDiv);
		
		JButton btnClear = new JButton("CE");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");	
				textField.requestFocus();
				}
		});
		btnClear.setBounds(10, 197, 89, 23);
		contentPane.add(btnClear);
		
	}
}
