package actions;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import objects.MockItem;

public class UseTest extends ActionTest{
	private MockItem item;

	@Before
	public void init() {
		setUp();
		item = new MockItem();
	}
	
	@Test
	public void testExecution(){
		assertEquals(0, item.getCpt());
		item.isUsedBy(player);
		assertEquals(1, item.getCpt());
	}
}
