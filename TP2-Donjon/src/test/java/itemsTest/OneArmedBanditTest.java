package itemsTest;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;
import charaterPackage.Player;
import main.AdventureGame;
import objects.Item;
import objects.OneArmedBandit;
import roomPackage.Room;

public class OneArmedBanditTest{
	protected ArrayList<Item> itemsList;
	protected Room startingRoom;
	protected AdventureGame adventureGame;
	protected Player player;
	
	public void setUp() {
	itemsList = new  ArrayList<Item>();
	startingRoom = new Room(null, itemsList, null);
	adventureGame = new AdventureGame(startingRoom);
	player = new Player("Nicolas", adventureGame, 100, 100, 150);
	OneArmedBandit bandit = new OneArmedBandit(100);
	adventureGame.currentRoom().addItem(bandit);
	}
	
	// /!\ If the bandit gives gold, it will not work
	@Test
	public void testOneArmedBanditGoldRemoved() {
		  setUp();
//		  System.out.println(player);
//		  player.getAdventureGame().currentRoom().getItemsList().get(0).isUsedBy(player);
//		  System.out.println(player);
//		  assertEquals(50, player.getGold());
		  
	}
	
	/**
	 * This test is special since we print the results and see manually if the 1/3 report of items is ok or not.
	 * If the report is approximately 1/3, the random method is working. If one of a item has a 2/3 report, its not really ok
	 * So,  here we are just testing the random occurrences of the method, 
	 * AND if the objects are well used (if not this is going to crash) 
	 */
	@Test
	public void testOneArmedBanditRandomIsOK() {
		setUp();
		//Give enough gold to test it a lot of time
//		player.addGold(999999990);
//		int cptLife=0, cptStr=0,cptGold=0;
//		int savedLife = player.getHealthPoint(),
//			savedStr = player.getStrengthPoint();
//		
//		for(int i=0; i<1001; i++) {
//			player.getAdventureGame().currentRoom().getItemsList().get(0).isUsedBy(player);
//			if(player.getHealthPoint()>savedLife) {
//				cptLife++;
//				savedLife= player.getHealthPoint();
//				adventureGame.currentRoom().addItem(new OneArmedBandit(100));
//			}else if(player.getStrengthPoint()>savedStr) {
//				cptStr++;
//				savedStr=player.getStrengthPoint();
//				adventureGame.currentRoom().addItem(new OneArmedBandit(100));
//			}else {
//				cptGold++;
//				adventureGame.currentRoom().addItem(new OneArmedBandit(100));
//			}	
//		}
//		System.out.println("Life: " + cptLife + "\nStrength: " + cptStr + "\nGold:" + cptGold);
		
	}
	
}
