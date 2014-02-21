/**
 * This is the Application class. It's the class that handles everything that the application does. Here you will find
 * the JFrame window and everything in it. Everything done with the buttons are done here as well. This is basically
 * the class with all of the program logic in it.
 * @author James Jackson
 * @author Philip Taylor
 */
package main;

import javax.swing.JComboBox;
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
		String[] levelNums = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",	//Set up arrays for combo boxes.
			"12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24",
			"25", "26", "27", "28", "29", "30", "31", "32"};		//Levels 1-32 (hehehe), Strings for all class and race names.
		String[] classNames = {"Ardent", "Avenger", "Barbarian", "Bard", "Battlemind",
			"Cleric", "Druid", "Fighter", "Invoker","Monk", "Paladin", "Psion", "Ranger",
			"Rogue", "Runepriest", "Seeker","Shaman", "Sorcerer", "Warden", "Warlock", "Warlord", "Wizard"};
		String[] raceNames = {"Deva", "Dragonborn", "Dwarf", "Eladrin", "Elf", "Githzerai",
			"Gnome", "Goliath", "Half-Elf", "Half-Orc", "Halfling", "Human", "Minotaur",
			"Shardmind", "Shifter", "Tiefling", "Wilden", };
		JComboBox races = new JComboBox(raceNames);
		JComboBox classes = new JComboBox(classNames);
		JComboBox levels = new JComboBox(levelNums);
		window.setVisible(true);
	}
	
	protected static void update() {
		
	}
	
	/** This gets input, may make class for this. */
	protected static void collectData() {
		
	}
	
}
