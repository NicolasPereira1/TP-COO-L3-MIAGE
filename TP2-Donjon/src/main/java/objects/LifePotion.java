package objects;

import charaterPackage.Character;

public class LifePotion implements Item {
	private int value;
	
	/**
	 * Gives health to the player.
	 * @param amount - the amount of heal the player receive
	 */
	public LifePotion(int amount) {
		super();
		this.value = amount;
	}

	@Override
	public Character isUsedBy(Character character) {
		character.addHealth(value);
		character.getAdventureGame().currentRoom().removeItem(this);
		return character;
	}
	
	/**
	 * ToString() method.
	 */
	public String toString () {
		return "Life potion : " + value + " HP";
	}
}
