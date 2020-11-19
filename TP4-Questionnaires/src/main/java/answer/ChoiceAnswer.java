package answer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A choice answer is a type of answer which have differents possibilies proposed to the player to answer.
 * It displays the possible answers and the player need to choose one of them.
 * @author Despelchin and Pereira
 *
 */
public class ChoiceAnswer extends Answer<String>{
	private List <String> values;
	
	/**
	 * COnstruc a choice answer
	 * @param value - the string value of the differents possible answers
	 */
	public ChoiceAnswer(String value) {
		super(value.split(",")[0]);
		values = Arrays.asList(value.split(","));
	}

	public String instruction() {
		Collections.shuffle(values);
		String res = "(" + values.get(0);
		for(int i=1; i<values.size(); i++)
			res = res + "/" + values.get(i);
		return res+")";
	}

	public boolean accepte(String answer) {
		return values.contains(answer);
	}
}