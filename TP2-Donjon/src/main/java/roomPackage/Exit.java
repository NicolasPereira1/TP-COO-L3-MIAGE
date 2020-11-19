package roomPackage;

import java.util.List;
import java.util.Map;

import charaterPackage.Monster;
import objects.Item;

/**
 * Specific Room which is the exit of the dungeon. If the player reach it, he win.
 * @author Despelchin and Pereira
 *
 */
public class Exit extends Room{
	
	/**
	 * An exit room as the same constructor as a room
	 * @param monsterList - the list of monsters the room contains
	 * @param itemsList - the list of items the room contains
	 * @param neighbours - the neighbors rooms of this room
	 */
	public Exit(List<Monster> monsterList, List<Item> itemsList, Map<Direction, Room> neighbours){
		super(monsterList, itemsList, neighbours);
	}
	
	/**
	 * This room is obviously an exit ( it's the name of the class bruh)
	 */
	public boolean isExit(){
		return true;
	}
}
