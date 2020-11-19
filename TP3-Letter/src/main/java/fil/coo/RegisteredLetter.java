package fil.coo;

/**
 * A registered letter is a letter but with a expensive cost
 * @author Despelchin and Pereira
 *
 */
public class RegisteredLetter extends DecoratorLetter{
	
	/**
	 * Create a registered letter for a letter
	 * @param letter - the Letter to be registered
	 */
	public RegisteredLetter(Letter<?> letter) {
		super(letter.getSender(), letter.getReceiver(), letter);
	}

	public float getCost() {
		return content.getCost()*1.15f;
	}

	public void action() {
		content.action();
		receiver.sendLetter(new AcknowledgmentOfReceipt(receiver, sender));
	}


}
