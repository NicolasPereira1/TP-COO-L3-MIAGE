package fil.coo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import contents.Text;

public class TestUrgentLetter extends TestInitiateProject{
	private UrgentLetter urgentLetter;
	private RegisteredLetter registeredLetter;
	
	@Before
	public void init() {
		setUp();
		Letter<Text> letter = new SimpleLetter(billy, titouan, new Text("Hi titou !"));
		registeredLetter = new RegisteredLetter(letter);
		urgentLetter = new UrgentLetter(registeredLetter);
	}
	
	@Test
	public void testUrgentLetter() {
		assertEquals(100, billy.getAccount().getAmount(), 0.01);
		billy.sendLetter(urgentLetter);
		urgentLetter.action();
		assertEquals(98.85,billy.getAccount().getAmount(), 0.01);
	}
}
