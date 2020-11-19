package quiz;

import answer.Answer;

/**
 * A question of the Quiz. They can have different types of answers.
 * @author Despelchin and Pereira
 *
 */
public class Question {
	private String text;
	private Answer<?> answer;
	private int points;
	private String userAnswer;	
	
	/**
	 * Construct a question
	 * @param text - the question text
	 * @param answer - the right answer of the question
	 * @param points - the number of points we win if we answer right
	 */
	public Question(String text, Answer<?> answer, int points) {
		this.text = text;
		this.answer = answer;		
		this.points = points;
	}
	
	/**
	 * Print the question on the screen
	 * @return the question
	 */
	public String getQuestionText() {
		return text;
	}
	
	/**
	 * Check if the given answer type and the type of the right one matches.
	 * @param answer - the answer to look his type.
	 * @return true if the answer type given match with the right answer type of the question
	 */
	public boolean accept(String answer) {
		return this.answer.accepte(answer);
	}
	
	/**
	 * Set the user answer
	 * @param answer - the user answer
	 */
	public void setUserAnswer(String answer) {
		this.userAnswer = answer;
	}
	
	/**
	 * Check if the right answer an the user answer matches
	 * @return true if yes, false if not
	 */
	public boolean isUserAnswerCorrect() {
		if(this.answer.isCorrect(userAnswer)) return true;
		return false;
	}
	
	/**
	 * Get the points value of this question
	 * @return the points value of this question
	 */
	public int getNbPoints() {
		return points;
	}
	
	/**
	 * Display the right answer
	 */
	public void getGoodAnswer(){
		System.out.println("Wrong, the good anwser is : " + answer.toString());
	}

	/**
	 * @return the instruction
	 */
	public String getInstruction() {
		return answer.instruction();
	}
	
	/**
	 * @return the Answer
	 */
	public Answer<?> getAnswer() {
		return answer;
	}
}
