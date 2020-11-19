package roomPackage;

import java.util.List;
import java.util.Map;

import charaterPackage.Monster;
import objects.Item;

/**
 * This class defines a room inside the dungeon, and what she is containing. 
 * If the room is an exit, see {Exit.java}. 
 * @author Despelchin and Pereira
 */
public class Room {
	protected List<Monster> monstersList;
	protected List<Item> itemsList;
	private Map<Direction, Room> neighbours;
	
	/**
	 * Specify how to construct a room
	 * @param monsterList - the list of monsters the room contains
	 * @param itemsList - the list of items the room contains
	 * @param neighbours - the neighbors rooms of this room
	 */
	public Room(List<Monster> monsterList, List<Item> itemsList, Map<Direction, Room> neighbours) {
		super();
		this.monstersList = monsterList;
		this.itemsList = itemsList;
		this.neighbours = neighbours;
	}
	
	/**
	 * Getter of the item list
	 * @return the list of items
	 */
	public List<Item> getItemsList() {
		return itemsList;
	}
	
	/**
	 * Setter of the item list
	 * @param itemsList - the list of items
	 */
	public void setItemsList(List<Item> itemsList) {
		this.itemsList = itemsList;
	}
	
	/**
	 * Add an item to the list of the current room
	 * @param item - the item to add in it
	 */
	public void addItem(Item item) {
		itemsList.add(item);
	}
	
	/**
	 * Remove an item to the current room list
	 * @param item - the item to remove
	 */
	public void removeItem(Item item) {
		if(itemsList.contains(item))
			itemsList.remove(item);
	}
	
	/**
	 * Add a monster to the current room monster's list
	 * @param monster - the monster to add in it.
	 */
	public void addMonster(Monster monster) {
		monstersList.add(monster);
	}
	
	/**
	 * Remove a monster to the current room monster's list
	 * @param monster - the monster to remove in it.
	 */
	public void removeMonster(Monster monster) {
		if(monstersList.contains(monster))
			monstersList.remove(monster);
	}
	
	/**
	 * Getter of the monster list
	 * @return the monstersList
	 */
	public List<Monster> getMonstersList() {
		return monstersList;
	}

	/**
	 * Setter of the monster list
	 * @param monstersList - the monstersList to set
	 */
	public void setMonstersList(List<Monster> monstersList) {
		this.monstersList = monstersList;
	}

	/**
	 * Getter of the neighbors
	 * @return the neighbors map
	 */
	public Map<Direction, Room> getNeighbours() {
		return neighbours;
	}

	/**
	 * Setter of the neighbors
	 * @param neighbours the neighbor map to set
	 */
	public void setNeighbours(Map<Direction, Room> neighbours) {
		this.neighbours = neighbours;
	}

	/**
	 * Is this room an exit ?
	 * @return false is it's not override.
	 */
	public boolean isExit(){
		return false;
	}
}
