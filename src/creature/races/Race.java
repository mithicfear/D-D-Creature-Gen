package creature.races;

import creature.Ability_Score;


public abstract class Race {

	public static Race[] races = new Race[32];
	public static final Race NILL = new BasicRace(0,"NONE",new Ability_Score(0,0,0,0,0,0));
	public static final Race NEW = new BasicRace(1,"Example",new Ability_Score(0,0,0,2,0,2));
	
	public int ID;
	public static String Name;
	public Ability_Score Mods;
	
	public Race(int id, String name, Ability_Score mods){
		this.ID = id;
		if(races[id]!= null){throw new RuntimeException("Duplicate race ID on" + id);}
		Race.Name = name;
		this.Mods = mods;
	}
	
	@Override
	public String toString(){
		return Name;
	}
	public abstract void ModStats(Ability_Score as);

	public static void getBonus(int[] scoreArr) {
		
		
	}
}
