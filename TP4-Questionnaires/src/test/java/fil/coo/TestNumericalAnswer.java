package fil.coo;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import quiz.QuizFactory;

public class TestNumericalAnswer extends TestInitiateQuiz{

	@Before
	public void init() throws IOException {
		setUp();
		this.text = "Type 1";
		this.answer = "1";
		this.points = "1";
		this.answerClass = "Numerical";
		QuizFactory qf = QuizFactory.getIntance();
		this.question = qf.createQuestion(text, answer, points, answerClass);
	}
	
	@Test
	public void testInstruction() {
		assertEquals("(Numerical)",question.getAnswer().instruction());
	}
	
	@Test
	public void testAccepte() {
		assertTrue(question.getAnswer().accepte("9"));
		assertTrue(question.getAnswer().accepte("14"));
	}
	
}