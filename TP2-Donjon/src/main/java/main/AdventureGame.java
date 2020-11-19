package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import charaterPackage.Monster;
import charaterPackage.Player;
import objects.GoldBag;
import objects.Item;
import objects.LifePotion;
import objects.OneArmedBandit;
import objects.StrengthPotion;
import roomPackage.Direction;
import roomPackage.Exit;
import roomPackage.Room;

/**
 * Initiate a dungeon, where the player can move through rooms, attack monsters, use item, etc... 
 * @author Despelchin and Pereira
 *
 */
public class AdventureGame {
	private Room currentRoom;
	
	/**
	 * Non-random constructor of a game
	 * @param startingRoom the starting room of this game
	 */
	public AdventureGame(Room startingRoom) {
		this.currentRoom = startingRoom;
	}
	
	/**
	 * Random constructor of a tabletop. It generates a random dungeon by the randomGenerate() method.
	 */
	public AdventureGame() {
		this.randomGenerate();
	}
	
	/**
	 * Getter of the current room.
	 * @return the current room
	 */
	public Room currentRoom() {
		return currentRoom;
	}
	
	/**
	 * Play a game. It consist to let the player choose what he want to do until they die, or they reach the dungeon exit.
	 * @param player - the player which play the game
	 */
	public void play(Player player) {
		while(!isFinished() && player.getHealthPoint()>0){
			player.action();
		}
		if(player.getHealthPoint()>0)
			System.out.println("Wonderful ! You reach the exit, you have successfully get out of the dungeon alive !! :D\nYou win with : " + player.getGold() + " golds, challenge your friends !");
		else
			System.out.println("GAME OVER...\nYou are dead. :(");
	}
	
	/**
	 * Add a monster to a room
	 * @param monster - the monster to add on the 
	 * @param room - specific room
	 */
	public void addMonster(Monster monster, Room room) {
		room.addMonster(monster);
	}
	
	/**
	 * Add an item to the room
	 * @param item - the item to add on the 
	 * @param room - specified room
	 */
	public void addItem(Item item, Room room) {
		room.addItem(item);
	}
	
	/**
	 * Check if the game is finished
	 * @return true if it is well finished, and won.
	 */
	public boolean isFinished() {
		return currentRoom.isExit() && currentRoom.getMonstersList().isEmpty();
	}
	
	/**
	 * Move the player to another room
	 * @param direction - the direction the player want to move
	 */
	public void playerMoveTo(Direction direction) {
		currentRoom = currentRoom.getNeighbours().get(direction);
	}
	
	/**
	 * Generate a random dungeon. Each room generate a random number of monsters and items
	 */
	private void randomGenerate() {
		//Generate the starting room
		Random rnd = new Random();
		ArrayList<Monster> monsterList = new ArrayList<Monster>();
		ArrayList<Item> itemsList = new ArrayList<Item>();
		HashMap<Direction, Room> neighbours = new HashMap<Direction, Room>();
		Room newRoom = new Room(monsterList, itemsList, neighbours);
		currentRoom = newRoom;
		
		//Generate other room
		int nbrRoom = rnd.nextInt(10)+5;
		for(int i=1; i<=nbrRoom; i++) {
			//Monsters
			int nbrMonster = 1+rnd.nextInt(3);
			for(int j=1; j<=nbrMonster; j++)
				monsterList.add(randomMonster(rnd, j, i));
			//Objects
			boolean oneArmedBandit = true;
			int nbrItem = rnd.nextInt(3);
			for(int j=1; j<=nbrItem; j++) {
				Item item = randomItem(rnd, oneArmedBandit, i);
				if(item != null)
					itemsList.add(item);
			}
			Room lastRoom = newRoom;
			newRoom = new Room(monsterList, itemsList, new HashMap<Direction, Room>());
			linkTwoRoom(lastRoom, newRoom);
			//Rest data for the next room
			monsterList = new ArrayList<Monster>();
			itemsList = new ArrayList<Item>();
			neighbours = new HashMap<Direction, Room>();
		}
		
		//Generate exit
		Room exit = new Exit(monsterList, itemsList, neighbours);
		newRoom.getNeighbours().put(Direction.South, exit);
		exit.getNeighbours().put(Direction.North, newRoom);
	}
	
	/**
	 * Link two room between themselves
	 * @param room1 - the first room to link
	 * @param room2 - the second room to link
	 */
	private void linkTwoRoom(Room room1, Room room2) {
		room1.getNeighbours().put(Direction.South, room2);
		room2.getNeighbours().put(Direction.North, room1);
	}
	
	/**
	 * Create a random monster
	 * @param rnd - the random number to use
	 * @param number - the number to add on a monster to increase the difficulty on the latest rooms.
	 * @return a new monster with random statistics.
	 */
	private Monster randomMonster(Random rnd, int number, int roomNumber) {
		int life = rnd.nextInt(2+roomNumber*2)*10+30;
		int strengh = rnd.nextInt(5)*10+10;
		int gold = rnd.nextInt(5)*5+life-20;
		return new Monster("Monster " + (number), this, life, strengh, gold);
	}
	
	/**
	 * Generates a random item
	 * @param rnd - the random number to use
	 * @param oneArmedBandit - if the random item is generated by a bandit or not. If yes, a bandit cannot generates himself
	 * @param nbrRoom - the number of rooms the player is
	 * @return a new item with random value
	 */
	private Item randomItem(Random rnd, boolean oneArmedBandit, int nbrRoom) {
		switch(rnd.nextInt(4)) {
			case 0:
				return new GoldBag (rnd.nextInt(5)*5+5*nbrRoom);
			case 1:
				return new LifePotion(rnd.nextInt(5)*10+10);
			case 2:
				return new StrengthPotion(rnd.nextInt(5)*10+10);
			case 3:
				if(oneArmedBandit) {
					oneArmedBandit = false;
					return new OneArmedBandit(rnd.nextInt(nbrRoom)*10+30);
				}
			break;
		}
		return null;
	}
}