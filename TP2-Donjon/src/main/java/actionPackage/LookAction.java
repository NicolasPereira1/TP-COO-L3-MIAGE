package actionPackage;

import java.util.ArrayList;
import java.util.List;

import charaterPackage.Player;
import main.AdventureGame;
import main.Menu;
import roomPackage.Direction;
import roomPackage.Room;

/**
 * Specific action which permit looking around himself and get a description about the room way out, monsters, objects.   
 * @author Pereira and Despelchin
 */
public class LookAction extends ActionAdapter<Action>{
	
	/**
	 * Define the look action
	 */
	public LookAction() {
		super(new Menu<Action>());
		name = "Look";
	}
	
	/**
	 * Execute the 'look' action. This action check what kind of other actions is possible in the current room.
	 * So it will check if the player can attack a monster, use an item or move to another room.
	 */
	public void execute(Player player) {
		Room currentRoom = player.getAdventureGame().currentRoom();
		List <Direction>neibourgh = new ArrayList<Direction>();
		neibourgh.addAll(currentRoom.getNeighbours().keySet());
		System.out.println(player);
		displayList("Items :\t", currentRoom.getItemsList());
		displayList("Monsters :", currentRoom.getMonstersList());
		displayList("Neighbours :", neibourgh);
		System.out.println("--------------------------------------------");
	}
 
	public boolean isPossible(Player player, AdventureGame adventureGame) {
		return true;
	}

	private void displayList(String title, List list) {
		System.out.println(title + "\t");
		for(Object o : list)
				System.out.println("\t- " + o);
	}
}
