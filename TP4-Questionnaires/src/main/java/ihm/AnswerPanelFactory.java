package ihm;


import answer.Answer;

/**
 * Factory pattern for the answers. Creates a specific panel in function of the given answer.
 * @author Despelchin and Pereira
 *
 */
public class AnswerPanelFactory {
	public static AnswerPanelFactory factory;
	
	/**
	 * Constructor. Useless here
	 */
	private AnswerPanelFactory() {}
	
	/**
	 * Creates a panel in function of the given answer
	 * @param answer - the answer to factorise
	 * @return the correct answerpanel
	 */
	public AnswerPanel createAnswerPanel(Answer<?> answer) {
		try {
			if(answer.getClass().equals(Class.forName("answer.TextAnswer")) || answer.getClass().equals(Class.forName("answer.MultiAnswer")) || answer.getClass().equals(Class.forName("answer.ChoiceAnswer")))
				return new AnswerPanelText();
			if(answer.getClass().equals(Class.forName("answer.YesNoAnswer")))
				return new AnswerPanelRadio();
			if(answer.getClass().equals(Class.forName("answer.NumericalAnswer")))
				return new AnswerPanelNumerical();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Singleton pattern for the factory's instance
	 * @return this instance
	 */
	public static AnswerPanelFactory getInstance() {
		if(factory == null)
			factory = new AnswerPanelFactory();
		return factory;
	}
}
