package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * A Quiz is a series of questions which need to be answered by the player.
 * @author Despelchin and Pereira
 *
 */
public class Quiz {
	private List<Question> listQuestion;
	/**
	 * Construct a Quiz
	 */
	public Quiz(){
		listQuestion = new ArrayList<Question>();
	}
	
	/**
	 * Ask for the player to do the Quiz. It display his score at the end.
	 */
	public void askAll() {
		Scanner scanner = new Scanner(System.in);
		int score=0;
		for(Question q : listQuestion) {
			System.out.println(q.getQuestionText());;
			String answer = "";
			do {
				System.out.println(q.getInstruction());
				answer = scanner.nextLine();
			}while(!q.accept(answer));
			
			q.setUserAnswer(answer);
			if(q.isUserAnswerCorrect()) {
				score += q.getNbPoints();
				displayCorrectAnswer(q.getNbPoints());
			}else {
				q.getGoodAnswer();
			}
		}
		scanner.close();
		displayScore(score);
	}
	
	/***
	 * Add a question to the quiz list
	 * @param question - the question to add on the quiz
	 */
	public void addQuestion(Question question) {
		listQuestion.add(question);
	}
	
	/**
	 * Score displayer
	 * @param score - the score to display
	 */
	private void displayScore(int score) {
		System.out.println("You have " + score + " points.");
	}
	
	/**
	 * Display the score earned if we answered it right.
	 * @param points - the points earned for this question
	 */
	private void displayCorrectAnswer(int points) {
		System.out.println("correct ("+ points + "point)");
	}

	/**
	 * @return the listQuestion
	 */
	public List<Question> getListQuestion() {
		return listQuestion;
	}
}
