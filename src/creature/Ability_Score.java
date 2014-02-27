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
	
	public int[] calculateStrClass() {
		int[] scores = new int[6];
		
		for (int x=0; x<5; x++)
			scores[x] = (int) (Math.random() * 18);
		
		for (int u=0; u<5; u++)
			for (int x=0; x<5; x++)
				scores[x] = Math.max(scores[x], scores[x+1]);
		
		for (int x = 1; x<5; x++){
			int r = (int)(Math.random()*5)+1;
			scoreArr[x] = r;
		}
		
		scoreArr[0] = scores[0];
		
		Race.getBonus(scoreArr);
		return scoreArr;
	}
	
	public int[] calculateConClass() {
		int[] scores = new int[6];
		
		for (int x=0; x<5; x++)
			scores[x] = (int) (Math.random() * 18);
		
		for (int u=0; u<5; u++)
			for (int x=0; x<5; x++)
				scores[x] = Math.max(scores[x], scores[x+1]);
		
		for (int x = 1; x<5; x++){
			int r = (int)(Math.random()*5)+1;
			scoreArr[x] = r;
		}
		
		scoreArr[1] = scores[0];
		
		Race.getBonus(scoreArr);
		return scoreArr;
	}
	
	public int[] calculateDexClass() {
		int[] scores = new int[6];
		
		for (int x=0; x<5; x++)
			scores[x] = (int) (Math.random() * 18);
		
		for (int u=0; u<5; u++)
			for (int x=0; x<5; x++)
				scores[x] = Math.max(scores[x], scores[x+1]);
		
		for (int x = 1; x<5; x++){
			int r = (int)(Math.random()*5)+1;
			scoreArr[x] = r;
		}
		
		scoreArr[2] = scores[0];
		
		Race.getBonus(scoreArr);
		return scoreArr;
	}
	
	public int[] calculateIntClass() {
		int[] scores = new int[6];
		
		for (int x=0; x<5; x++)
			scores[x] = (int) (Math.random() * 18);
		
		for (int u=0; u<5; u++)
			for (int x=0; x<5; x++)
				scores[x] = Math.max(scores[x], scores[x+1]);
		
		for (int x = 1; x<5; x++){
			int r = (int)(Math.random()*5)+1;
			scoreArr[x] = r;
		}
		
		scoreArr[3] = scores[0];
		
		Race.getBonus(scoreArr);
		return scoreArr;
	}
	
	public int[] calculateWisClass() {
		int[] scores = new int[6];
		
		for (int x=0; x<5; x++)
			scores[x] = (int) (Math.random() * 18);
		
		for (int u=0; u<5; u++)
			for (int x=0; x<5; x++)
				scores[x] = Math.max(scores[x], scores[x+1]);
		
		for (int x = 1; x<5; x++){
			int r = (int)(Math.random()*5)+1;
			scoreArr[x] = r;
		}
		
		scoreArr[4] = scores[0];
		
		Race.getBonus(scoreArr);
		return scoreArr;
	}
	
	public int[] calculateChaClass() {
		int[] scores = new int[6];
		
		for (int x=0; x<5; x++)
			scores[x] = (int) (Math.random() * 18);
		
		for (int u=0; u<5; u++)
			for (int x=0; x<5; x++)
				scores[x] = Math.max(scores[x], scores[x+1]);
		
		for (int x = 1; x<5; x++){
			int r = (int)(Math.random()*5)+1;
			scoreArr[x] = r;
		}
		
		scoreArr[5] = scores[0];
		
		Race.getBonus(scoreArr);
		return scoreArr;
	}

}
