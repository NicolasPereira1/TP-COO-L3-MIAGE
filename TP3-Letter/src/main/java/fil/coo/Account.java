package fil.coo;

/**
 * It's a bank account
 * @author Despelchin and Pereira 
 *
 */
public class Account {
	protected float amount;
	
	/**
	 * Creates an account
	 * @param amount - the basic bank amount
	 */
	public Account(float amount) {
		this.amount = amount;
	}

	/**
	 * @return the amount
	 */
	public float getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
		
}
