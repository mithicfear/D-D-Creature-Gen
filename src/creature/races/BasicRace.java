package creature.races;

import creature.Ability_Score;

public class BasicRace extends Race {

	public BasicRace(int id, String name, Ability_Score mods) {
		super(id, name, mods);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ModStats(Ability_Score as) {
		as.INT += Mods.INT;
		as.CHA += Mods.CHA;
		as.CON += Mods.CON;
		as.DEX += Mods.DEX;
		as.STR += Mods.STR;
		as.WIS += Mods.WIS;
		
	}

}
