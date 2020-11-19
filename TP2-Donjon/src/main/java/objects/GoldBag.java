package objects;

import charaterPackage.Character; 

/**
 * Gold bag item. If the player use it, a specified amount of gold is added to his inventory.
 * @author Pereira and Despelchin
 *
 */
public class GoldBag implements Item {
	private int value;
	
	/**
	 * Constructor	
	 * @param amount - amount of gold in the bag 
	 */
	public GoldBag(int amount) {
		super();
		this.value = amount;
	}

	@Override
	public Character isUsedBy(Character character) {
		character.addGold(value);
		character.getAdventureGame().currentRoom().removeItem(this);
		return character;
	}
	
	/**
	 * ToString() method. Show the amount of gold in the current bag.
	 */
	public String toString () {
		return "GoldBag : " + value + " $";
	}
}
