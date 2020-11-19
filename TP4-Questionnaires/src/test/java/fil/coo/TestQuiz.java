package fil.coo;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.Before;
import org.junit.Test;

public class TestQuiz extends TestInitiateQuiz{

	@Before
	public void init() throws IOException {
		setUp();
	}
	
	@Test
	public void testAddQuestion() {
		assertEquals(5,quiz.getListQuestion().size());
		quiz.addQuestion(question);
		assertEquals(6,quiz.getListQuestion().size());
	}	
	
}
