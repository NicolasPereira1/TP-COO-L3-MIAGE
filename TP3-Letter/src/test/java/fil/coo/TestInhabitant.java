package fil.coo;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import contents.Money;
import contents.Text;

public class TestInhabitant extends TestInitiateProject{
	BillOfExchange testLetter;
	
	@Before
	public void init() {
		setUp();
		testLetter = new BillOfExchange(billy, titouan, new Money(10));
		billy.sendLetter(testLetter);
	}
	
	@Test
	public void testSendLetter() {
		assertTrue(city.getMailbox().contains(testLetter));
	}
	
	@Test
	public void testReceiveLetter() {
		assertEquals(10, titouan.getAccount().getAmount(), 0.01);
		titouan.receiveLetter(testLetter);
		assertEquals(19.5, titouan.getAccount().getAmount(), 0.01);
	} 

}
