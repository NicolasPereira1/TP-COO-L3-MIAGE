package fil.coo;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import contents.Text;

public class TestCity extends TestInitiateProject{

	@Before
	public void init() {
		setUp();
		SimpleLetter test = new SimpleLetter(titouan, billy, new Text("Hello there"));
		SimpleLetter testAnswer = new SimpleLetter(billy, titouan, new Text("General Kenobi"));
		billy.sendLetter(test);
		titouan.sendLetter(testAnswer);
	}
	
	@Test
	public void testDistributeLetter() {
		city.distributeLetters();
		assertTrue(city.mailbox.isEmpty());
	}

}
