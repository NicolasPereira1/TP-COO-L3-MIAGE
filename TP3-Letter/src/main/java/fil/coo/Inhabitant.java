package fil.coo;

/**
 * A city inhabitant can send or receive letters, and own a bank account
 * @author Despelchin and Pereira
 *
 */
public class Inhabitant {

	protected City city;
	protected Account account;
	
	/**
	 * Creates an new inhabitant 
	 * @param city - the city he lives
	 * @param account - the bank account he have
	 */
	public Inhabitant(City city, Account account) {
		this.city = city;
		this.account = account;
	}
	
	/**
	 * Debit the bank account of the inhabitant
	 * @param amount - the amount to debit
	 */
	public void debit(float amount) {
		this.account.amount -= amount;
	}
	
	/**
	 * Credit the bank account of the inhabitant
	 * @param amount - the amount to credit
	 */
	public void credit(float amount) {
		this.account.amount += amount;
	}
	
	/**
	 * Send a letter to another inhabitant
	 * @param letter - the letter to send
	 */
	public void sendLetter(Letter<?> letter) {
		debit(letter.getCost());
		city.addLetter(letter);
	}
	
	/**
	 * Receive a letter
	 * @param letter - the letter to receive
	 */
	public void receiveLetter(Letter<?> letter) {
		if(!letter.isFoolLetter())
			letter.action();
		else if(account.getAmount() > 0 && Math.random()*100<15) {
			letter.action();
		}
	}
	
	/**
	 * Get the account of the Inhabitant
	 * @return the inhabitant's account 
	 */
	public Account getAccount() {
		return this.account;
	}
}
