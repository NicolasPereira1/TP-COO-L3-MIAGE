package actionPackage;

import charaterPackage.Player;
import main.AdventureGame;

/**
 * The Action interface define what each action must have. So, a action need to be executed by a given player, and we check if this action can be executed in the current room
 * @author Despelchin and Pereira
 *
 */
public interface Action {
	/**
	 * Execute the given action
	 * @param player - the player who execute the action
	 */
	public void execute (Player player);
	
	/**
	 * Check if this action is possible in this room
	 * @param player - check if the player can do the action in the current room
	 * @param adventureGame - the tabletop of the current game where the current room is, with a player inside
	 * @return true if the current action is possible in that moment of the game
	 */
	public boolean isPossible(Player player, AdventureGame adventureGame);
}
