package javaswing;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

// Frame 상속
public class App2 extends JFrame {
	public App2() {
		setTitle("Swing App");
		setSize(300, 100);
		getContentPane().add(new JButton("Ok"), BorderLayout.SOUTH);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	public static void main(String[] args) {
		App2 app = new App2();
		app.setVisible(true);
	}
}
