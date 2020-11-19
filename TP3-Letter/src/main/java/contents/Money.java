package contents;

/**
 * Money content on a letter
 * @author Despelchin and Pereira
 *
 */
public class Money implements Content{

	private float amount;
	
	/**
	 * Permit to create a Money object of a certain amount
	 * @param amount - the amount of money
	 */
	public Money(float amount) {
		this.amount = amount;
	}
	
	/**
	 * Getter of the amount in a letter
	 * @return the amount contained in the letter
	 */
	public float getMoney() {
		return amount;
	}
}
