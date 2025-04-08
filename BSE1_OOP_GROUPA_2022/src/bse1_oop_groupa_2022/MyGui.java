package bse1_oop_groupa_2022;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class MyGui {

	public static void main(String[] args) {
		MyJFrame frame = new MyJFrame();
		WindowQuitter wquit = new WindowQuitter();
		frame.addWindowListener(wquit);
		
		//JFrame frame = new JFrame("Title of the window");
		frame.setSize(600,1000);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.black);
		

	   
	}

}

class MyJFrame extends JFrame implements ActionListener{
	//declare JButton variable
	JButton aChange, bChange;
	
	
	MyJFrame(){
		super.setTitle("My Window");
		//create JButton
		aChange = new JButton("save");
		bChange = new JButton("Exit");
		
		//add listener
		aChange.addActionListener(this);
		bChange.addActionListener(this);
		
		//set the FlowLayout manager
		getContentPane().setLayout(new FlowLayout());
		
		//add the button onto the frame
		getContentPane().add(aChange);
		getContentPane().add(bChange);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String clicked;
		clicked = e.getActionCommand();
		if (clicked.equals("save")) {
			System.out.println("Save was clicked");
		}else if(clicked.equals("Exit")) {
			System.exit(0);
		}
		
	}
}

class WindowQuitter extends WindowAdapter{
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	
}
}