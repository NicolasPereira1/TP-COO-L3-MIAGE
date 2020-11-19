package objects;

import charaterPackage.Character;

/**
 * When a player drinks a strength potion, it add the amount of it on his strenght points.
 *  @author Pereira and Despelchin
 *
 */
public class StrengthPotion implements Item {
	private int value;
	
	/**
	 * Gives strength to the player.
	 * @param value - the amount of strength the player receive
	 */
	public StrengthPotion(int value) {
		super();
		this.value = value;
	}


	@Override
	public Character isUsedBy(Character character) {
		character.addStrengthPoint(value);
		character.getAdventureGame().currentRoom().removeItem(this);
		return character;
	}
	
	/**
	 * ToString() method.
	 */
	public String toString () {
		return "Strength potion : " + value + " SP";
	}
}
