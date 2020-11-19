package objects;

import java.util.Random;

import charaterPackage.Character;

/**
 * In exchange of a certain amount of gold, the one armed bandit gives another random item to the player, which consume it immediately. 
 *  @author Pereira and Despelchin
 *
 */
public class OneArmedBandit implements Item  {
	private int amountNeeded;
	
	/**
	 * Create a one armed bandit with the amount of gold needed to use it
	 * @param gold - the amount of gold needed to use this item
	 */
	public OneArmedBandit(int gold) {
		this.amountNeeded = gold;
	}
	
	
	@Override
	public Character isUsedBy(Character character) {
		
		if(character.getGold()>=amountNeeded){
			character.removeGold(amountNeeded);
			//Choose a random item
			Random random = new Random();
			int randNumber = random.nextInt(3)+1;
			//Choose a random value for this one
			int randValue = random.nextInt(50) + 40;
			System.out.println("You give " +amountNeeded+ " gold to the bandit.\nThe bandit give you a little box and disappear. You open the box and find inside :");
			switch(randNumber){
			case 1 :
				Item lifePot = new LifePotion(randValue);
				System.out.println(lifePot + ". You drink it.");
				lifePot.isUsedBy(character);
				break;
			case 2 :
				Item strenPot = new StrengthPotion(randValue-35);
				System.out.println(strenPot + ". You drink it.");
				strenPot.isUsedBy(character);
				break;
			case 3 :
				Item goldBag = new GoldBag(randValue);
				System.out.println(goldBag + ". You put it in your bag.");
				goldBag.isUsedBy(character);
				break;
			default:
				break;
			}
			character.getAdventureGame().currentRoom().removeItem(this);
			return character;
		}else {
			System.out.println("You do not have enough money to pay the bandit ):");
		}
		return character;
	}
	
	/**
	 * ToString() method
	 */
	public String toString () {
		return "One armed bandit : " + amountNeeded + " gold";
	}
}
