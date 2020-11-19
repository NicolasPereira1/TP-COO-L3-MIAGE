package answer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The answer of a question which type is numerical.
 * @author Despelchin and Pereira
 *
 */
public class NumericalAnswer extends Answer<Integer>{

	/**
	 * Create a numerical answer
	 * @param value - the value of the answer
	 */
	public NumericalAnswer(String value) {
		super(Integer.parseInt(value));
	}

	public String instruction() {
		return "(Numerical)";
	}

	public boolean accepte(String answer) {
		Pattern p = Pattern.compile("[^0-9]");
		Matcher m = p.matcher(answer);
		return !m.find();
	}
}
