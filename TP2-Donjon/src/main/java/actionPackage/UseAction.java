package actionPackage;

import charaterPackage.Player;
import main.AdventureGame;
import main.Menu;
import objects.Item;
import roomPackage.Room;

/**
 * Specific action which permit to use several objects defined in the 'objects' package.   
 * @author Pereira and Despelchin
 */
public class UseAction extends ActionAdapter<Item>{

	/**
	 * Define the use action
	 */
	public UseAction() {
		super(new Menu<Item>());
		name = "Use";
	}

	/**
	 * Execute the 'use' action. As this said, it use an item to a given player.
	 */
	public void execute(Player player) {
		Room currentRoom = player.getAdventureGame().currentRoom();
		Item item = menu.chose(currentRoom.getItemsList());
		item.isUsedBy(player);
	}

	public boolean isPossible(Player player, AdventureGame adventureGame) {
		return !adventureGame.currentRoom().getItemsList().isEmpty();
	}

}
