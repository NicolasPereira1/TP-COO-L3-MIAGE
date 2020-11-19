package actionPackage;

import java.util.ArrayList;
import java.util.List;
import charaterPackage.Player;
import main.AdventureGame;
import main.Menu;
import roomPackage.Direction;
import roomPackage.Room;

/**
 * Specific action which permit the players to move through the dungeon.   
 * @author Pereira and Despelchin
 */
public class MoveAction extends ActionAdapter<Direction>{

	/**
	 * Define the look action
	 */
	public MoveAction() {
		super(new Menu<Direction>());
		name = "Move";
	}
	
	/**
	 * Execute the 'move' action. It permit a player to choose to move to another room, neighbors of the current one.
	 */
	public void execute(Player player) {
		Room currentRoom = player.getAdventureGame().currentRoom();
		List<Direction> list = new ArrayList<Direction>();
		list.addAll(currentRoom.getNeighbours().keySet());
		Direction direction = menu.chose(list);
		player.getAdventureGame().playerMoveTo(direction);
	}

	public boolean isPossible(Player player, AdventureGame adventureGame) {
		return !adventureGame.currentRoom().getNeighbours().isEmpty() && adventureGame.currentRoom().getMonstersList().isEmpty();
	}

}
