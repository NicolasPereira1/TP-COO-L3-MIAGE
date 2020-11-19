package fil.coo;

/**
 * Design pattern decorator for a letter 
 * @author Pereira and Despelchin
 *
 */
public abstract class DecoratorLetter extends Letter<Letter<?>>{

	/**
	 * Construct a decorator letter to be used by a registered or a urgent letter
	 * @param sender - the inhabitant sender of the current letter
	 * @param receiver - the inhabitant receiver of the current letter
	 * @param content - the content of the letter
	 */
	public DecoratorLetter(Inhabitant sender, Inhabitant receiver, Letter<?> content) {
		super(sender, receiver, content);
	}
	
	public float getCost() {
		return content.getCost();
	}
	
	public void action() {
		content.action();
	}
}
