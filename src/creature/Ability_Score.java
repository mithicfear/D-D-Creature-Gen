package creature;

public class Ability_Score {
	
	public int STR;
	public int CON;
	public int DEX;
	public int INT;
	public int WIS;
	public int CHA;
	
	public Ability_Score() {
		
	}
	
	public Ability_Score(String r, String c, int l){
		//if (c.equals("Rogue") || ("") || ("") || (""))
	}
	/**
	 * 
	 * @param str
	 * @param con
	 * @param dex
	 * @param intel
	 * @param wis
	 * @param cha
	 */
	public Ability_Score(int str,int con,int dex, int intel,int wis,int cha){
		STR = str;
		CON = con;
		DEX = dex;
		INT = intel;
		WIS = wis;
		CHA = cha;
	}
	
	public void calculateStrClass() {
		
	}
	
	public void calculateConClass() {
		
	}
	
	public void calculateDexClass() {
		
	}
	
	public void calculateIntClass() {
		
	}
	
	public void calculateWisClass() {
		
	}
	
	public void calculateCharismaClass() {
		
	}

}
