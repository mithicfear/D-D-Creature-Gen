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
	/**
	 * This constructor is not what I'm planing on using for creature.
	 * @param r	Race
	 * @param c Class
	 * @param l Level
	 */
	public Creature(Object r, Object c, Object l) {
		//Race = r.toString();
		//Class = c.toString();
		//Level = l.toString().
		
		stats = new Ability_Score(Class);
		
		calculateStats();
		displayStats();
	}
	
	/** This method exists to calculate everything that the DM will need for this NPC. */
	protected void calculateStats() {
		
	}
	
	/** This method exists to display everything that the DM will need for this NPC. */
	protected void displayStats() {
		
	}
	
	public Creature(Ability_Score abs,int race_index,int class_index,int level){
		
		if(abs == null){
			abs = new Ability_Score();
		}else{
			stats = abs;
		}
		if(level <=0){
			level =1;
		}
		Level = level;
	}
	
}
