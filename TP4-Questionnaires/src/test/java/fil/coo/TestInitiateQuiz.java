package fil.coo;

import java.io.IOException;

import org.junit.Before;

import quiz.Question;
import quiz.Quiz;
import quiz.QuizFactory;

public abstract class TestInitiateQuiz {
	
	public String text;
	public String answer;
	public String points;
	public String answerClass;
	public Question question;
	public Quiz quiz;
	
	public void setUp() throws IOException {
		this.text = "Type 1";
		this.answer = "1";
		this.points = "1";
		this.answerClass = "Numerical";
		QuizFactory qf = QuizFactory.getIntance();
		this.question = qf.createQuestion(text, answer, points, answerClass);
		this.quiz = qf.createQuiz("QuestionsForTest");
	}
}
