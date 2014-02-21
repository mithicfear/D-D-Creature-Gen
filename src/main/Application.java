/**
 * This is the Application class. It's the class that handles everything that the application does. Here you will find
 * the JFrame window and everything in it. Everything done with the buttons are done here as well. This is basically
 * the class with all of the program logic in it.
 * @author James Jackson
 * @author Philip Taylor
 */
package main;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Application {
	
	public Application(){ 	//This is the list of stages the program will go through in it's lifespan.
		initialize();
		update();
	}
	
	/** Creates JFrame, JPanels, and combo boxes. */
	public static void initialize() {
		JFrame window = new JFrame("D&D Stuff!");
		window.setSize(800, 600);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel top = new JPanel();		//Using JPanels to put uneditable combo boxes on the screen.
		JPanel mid = new JPanel();
		JPanel bot = new JPanel();
		top.setBounds(0, 0, 800, 200);
		mid.setBounds(0, 200, 800, 200);
		bot.setBounds(0, 400, 800, 200);
		
		window.setVisible(true);
	}
	
	protected static void update() {
		
	}
	
	/** This gets input, may make class for this. */
	protected static void collectData() {
		
	}
	
}
