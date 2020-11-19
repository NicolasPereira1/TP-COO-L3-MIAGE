package fil.coo;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.Before;
import org.junit.Test;

import quiz.QuizFactory;

public class TestYesNoAnswer extends TestInitiateQuiz{

	@Before
	public void init() throws IOException {
		setUp();
		this.text = "Write \"one\", \"two\", \"three\" or \"four\"";
		this.answer = "one,two,three,four;";
		this.points = "2";
		this.answerClass = "Multi";
		QuizFactory qf = QuizFactory.getIntance();
		this.question = qf.createQuestion(text, answer, points, answerClass);
	}
		
	@Test
	public void testAccepte() {
		assertTrue(question.getAnswer().accepte("Yes"));
		assertTrue(question.getAnswer().accepte("one"));
	}
	
}
