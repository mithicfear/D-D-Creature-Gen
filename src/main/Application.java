/**
 * This is the Application class. It's the class that handles everything that the application does. Here you will find
 * the JFrame window and everything in it. Everything done with the buttons are done here as well. This is basically
 * the class with all of the program logic in it.
 * @author James Jackson
 * @author Philip Taylor
 */
package main;

import creature.Creature;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Application {
	
	JComboBox races = new JComboBox();		//Define the combo boxes.
	JComboBox classes = new JComboBox();
	JComboBox levels = new JComboBox();
	static JFrame window = new JFrame("D&D Stuff!"); //Define the JFrame.
	static JPanel top = new JPanel();		//Define JPanels to put uneditable combo boxes on the screen.
	static JPanel mid = new JPanel();
	static JPanel bot = new JPanel();
	
	public Application(){ 	//This is the list of stages the program will go through in it's lifespan.
		initializeFrame();
		initializeBoxes();
	}
	
	/** Creates JFrame, JPanels, and combo boxes. */
	public static void initializeFrame() {
		
		window.setSize(800, 600);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		top.setBounds(0, 0, 800, 200);
		mid.setBounds(0, 200, 800, 200);
		bot.setBounds(0, 400, 800, 200);
		window.setVisible(true);
	}
	
	/** This method fills the boxes with information, */
	protected void initializeBoxes() {
		String[] levelNums = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",	//Set up arrays for combo boxes.
			"12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24",
			"25", "26", "27", "28", "29", "30", "31", "32"};		//Levels 1-32 (hehehe), Strings for all class and race names.
		String[] classNames = {"Ardent", "Avenger", "Barbarian", "Bard", "Battlemind",
			"Cleric", "Druid", "Fighter", "Invoker","Monk", "Paladin", "Psion", "Ranger",
			"Rogue", "Runepriest", "Seeker","Shaman", "Sorcerer", "Warden", "Warlock", "Warlord", "Wizard"};
		String[] raceNames = {"Deva", "Dragonborn", "Dwarf", "Eladrin", "Elf", "Githzerai",
			"Gnome", "Goliath", "Half-Elf", "Half-Orc", "Halfling", "Human", "Minotaur",
			"Shardmind", "Shifter", "Tiefling", "Wilden"};
		races.addItem(raceNames);						//Fill the combo boxes with the info.
		classes.addItem(classNames);
		levels.addItem(levelNums);
		races.setEditable(false);						//Make the boxes uneditable.
		classes.setEditable(false);
		levels.setEditable(false);
		races.addActionListener((ActionListener) this);	//Give the boxes ActionListeners.
		classes.addActionListener((ActionListener) this);
		levels.addActionListener((ActionListener) this);
		top.add(races);									//Add the boxes to the JPanels.
		mid.add(classes);
		bot.add(levels);
	}
	
	/** This method reads what is in the boxes, and then creates a new creature based upon that information. */
	protected void actionPerformed(ActionEvent e) {
		JComboBox wat = (JComboBox)e.getSource();
		Object r = null;
		Object c = null;
		Object l = null;
		if(wat.equals(races))
			r = races.getSelectedItem();
		else if(wat.equals(classes))
			c = classes.getSelectedItem();
		else if(wat.equals(levels))
			l = levels.getSelectedItem();
		
	  //if(r == null || c == null || l == null)
			
		
		Creature herple = new Creature(r, c, l);
	}
	
}
