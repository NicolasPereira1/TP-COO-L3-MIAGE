package fil.coo;

import contents.Money;
import contents.Text;

/**
 * A bill of exchange letter. It contains Money to credit to the receiver
 * @author Despelchin and Pereira
 *
 */
public class BillOfExchange extends Letter<Money>{
	private static final float COST = 1f;
	/**
	 * Creates a bill of exchange letter
	 * @param sender - the inhabitant sender of the current letter
	 * @param receiver - the inhabitant receiver of the current letter
	 * @param content - the content of the letter
	 */
	public BillOfExchange(Inhabitant sender, Inhabitant receiver, Money content) {
		super(sender, receiver, content);
	}

	@Override
	public float getCost() {
		float onePercent = content.getMoney()/100f;
		return onePercent+COST;
	}

	@Override
	public void action() {
		this.sender.debit(this.content.getMoney());
		this.receiver.credit(this.content.getMoney());
		SimpleLetter grateful = new SimpleLetter(receiver, sender, new Text("Thanks for the money, man !"));
		receiver.sendLetter(grateful);
	}

}
