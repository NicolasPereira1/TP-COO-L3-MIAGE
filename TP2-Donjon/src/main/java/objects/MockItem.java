package objects;

import charaterPackage.Character; 

/**
 * Mock class to test the item behavior and classes.
 * @author Pereira and Despelchin
 *
 */
public class MockItem implements Item {
	private int cpt;
	
	/**
	 * Constructor of the mock
	 */
	public MockItem() {
		super();
		this.cpt = 0;
	}

	@Override
	public Character isUsedBy(Character character) {
		cpt ++;
		return character;
	}
	
	/**
	 * Getter of the cpt
	 * @return the cpt
	 */
	public int getCpt() {
		return cpt;
	}
}
