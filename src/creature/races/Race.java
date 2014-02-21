package creature.races;

import creature.Ability_Score;


public abstract class Race {

	public static Race[] races = new Race[32];
	public static final Race NILL = new BasicRace(0,"NONE",new Ability_Score(0,0,0,0,0,0));
	public int ID;
	public String Name;
	public Ability_Score Mods;
	
	public Race( int id, String name,Ability_Score mods){
		this.ID = id;
		if(races[id]!= null){throw new RuntimeException("Duplicate race ID on" + id);}
		this.Name = name;
		this.Mods = mods;
	}
	
	public abstract void ModStats(Ability_Score as);
}
