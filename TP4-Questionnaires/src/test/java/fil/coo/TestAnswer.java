package fil.coo;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class TestAnswer extends TestInitiateQuiz{

	@Before
	public void init() throws IOException {
		setUp();
	}
	
	@Test
	public void testIsCorrect() {
		assertTrue(question.getAnswer().isCorrect("1"));
	}

}
