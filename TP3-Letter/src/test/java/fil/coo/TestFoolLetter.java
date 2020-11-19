package fil.coo;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import contents.ListInhabitant;

public class TestFoolLetter extends TestInitiateProject{
	private List<Inhabitant> listInhabitants;
	private FoolLetter testFoolLetter;
	
	@Before
	public void init() {
		setUp();
		listInhabitants = new ArrayList<Inhabitant>();
		for(int i=0; i<20; i++)
			city.addInhabitant(new Inhabitant(city, new Account(50f)));
		while(listInhabitants.size()<5) {
			Inhabitant inhabitant = city.getRandomInhabitant();
			if(!listInhabitants.contains(inhabitant))
				listInhabitants.add(inhabitant);
		}
		testFoolLetter = new FoolLetter(titouan, billy, new ListInhabitant(listInhabitants));
	}
	
	@Test
	public void testFoolLetter() {
		float result = billy.getAccount().getAmount()-0.5f-1*5-(5f/100f)*5-0.5f*10f;
		billy.sendLetter(testFoolLetter);
		testFoolLetter.action();
		assertEquals(result,billy.getAccount().getAmount(), 0.01);
		System.out.println(billy.getAccount().getAmount());

	}
	
}
