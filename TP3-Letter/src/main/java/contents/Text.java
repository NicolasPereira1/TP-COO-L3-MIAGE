package contents;

/**
 * Text content for a letter
 * @author Despelchin and Pereira
 *
 */
public class Text implements Content {
	private String text;
	
	/**
	 * Permit to create a text for a letter
	 * @param content - the text to put in the Text object for the letter
	 */
	public Text(String content) {
		this.text = content;
	}
	
	/**
	 * Getter of the content of a letter
	 * @return the text content contained in the letter
	 */
	public String getText() {
		return text;
	}
}
