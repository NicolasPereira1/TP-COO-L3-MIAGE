package actions;

import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Before;
import org.junit.Test;
import charaterPackage.Monster;
import charaterPackage.Player;
import main.AdventureGame;
import objects.Item;
import roomPackage.Direction;
import roomPackage.Room;

public abstract class ActionTest {
	//Define a game to test the actions
	protected ArrayList<Monster> monsterList;
	protected ArrayList<Item> itemsList;
	protected HashMap<Direction, Room> neighbours;
	protected Room startingRoom;
	protected AdventureGame adventureGame;
	protected Player player;
	
	public void setUp() {
		monsterList = new ArrayList<Monster>();
		itemsList = new ArrayList<Item>();
		neighbours = new HashMap<Direction, Room>();
		startingRoom = new Room(monsterList, itemsList, neighbours);
		adventureGame = new AdventureGame(startingRoom);
		player = new Player("Nicolas", adventureGame, 100, 100, 0);
	}
	
	@Test
	public abstract void testExecution();
}	
