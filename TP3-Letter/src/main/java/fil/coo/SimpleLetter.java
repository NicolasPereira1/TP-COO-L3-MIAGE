package fil.coo;

import contents.Text;

/**
 * A simple text letter
 * @author Despelchin and Pereira
 *
 */
public class SimpleLetter extends Letter<Text>{
	private static final float COST = 0.5f;
	/**
	 * Create a simple text letter
	 * @param sender - the inhabitant sender of the current letter
	 * @param receiver - the inhabitant receiver of the current letter
	 * @param content - the content of the letter
	 */
	public SimpleLetter(Inhabitant sender, Inhabitant receiver, Text content) {
		super(sender, receiver, content);
	}

	@Override
	public float getCost() {
		return COST;
	}

	@Override
	public void action() {
		System.out.println(this.content.getText());
	}
}
