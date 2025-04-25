<<<<<<< HEAD
package first;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class Button extends JFrame implements ActionListener{
	JButton aChange;
	
	Button(){
		aChange = new JButton("Color");
		
		getContentPane().add(aChange);
		aChange.addActionListener(this);
		
		getContentPane().setLayout(new FlowLayout());
		getContentPane().setBackground(Color.cyan);
	}
	

	public static void main(String[] args) {
		Button b = new Button();
		b.setSize(600, 700);
		b.setVisible(true);
		b.setTitle("window");
		
		WindowQuitter wquit = new WindowQuitter();
		b.addWindowListener(wquit);
		
		

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String Clicked = e.getActionCommand();
		
		if(Clicked.equals("Color")) {
			getContentPane().setBackground(Color.BLACK);
		}else {
			System.exit(0);
		}
		
	}

}
class WindowQuitter extends WindowAdapter {
	public void WindowClosing(WindowEvent e) {
		System.exit(0);
	}
	
}
=======
package first;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class Button extends JFrame implements ActionListener{
	JButton aChange;
	
	Button(){
		aChange = new JButton("Color");
		
		getContentPane().add(aChange);
		aChange.addActionListener(this);
		
		getContentPane().setLayout(new FlowLayout());
		getContentPane().setBackground(Color.cyan);
	}
	

	public static void main(String[] args) {
		Button b = new Button();
		b.setSize(600, 700);
		b.setVisible(true);
		b.setTitle("window");
		
		WindowQuitter wquit = new WindowQuitter();
		b.addWindowListener(wquit);
		
		

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String Clicked = e.getActionCommand();
		
		if(Clicked.equals("Color")) {
			getContentPane().setBackground(Color.BLACK);
		}else {
			System.exit(0);
		}
		
	}

}
class WindowQuitter extends WindowAdapter {
	public void WindowClosing(WindowEvent e) {
		System.exit(0);
	}
	
}
>>>>>>> 2d984131f8fe9a0d2c2a1444e0b22ee4750fa0c0
