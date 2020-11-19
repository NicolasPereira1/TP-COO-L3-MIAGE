package fil.coo;

import contents.Text;

/**
 * A Acknowledgment of receipt is send back when a registered letter is received
 * @author Pereira and Despelchin
 *
 */
public class AcknowledgmentOfReceipt extends SimpleLetter {

	/**
	 * Creates a Acknowledgment of receipt
	 * @param sender - the sender of the Acknowledgment
	 * @param receiver - the receiver of the Acknowledgment
	 */
	public AcknowledgmentOfReceipt(Inhabitant sender, Inhabitant receiver) {
		super(sender, receiver, new Text("Well received"));
	}

	@Override
	public float getCost() {
		return 0;
	}

	@Override
	public void action() {
		System.out.println(this.content.getText());
	}

}
