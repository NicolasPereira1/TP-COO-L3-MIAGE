package character;

import static org.junit.Assert.*;

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

public class CharacterTest {
	//Define a game to test the characters 
	private ArrayList<Monster> monsterList;
	private ArrayList<Item> itemsList;
	private HashMap<Direction, Room> neighbours;
	private Room startingRoom;
	private AdventureGame adventureGame;
	private Player player;
	private Monster monster;
	
	@Before
	public void setUp() {
		monsterList = new ArrayList<Monster>();
		itemsList = new ArrayList<Item>();
		neighbours = new HashMap<Direction, Room>();
		startingRoom = new Room(monsterList, itemsList, neighbours);
		adventureGame = new AdventureGame(startingRoom);
		player = new Player("Nicolas", adventureGame, 100, 100, 0);
		monster = new Monster("Zombie", adventureGame, 50, 50, 50);
		monsterList.add(monster);
	}
	
	@Test
	public void testCharacter() {
		assertEquals("Nicolas", player.getName());
	}

	@Test
	public void testGetName() {			
		assertEquals("Nicolas", player.getName());
		assertNotEquals("Zombie", player.getName());
		assertEquals("Zombie", adventureGame.currentRoom().getMonstersList().get(0).getName());
	}

	@Test
	public void testSetName() {		
		player.setName("Brice");
		assertEquals("Brice", player.getName());
		assertNotEquals("Nicolas", player.getName());
		
		adventureGame.currentRoom().getMonstersList().get(0).setName("Squelette");
		assertEquals("Squelette", adventureGame.currentRoom().getMonstersList().get(0).getName());
	}

	@Test
	public void testGetHealthPoint() {
		assertEquals(100, player.getHealthPoint());
		player.addHealth(100);
		assertEquals(200, player.getHealthPoint());
	}

	@Test
	public void testSetHealthPoint() {
		assertEquals(100, player.getHealthPoint());
		player.setHealthPoint(200);
		assertEquals(200, player.getHealthPoint());
		
		adventureGame.currentRoom().getMonstersList().get(0).setHealthPoint(40);
		assertEquals(40, adventureGame.currentRoom().getMonstersList().get(0).getHealthPoint());
	}

	@Test
	public void testAddHealth() {
		assertEquals(100, player.getHealthPoint());
		player.addHealth(100);
		player.addHealth(50);
		assertEquals(250, player.getHealthPoint());
	}

	@Test
	public void testGetStrengthPoint() {
		assertEquals(100, player.getStrengthPoint());		
		assertEquals(50, adventureGame.currentRoom().getMonstersList().get(0).getStrengthPoint());
	}

	@Test
	public void testSetStrengthPoint() {
		assertEquals(100, player.getStrengthPoint());
		player.setStrengthPoint(42);
		assertEquals(42, player.getStrengthPoint());
	}

	@Test
	public void testAddStrengthPoint() {
		assertEquals(100, player.getStrengthPoint());
		player.addStrengthPoint(42);
		assertEquals(142, player.getStrengthPoint());
	}

	@Test
	public void testGetGold() {
		assertEquals(0, player.getGold());
		assertEquals(50, adventureGame.currentRoom().getMonstersList().get(0).getGold());
	}

	@Test
	public void testSetGold() {
		assertEquals(0, player.getGold());
		player.setGold(42);
		assertEquals(42, player.getGold());
	}

	@Test
	public void testAddGold() {
		assertEquals(0, player.getGold());
		player.addGold(100);
		assertEquals(100, player.getGold());
		player.addGold(100);
		assertEquals(200, player.getGold());
	}

}
