package fil.coo;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import contents.Money;

public class TestLetter extends TestInitiateProject {
	BillOfExchange testLetter;
	
	@Before
	public void init() {
		setUp();
		testLetter = new BillOfExchange(billy, titouan, new Money(10));
	}
	
	@Test
	public void testBillOfExchange() {
		assertEquals(100, billy.getAccount().getAmount(), 0.01);
		billy.sendLetter(testLetter);
		assertEquals(10, titouan.getAccount().getAmount(), 0.01);
		testLetter.action();
		assertEquals(88.9,billy.getAccount().getAmount(), 0.01);
		assertEquals(19.5, titouan.getAccount().getAmount(),  0.01);	
	}

}
