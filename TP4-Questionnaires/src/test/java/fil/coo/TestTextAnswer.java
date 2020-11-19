package fil.coo;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import quiz.QuizFactory;

public class TestTextAnswer extends TestInitiateQuiz{

	@Before
	public void init() throws IOException {
		setUp();
		this.text = "Type text";
		this.answer = "text";
		this.points = "1";
		this.answerClass = "Text";
		QuizFactory qf = QuizFactory.getIntance();
		this.question = qf.createQuestion(text, answer, points, answerClass);
	}
	
	@Test
	public void testInstruction() {
		assertEquals("(Text)",question.getAnswer().instruction());
	}
	
	@Test
	public void testAccepte() {
		assertTrue(question.getAnswer().accepte("text"));
		assertTrue(question.getAnswer().accepte("This is a random text just for test this method"));
	}
	
}