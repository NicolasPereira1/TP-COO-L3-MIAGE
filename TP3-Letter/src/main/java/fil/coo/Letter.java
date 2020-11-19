package fil.coo;

import contents.Content;

/**
 * A letter have a price and a content, which can be differents things.
 * @author Despelchin and Pereira 
 *
 */
public abstract class Letter<T extends Content> implements Content{
	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected T content;
	
	/**
	 * @param sender - the inhabitant sender of the current letter
	 * @param receiver - the inhabitant receiver of the current letter
	 * @param content - the content of the letter.getContent()
	 */
	public Letter(Inhabitant sender, Inhabitant receiver, T content) {
		super();
		this.sender = sender;
		this.receiver = receiver;
		this.content = content;
	}

	/**
	 * Get the sender of the letter
	 * @return the sender of the letter
	 */
	public Inhabitant getSender() {
		return sender;
	}

	/**
	 * Get the receiver of the letter
	 * @return the receiver of the letter
	 */
	public Inhabitant getReceiver() {
		return receiver;
	}

	/**
	 * Get the content of the letter 
	 * @return the content of the letter
	 */
	public T getContent() {
		return content;
	}

	/**
	 * Permit know if a letter is a fool letter
	 * @return true if the letter is a fool letter
	 */
	public boolean isFoolLetter() {
		return false;
	}

	/**
	 * Get the cost of a letter
	 * @return the cost of a letter
	 */
	public abstract float getCost();

	/**
	 * Do the action of the letter. It can display a text, credit an account,...
	 */
	public abstract void action();

	
	
}
