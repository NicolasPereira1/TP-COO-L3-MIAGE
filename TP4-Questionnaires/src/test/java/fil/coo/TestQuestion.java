package fil.coo;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import quiz.Question;
import quiz.QuizFactory;

public class TestQuestion extends TestInitiateQuiz{
	
	@Before
	public void init() throws IOException {
		setUp();
	}
		
	@Test
	public void testAccept(){
		assertTrue(question.accept(answer));
	}
	
	@Test
	public void testUserAnswerCorrect() {
		question.setUserAnswer(answer);
		assertTrue(question.isUserAnswerCorrect());
	}
}
