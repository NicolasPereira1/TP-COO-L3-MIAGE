package answer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The answer of a question which type is textual.
 * @author Despelchin and Pereira
 *
 */
public class TextAnswer extends Answer<String>{
	
	/**
	 * Create a textual answer
	 * @param value - the value of the answer
	 */
	public TextAnswer(String value) {
		super(value);
	}

	public String instruction() {
		return "(Text)";
	}

	public boolean accepte(String answer) {
		Pattern p = Pattern.compile("[^a-z ]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(answer);
		return !m.find();
	}

}
