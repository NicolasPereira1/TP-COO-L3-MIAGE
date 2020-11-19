package objects;

import charaterPackage.Character;

/**
 * Interface of an item.
 * @author Pereira and Despelchin
 *
 */
public interface Item {
	/**
	 * Use the item on the player. If it's gold, it is added to his inventory. Else, it directly modify the player stats.
	 * @param character - the player ( a monster cannot use an item) who's using an item
	 * @return the player with his new stats due to the item
	 */
	public Character isUsedBy(Character character);
}
