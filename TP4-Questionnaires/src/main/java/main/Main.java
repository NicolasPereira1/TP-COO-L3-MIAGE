package main;

import ihm.GraphicalDisplayer;
import quiz.Quiz;
import quiz.QuizFactory;

/**
 * Main of the application. Launch the quiz with the "Questions" file.
 * @author Despelchin & Pereira
 *
 */
public class Main{
	/**
	 * Main of the app
	 * @param args - chose the interface
	 */
	public static void main(String[] args) {
		QuizFactory quizFactory = QuizFactory.getIntance();
		Quiz quiz = quizFactory.createQuiz("Questions");
		
		if(args.length == 0)
			System.out.println("Please chose an interface.");
		else if(args[0].equals("Graphical")) {
			GraphicalDisplayer gd = new GraphicalDisplayer();
			gd.createFram(quiz);	
		}else if(args[0].equals("Console"))
			quiz.askAll();
		
	}
}
