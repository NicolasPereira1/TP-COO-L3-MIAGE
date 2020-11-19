package answer;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Factory pattern for the answers.
 * @author Despelchin and Pereira
 *
 */
public class AnswerFactory {
	private static AnswerFactory ANSWER_FACTORY;
	
	/**
	 * Constructor. Unused here
	 */
	private AnswerFactory () {}
	
	/**
	 * Singleton pattern, it gives the single instance of this factory 
	 * @return the instance
	 */
	public static AnswerFactory getInstance() {
		if(ANSWER_FACTORY == null)
			ANSWER_FACTORY = new AnswerFactory();
		return ANSWER_FACTORY;
	}

    /**
     * Build an answer with the right type and the value of the answer
     * @param answerClass - the name of the answer class
     * @param answer - the value of the answer
     * @return an instance of answer with the right type and the value of the answer
     */

	public Answer<?> buildAnswer(String answerClass, String answerText) {
		Answer<?> answer = null;
		try {
			Class<?> c = Class.forName("answer." + answerClass + "Answer");
			Constructor<?> constructor = c.getConstructor(String.class);
			answer = (Answer<?>)constructor.newInstance(answerText);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return answer;
	}

}
