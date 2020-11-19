package fil.coo;

/**
 * An urgent letter cost 2 times the initial price of a letter
 * @author Despelchin and Pereira
 *
 */
public class UrgentLetter extends DecoratorLetter {

	/**
	 * Construct a urgent letter
	 * @param sender - the inhabitant sender of the current letter
	 * @param receiver - the inhabitant receiver of the current letter
	 * @param content - the content of the letter
	 */
	public UrgentLetter(Letter<?> letter) {
		super(letter.getSender(), letter.getReceiver(), letter);
	}
	
	public float getCost() {
		return super.getCost()*2;
	}

}
