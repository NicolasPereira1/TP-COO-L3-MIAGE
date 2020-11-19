package fil.coo;

import static org.junit.Assert.*;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import answer.NumericalAnswer;
import quiz.Question;
import quiz.Quiz;
import quiz.QuizFactory;

public class TestQuizFactory extends TestInitiateQuiz{
	
	@Before
	public void init() throws IOException {
		setUp();
	}
	
	@Test
	public void testCreateQuiz() {
		assertEquals(5,quiz.getListQuestion().size());
	}
	
	
	@Test
	public void testCreateQuestion() throws IOException {
		assertEquals(text, question.getQuestionText());
		assertEquals(Integer.parseInt(points),question.getNbPoints());
	}

	
}
