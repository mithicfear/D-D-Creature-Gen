package creature;

public class Ability_Score {
	
	public int STR;
	public int CON;
	public int DEX;
	public int INT;
	public int WIS;
	public int CHA;
	
	public Ability_Score(){
		//TODO Randomly Gen ability scores to fill them in.
	}
	public Ability_Score(int str,int con,int dex, int intel,int wis,int cha){
		STR = str;
		CON = con;
		DEX = dex;
		INT = intel;
		WIS = wis;
		CHA = cha;
	}

}
