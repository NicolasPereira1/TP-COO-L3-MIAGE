package charaterPackage;

import main.AdventureGame;

/**
 * This class defines the different properties of a character.   
 * @author Pereira and Despelchin
 *
 */
public abstract class Character{
	protected String name;
	protected AdventureGame adventureGame;
	protected int healthPoint;
	protected int strengthPoint;
	protected int gold;
	
	/**
	 * Create a character with his name, the current game, his life, strengh and gold
	 * @param name - the name of the character
	 * @param adventureGame - the adventure game where is the character
	 * @param healthPoint - the starting life points of the character
	 * @param strenghtPoint - the starting strength points of the character
	 * @param gold - the gold the character is carrying
	 */
	public Character (String name, AdventureGame adventureGame, int healthPoint, int strenghtPoint, int gold) {
		this.name = name;
		this.adventureGame = adventureGame;
		this.healthPoint= healthPoint;
		this.strengthPoint = strenghtPoint;
		this.gold = gold;
	};
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the healthPoint
	 */
	public int getHealthPoint() {
		return healthPoint;
	}
	/**
	 * @param healthPoint the healthPoint to set
	 */
	public void setHealthPoint(int healthPoint) {
		this.healthPoint = healthPoint;
	}
	/**
	 * @param healthPoint adding to the healthPoint of the character
	 */
	public void addHealth(int healthPoint) {
		this.healthPoint = this.healthPoint + healthPoint;
	}
	/**
	 * @return the strengthPoint
	 */
	public int getStrengthPoint() {
		return strengthPoint;
	}
	/**
	 * @param strengthPoint the strengthPoint to set
	 */
	public void setStrengthPoint(int strengthPoint) {
		this.strengthPoint = strengthPoint;
	}
	/**
	 * @param strengthPoint adding to the strength of the character
	 */
	public void addStrengthPoint(int strengthPoint) {
		this.strengthPoint = this.strengthPoint + strengthPoint;
	}
	/**
	 * @return the gold
	 */
	public int getGold() {
		return gold;
	}
	/**
	 * @param gold the gold to set
	 */
	public void setGold(int gold) {
		this.gold = gold;
	}
	/**
	 * @param gold adding to the gold of the character
	 */
	public void addGold(int gold) {
		this.gold += gold;
	}

	/**
	 * Remove gold of the player's inventory
	 * @param amount - the amount  of gold to remove form the player's inventory
	 */
	public void removeGold(int amount){
		this.gold -= amount;
	}
	
	/**
	 * @return the adventureGame
	 */
	public AdventureGame getAdventureGame() {
		return adventureGame;
	}

	/**
	 * @param adventureGame the adventureGame to set
	 */
	public void setAdventureGame(AdventureGame adventureGame) {
		this.adventureGame = adventureGame;
	}
	
	/**
	 * Change the character health by the strength point of another character
	 * @param character - the character to attack
	 */
	public void attack(Character character) {
		character.setHealthPoint(character.getHealthPoint()-strengthPoint);
	}
	
	@Override
	public String toString() {
		return name + " :\t" + healthPoint
				+ " HP\t" + strengthPoint + " SP\t" + gold + " Golds";
	}
	
} 
