package quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import answer.AnswerFactory;
/**
 * Factory pattern for the quiz. It create a quiz from a given file 
 * @author Despelchin and Pereira
 *
 */
public class QuizFactory {
	private static QuizFactory QUIZ_FACTORY;
	
	/**
	 * Constructor. Unused here.
	 */
	private QuizFactory () {}
	
	/**
	 * Create a question for the quiz
	 * @param text - the question herself
	 * @param answer - the correct answer(s)
	 * @param points - the number of points we earned if we answered good
	 * @param answerClass - the "type" of the correct answer (numerical, text, ...)
	 * @return the created Question
	 * @throws IOException
	 */
	public Question createQuestion(String text, String answer, String points, String answerClass) throws IOException{
		try {
			int nbrPoints = Integer.parseInt(points);
			return new Question(text, AnswerFactory.getInstance().buildAnswer(answerClass, answer), nbrPoints);
		}catch(NumberFormatException e) {
			throw new IOException("Bad format");
		}
	}
	
	/**
	 * Create a quiz with a file containing questions in a specific format.
	 * @param fileName - the file used to create the quiz
	 * @return the created quiz
	 */
	public Quiz createQuiz(String fileName) {
		Quiz quiz  = new Quiz();
		File source = new File(fileName);
		try {
			BufferedReader buffer = new BufferedReader(new FileReader(source));
			String line;
			while((line = buffer.readLine()) != null) {
				if(line == null || !line.contains(";"))
					throw new IOException("Bad format");
				String [] data = line.split(";");
				String answerClass = data[0];
				String answer = data[1];
				String text = data[2];
				String points = data[3];
				if(line == null || !line.contains(";"))
					throw new IOException("Bad format");
				quiz.addQuestion(this.createQuestion(text, answer, points, answerClass));
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return quiz;
	}

	/**
	 * Singleton pattern used to have only 1 quiz running
	 * @return the instance of the quiz
	 */
	public static QuizFactory getIntance() {
		if(QUIZ_FACTORY == null)
			QUIZ_FACTORY = new QuizFactory();
		return QUIZ_FACTORY;
	}
}
