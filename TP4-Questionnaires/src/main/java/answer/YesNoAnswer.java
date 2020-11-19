package answer;
/**
 * The answer of a question which type is yes or no.
 * @author Despelchin and Pereira
 *
 */
public class YesNoAnswer extends Answer<YesOrNo>{
	
	/**
	 * Create a Yes/No answer
	 * @param value - the value of the answer
	 */
	public YesNoAnswer(String value) {
		super(yesOrNo(value));
	}

	public String instruction() {
		return "(Yes/No)";
	}
	
	public boolean accepte(String answer) {
		boolean result = true;
		if(!answer.toLowerCase().equals("yes") && !answer.toLowerCase().equals("no"))
			result = false;
		return result;
	}
	
	/**
	 * Transform the value for the enum Type "Yes" or "No"
	 * @param value - the value to transform
	 * @return the enum type of the answer
	 */
//	private static YesOrNo yesOrNo(String value) {
//		if(value.toLowerCase().equals("yes"))
//			return YesOrNo.Yes;
//		if(value.toLowerCase().equals("no"))
//			return YesOrNo.No;
//		return null;
//	}
	
	
	
	public static void main(String[] args) {
		System.out.println("No".getClass());
	}
}
