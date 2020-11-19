package actions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import charaterPackage.Monster;

public class AttackTest extends ActionTest {
	private Monster monster;

	@Before
	public void init() {
	setUp();
	monster = new Monster("Zombie", adventureGame, 150, 50, 50);
	monsterList.add(monster);
	}
	
	@Test
	public void testExecution(){
		assertEquals(100, player.getHealthPoint());
		assertEquals(150, monster.getHealthPoint());
		player.attack(monster);
		assertEquals(50, player.getHealthPoint());
		assertEquals(50, monster.getHealthPoint());
		player.attack(monster);
		assertEquals(50, player.getHealthPoint());
		assertTrue(monster.getHealthPoint() <= 0);
	}
}
