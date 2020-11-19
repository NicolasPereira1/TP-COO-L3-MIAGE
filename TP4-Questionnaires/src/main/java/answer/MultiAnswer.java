package answer;

/**
 * a Multi answer is a type of answer who accept more than one "good" answer.
 * @author Despelchin and Pereira
 *
 * @param <T> - the type of these kind of answers (text,numercial,...)
 */
public class MultiAnswer<T> extends Answer<TextAnswer []>{

	/**
	 * Create a multiAnswer
	 * @param value the string with the differents "good" answer possibilities
	 */
	public MultiAnswer(String value) {
		super(createArraybAnswer(value));
	}
	/**
	 * Check if the answer is the one of the "good" answers
	 * @param answer - the player answer
	 * @return true if the answer is the one of the "good" answers
	 */
	public boolean isCorrect(String answer) {
		boolean res = false;
		int idx = 0;
		while(idx < value.length && !res) {
			if(value[idx].isCorrect(answer))
				res = true;
			idx++;
		}
		return res;
	}

	public String instruction() {
		return "(" + value.length + " answer possible)";
	}

	public boolean accepte(String answer) {
		return value[0].accepte(answer);
	}

	/**
	 * ToString method
	 * @return the string format of this multi answer
	 */
	public String toString(){
		String display = "";
		for(int i=0; i<value.length; i++)
			display += value[i] + " ";
		return display;
	}

	/**
	 * Create an array containing the accepted anwers
	 * @param value - the value of the accepted answers
	 * @return the TextAnswer array with all the accepted answers
	 */
	private static TextAnswer[] createArraybAnswer(String value) {		
		String [] values = value.split(",");
		TextAnswer[] array = new TextAnswer[values.length];
		for(int i=0; i<values.length; i++)
			array[i] = new TextAnswer(values[i]);
		return array;
	}
}
