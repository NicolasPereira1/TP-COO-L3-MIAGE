package fil.coo;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import quiz.QuizFactory;

public class TestMultiAnswer extends TestInitiateQuiz{

	@Before
	public void init() throws IOException {
		setUp();
		this.text = "Type Yes";
		this.answer = "Yes";
		this.points = "1";
		this.answerClass = "YesNo";
		QuizFactory qf = QuizFactory.getIntance();
		this.question = qf.createQuestion(text, answer, points, answerClass);
	}
	
	@Test
	public void testInstruction() {
		assertEquals("(Yes/No)",question.getAnswer().instruction());
	}
	
	@Test
	public void testAccepte() {
		assertTrue(question.getAnswer().accepte("Yes"));
		assertTrue(question.getAnswer().accepte("No"));
	}
}
	