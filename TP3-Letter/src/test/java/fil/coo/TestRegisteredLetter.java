package fil.coo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import contents.Text;

public class TestRegisteredLetter extends TestInitiateProject{
	private RegisteredLetter testRegisteredLetter;
	
	@Before
	public void init() {
		setUp();
		Letter<Text> letter = new SimpleLetter(billy, titouan, new Text("Hi titou !"));
		testRegisteredLetter = new RegisteredLetter(letter);
	}
	
	@Test
	public void testRegisteredLetter() {
		assertEquals(100, billy.getAccount().getAmount(), 0.01);
		billy.sendLetter(testRegisteredLetter);
		testRegisteredLetter.action();
		assertEquals(99.42,billy.getAccount().getAmount(), 0.01);
	}
}
