package javaswing2;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

// JFrame 상속
public class App extends JFrame {
	public App() {
		setTitle("Swing App");
		setSize(300, 100);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				App app = new App();
				app.setVisible(true);
				
				System.out.println(Thread.currentThread().getName());	
			}
		});		
	}
}

// 출력 : 
// AWT-EventQueue-0
