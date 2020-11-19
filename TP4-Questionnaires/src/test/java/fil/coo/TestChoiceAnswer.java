package fil.coo;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.Before;
import org.junit.Test;

import quiz.QuizFactory;

public class TestChoiceAnswer extends TestInitiateQuiz{

	@Before
	public void init() throws IOException {
		setUp();
		this.text = "The good answer is Choice2";
		this.answer = "Choice2,Choice4,Choice1,Choice3";
		this.points = "1";
		this.answerClass = "Choice";
		QuizFactory qf = QuizFactory.getIntance();
		this.question = qf.createQuestion(text, answer, points, answerClass);
	}
	
	@Test
	public void testAccepte() {
		assertTrue(question.getAnswer().accepte("Choice2"));
		assertFalse(question.getAnswer().accepte("Choice"));
	}
	

	
}