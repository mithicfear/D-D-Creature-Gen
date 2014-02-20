
package main;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		initialize();

	}
	
	@SuppressWarnings("deprecation")
	public static void initialize() {
		JFrame window = new JFrame("D&D Stuff!");
		window.setSize(800, 600);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		JButton butts = new JButton();
		butts.setSize(100, 25);
		butts.setLocation(800 / 2, 600 / 2);
		butts.setText("THIS IS BUTTS");
		JButton mensAsses = new JButton();
		mensAsses.setSize(100, 25);
		mensAsses.setLocation(800 / 2, 600/3);
		mensAsses.setText("HARRY BUTTZ");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		window.add(butts);
		window.add(mensAsses);
		butts.show();
		mensAsses.show();
	}

}
