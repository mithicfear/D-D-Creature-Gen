/**
 * This is the Ability_Score class. This is used to calculate the ability scores. It calculates
 * them by class, because of the fact that the classes have one skill that they are heavily
 * based on. It takes the highest score that it gets and assigns it to that attribute.
 * @author James Jackson
 * @author Philip Taylor
 */
package creature;

import creature.races.Race;

public class Ability_Score {
	
	/**
	 * @param str
	 * @param con
	 * @param dex
	 * @param intel
	 * @param wis
	 * @param cha
	 */
	
	public int STR;
	public int CON;
	public int DEX;
	public int INT;
	public int WIS;
	public int CHA;
	public int[] scoreArr = {STR, CON, DEX, INT, WIS, CHA};
	
	public Ability_Score() {
		
	}
	
	public Ability_Score(String r, String c, int l){
		//if (c.equals("Rogue") || ("") || ("") || (""))
	}
	
	public Ability_Score(int str,int con,int dex, int intel,int wis,int cha){
		STR = str;
		CON = con;
		DEX = dex;
		INT = intel;
		WIS = wis;
		CHA = cha;
	}
	
	/**
	 * ALL of the following methods create 6 random numbers, order them from greatest to least,
	 * and then set the one that the class is supposed to be heavy on and sets it to the greatest.
	 * @return int[]
	 */
	
	/**
	 * Calculates a class based on Strength.
	 * @return
	 */
	public int[] calculateStrClass() {
		int[] scores = new int[6];		//Creates temporary array of 6.
		
		for (int x=0; x<5; x++)
			scores[x] = (int) (Math.random() * 18);	//Fills array with random numbers.
		
		for (int u=0; u<5; u++)			//Continually pushes smallest numbers to the end.
			for (int x=0; x<5; x++)
				scores[x] = Math.max(scores[x], scores[x+1]);
		
		for (int x = 1; x<5; x++){		//Sets the last 5 scores the random numbers.
			int r = (int)(Math.random()*5)+1;
			scoreArr[r] = scores[x];
		}
		
		scoreArr[0] = scores[0];	//Sets score that the class is based on to the highest.
		
		Race.getBonus(scoreArr);
		return scoreArr;
	}
	
	/**
	 * Calculates a class based on Constitution.
	 * @return
	 */
	public int[] calculateConClass() {
		int[] scores = new int[6];
		
		for (int x=0; x<5; x++)
			scores[x] = (int) (Math.random() * 18);
		
		for (int u=0; u<5; u++)
			for (int x=0; x<5; x++)
				scores[x] = Math.max(scores[x], scores[x+1]);
		
		for (int x = 1; x<5; x++){
			int r = (int)(Math.random()*5)+1;
			scoreArr[r] = scores[x];
		}
		
		scoreArr[1] = scores[0];
		
		Race.getBonus(scoreArr);
		return scoreArr;
	}
	
	/**
	 * Calculates a class based on Dexterity.
	 * @return
	 */
	public int[] calculateDexClass() {
		int[] scores = new int[6];
		
		for (int x=0; x<5; x++)
			scores[x] = (int) (Math.random() * 18);
		
		for (int u=0; u<5; u++)
			for (int x=0; x<5; x++)
				scores[x] = Math.max(scores[x], scores[x+1]);
		
		for (int x = 1; x<5; x++){
			int r = (int)(Math.random()*5)+1;
			scoreArr[r] = scores[x];
		}
		
		scoreArr[2] = scores[0];
		
		Race.getBonus(scoreArr);
		return scoreArr;
	}
	
	/**
	 * Calculates a class based on Intelligence.
	 * @return
	 */
	public int[] calculateIntClass() {
		int[] scores = new int[6];
		
		for (int x=0; x<5; x++)
			scores[x] = (int) (Math.random() * 18);
		
		for (int u=0; u<5; u++)
			for (int x=0; x<5; x++)
				scores[x] = Math.max(scores[x], scores[x+1]);
		
		for (int x = 1; x<5; x++){
			int r = (int)(Math.random()*5)+1;
			scoreArr[r] = scores[x];
		}
		
		scoreArr[3] = scores[0];
		
		Race.getBonus(scoreArr);
		return scoreArr;
	}
	
	/**
	 * Calculates a class based on Wisdom.
	 * @return
	 */
	public int[] calculateWisClass() {
		int[] scores = new int[6];
		
		for (int x=0; x<5; x++)
			scores[x] = (int) (Math.random() * 18);
		
		for (int u=0; u<5; u++)
			for (int x=0; x<5; x++)
				scores[x] = Math.max(scores[x], scores[x+1]);
		
		for (int x = 1; x<5; x++){
			int r = (int)(Math.random()*5)+1;
			scoreArr[r] = scores[x];
		}
		
		scoreArr[4] = scores[0];
		
		Race.getBonus(scoreArr);
		return scoreArr;
	}
	
	/**
	 * Calculates a class baesd on Charisma.
	 * @return
	 */
	public int[] calculateChaClass() {
		int[] scores = new int[6];
		
		for (int x=0; x<5; x++)
			scores[x] = (int) (Math.random() * 18);
		
		for (int u=0; u<5; u++)
			for (int x=0; x<5; x++)
				scores[x] = Math.max(scores[x], scores[x+1]);
		
		for (int x = 1; x<5; x++){
			int r = (int)(Math.random()*5)+1;
			scoreArr[r] = scores[x];
		}
		
		scoreArr[5] = scores[0];
		
		Race.getBonus(scoreArr);
		return scoreArr;
	}

}
