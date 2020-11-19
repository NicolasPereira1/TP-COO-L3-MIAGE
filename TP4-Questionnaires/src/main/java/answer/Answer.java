package answer;
/**
 * The answer of a question. It can be several type like textual, numerical, yes or no etc...
 * @author Despelchin and Pereira
 *
 */
public abstract class Answer <T> {
	protected T value;
	
	/**
	 * Create an answer
	 * @param value - the value of the answer (text,numeric, ...)
	 */
	public Answer (T value) {
		this.value = value;
	}

	/**
	 * Getter of the value
	 * @return the value of this answer
	 */
	public T getValue() {
		return value;
	}

	/**
	 * Value setter
	 * @param value - the value to set
	 */
	public void setValue(T value) {
		this.value = value;
	}
	/**
	 * Check if the player answer matches with the quiz answer
	 * @param answer - the player answer
	 * @return true if the player answer is the good answer
	 */
	public boolean isCorrect(String answer) {
		String stringValue = ""+value;
		return answer.toLowerCase().equals(stringValue.toLowerCase());
	}

	/**
	 * To string of the answer's value
	 * @return the answer value in a string format
	 */
	@Override
	public String toString() {
		return "" + value;
	}
	/**
	 * Give the accepted type of this answer
	 * @return the type of answer accepted
	 */
	public abstract String instruction();

	/**
	 * Check if the player answer matches with the type of this answer
	 * @param answer - the player answer
	 * @return true if the answer is accepted
	 */
	public abstract boolean accepte(String answer);

	
}
