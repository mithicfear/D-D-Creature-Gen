package creature;

public class Creature {

	String Race;
	String Class;
	String Name;
	String Alignment;
	String Size;
	
	int Level;
	int Health;
	int AC;
	int FORT;
	int REF;
	int WILL;
	int pass_Insight;
	int pass_Perception;
	
	Ability_Score stats;
	
	public Creature(Ability_Score as,int level,int r,int c){
		//TODO Need to fill add dis stuff in, cause I'm lazy, Thinking of having a abstract class for race and class, staring them in an array so we can index them via an int.
		if(as == null){
			stats = new Ability_Score();
		}else{
			stats = as;
		}
		if(level == 0){
			Level = 1;
		}else{
			Level = level;
		}
		
	}
}
