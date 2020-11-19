package charaterPackage;

import main.AdventureGame;

/**
 * Specific character who is a monster. Monsters can only do one action, attack the player when the player begin the fight.   
 * @author Pereira and Despelchin
 *
 */
public class Monster extends Character{
	
	public Monster(String name, AdventureGame adventureGame,int healthPoint, int strenghtPoint, int gold) {
		super(name, adventureGame, healthPoint, strenghtPoint, gold);
	}

}
