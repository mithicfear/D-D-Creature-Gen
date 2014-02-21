/**
 * This is the Application class. It's the class that handles everything that the application does. Here you will find
 * the JFrame window and everything in it. Everything done with the buttons are done here as well. This is basically
 * the class with all of the program logic in it.
 * @author James Jackson
 * @author Philip Taylor
 */
package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Application {
	
	static JButton beginButton = new JButton("Begin");
	static JButton exitButton = new JButton("Exit");
	static boolean running = true;
	
	public Application(){
		initialize();
		update();
	}
	
	public static void initialize() {
		JFrame window = new JFrame("D&D Stuff!");
		window.setSize(800, 600);
		window.setLocationRelativeTo(null);
		
		beginButton.setSize(100, 25);
		beginButton.setLocation(800 / 2, 600 / 2);
		
		exitButton.setSize(100, 25);
		exitButton.setLocation(800 / 2, 600 / 2);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		window.add(beginButton);
		window.add(exitButton);
		window.setVisible(true);
	}
	
	protected static void update() {
		
	}
	
	protected static void checkButtons() {
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		beginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				collectData();
			}
		});
	}
	
	protected static void collectData() {
		
	}
	
}
