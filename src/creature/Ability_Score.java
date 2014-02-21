package creature;

public class Ability_Score {
	
	int STR;
	int CON;
	int DEX;
	int INT;
	int WIS;
	int CHA;
	
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
