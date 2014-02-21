package creature;

public class Creature {

	String Race;
	String Class;
	String Name;
	String Alignment;
	String Size;
	String Level;
	
	int Health;
	int AC;
	int FORT;
	int REF;
	int WILL;
	int pass_Insight;
	int pass_Perception;
	
	Ability_Score stats;
	
	public Creature(Object r, Object c, Object l) {
		Race = r.toString();
		Class = c.toString();
		Level = l.toString();
		
		stats = new Ability_Score();
		
		calculateStats();
		displayStats();
	}
	
	/** This method exists to calculate everything that the DM will need for this NPC. */
	protected void calculateStats() {
		
	}
	
	/** This method exists to display everything that the DM will need for this NPC. */
	protected void displayStats() {
		
	}
	
}
