package actionPackage;

import charaterPackage.Monster;
import charaterPackage.Player;
import main.AdventureGame;
import main.Menu;
import objects.GoldBag;
import roomPackage.Room;

/**
 * Specific action which permit attacking the different monsters that the player will meet in the dungeon.   
 * @author Pereira and Despelchin
 */
public class AttackAction extends ActionAdapter<Monster>{
	
	/**
	 * Define the attack action
	 */
	public AttackAction() {
		super(new Menu<Monster>());
		name = "Attack";
	}
	
	/**
	 * Execute the attack action. If a player is in a room and encounter a monster, he can attack it.
	 * In that case, we remove the amount of the monster's strength point to the player's life, and vice-versa.
	 * 
	 * If the monster dies, we remove it from the room and add a goldBag to the romm's item list.
	 */
	public void execute(Player player) {
		Room currentRoom = player.getAdventureGame().currentRoom();
		Monster monster = menu.chose(currentRoom.getMonstersList());
		player.attack(monster);
		if(monster.getHealthPoint() <= 0){
			System.out.println("Well played ! You killed " + monster.getName()+" ! :)");
			System.out.println("This monster dropped " + monster.getGold() + " gold coins in the room, don't forget it...");
			currentRoom.addItem(new GoldBag(monster.getGold()));
			currentRoom.removeMonster(monster);
		}else {
			System.out.println("You start to attack the monster. He lose " + player.getStrengthPoint() + " health points, but he's still alive.\nNow he's angry and he strikes back.\nYou lose " + monster.getStrengthPoint() + " health points.");
		}
	}
	
	public boolean isPossible(Player player, AdventureGame adventureGame) {
		return !adventureGame.currentRoom().getMonstersList().isEmpty();
	}

}
