package actions;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import roomPackage.Direction;
import roomPackage.Room;

public class MoveTest extends ActionTest{
	private Room room;
	
	@Before
	public void init() {
		setUp();
		room = new Room(null, null, null);
		neighbours.put(Direction.North, room);
	}
	
	@Test
	public void testExecution() {
		assertEquals(adventureGame.currentRoom(), startingRoom);
		adventureGame.playerMoveTo(Direction.North);
		assertEquals(adventureGame.currentRoom(), room);
	}

}