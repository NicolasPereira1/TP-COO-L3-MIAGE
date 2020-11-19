package charaterPackage;

import java.util.ArrayList;
import java.util.List;

import actionPackage.Action;
import actionPackage.AttackAction;
import actionPackage.LookAction;
import actionPackage.MoveAction;
import actionPackage.UseAction;
import main.AdventureGame;
import main.Menu;
import objects.GoldBag;
import roomPackage.Room;

/**
 * Specific character who is the player. The player can do different action like look, move, attack and use several items.   
 * @author Pereira and Despelchin
 *
 */
public class Player extends Character{

	public Player(String name,  AdventureGame adventureGame, int healthPoint, int strenghtPoint, int gold) {
		super(name, adventureGame, healthPoint, strenghtPoint, gold);
	}

	/**
	 * Only a player can do an action, so we don't do it in a monster character
	 */
	public void action() {
		Menu<Action> menu = new Menu<Action>();
		List<Action> actions = new ArrayList<Action>();
		
		Action look = new LookAction();
		if(look.isPossible(this, adventureGame))
			actions.add(look);
		Action use = new UseAction();
		if(use.isPossible(this, adventureGame))
			actions.add(use);
		Action attack = new AttackAction();
		if(attack.isPossible(this, adventureGame))
			actions.add(attack);
		Action move = new MoveAction();
		if(move.isPossible(this, adventureGame))
			actions.add(move);
		
		Action action = menu.chose(actions);
		action.execute(this);
	}
	
	/**
	 * The player can choose to attack another character.
	 */
	public void attack(Character character) {
		character.setHealthPoint(character.getHealthPoint()-strengthPoint);
		if(character.getHealthPoint()>0)
			this.setHealthPoint(this.getHealthPoint()-character.getStrengthPoint());
	}
	
}
