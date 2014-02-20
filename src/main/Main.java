
package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Main {

	static JButton beginButton = new JButton("Begin");
	static JButton exitButton = new JButton("Exit");
	static boolean running = true;
	
	public static void main(String[] args) {

		initialize();
		checkButtons();


	}
	
	
	public static void initialize() {
		JFrame window = new JFrame("D&D Stuff!");
		window.setSize(800, 600);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		beginButton.setSize(100, 25);
		beginButton.setLocation(800 / 2, 600 / 2);
		
		exitButton.setSize(100, 25);
		exitButton.setLocation(800 / 2, 600/3);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		window.add(beginButton);
		window.add(exitButton);
		beginButton.show();
		exitButton.show();
	}
	
	public static void checkButtons() {
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				running = false;
			}
		});
		
		beginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startApplication();
			}
		});
	}
	
	public static void startApplication() {
		
	}

}
