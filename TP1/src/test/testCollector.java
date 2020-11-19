package test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import generics.AlreadyCarryingException;
import generics.Carrot;
import generics.Collector;
import generics.Vegetable;

public class testCollector {
	private Collector<Vegetable> collectorVegetable;
	private Collector<Carrot> collectorCarrot;
	private Carrot carrot;
	
	@Before
	public void initialization() {
		collectorVegetable = new Collector<Vegetable>("collectorVegetable");
		collectorCarrot = new Collector<Carrot>("collectorCarrot");
		carrot = new Carrot(2);
	}
	@Test
	public void takeAnObject() throws AlreadyCarryingException {
		assertTrue(collectorVegetable.getCarriedObject() == null);
		collectorVegetable.take(carrot);
		assertTrue(collectorVegetable.getCarriedObject().equals(carrot));
	}
	@Test(expected = AlreadyCarryingException.class)
	public void takeASecondeObject() throws AlreadyCarryingException {
		collectorVegetable.take(carrot);
		collectorVegetable.take(carrot);
	}
	@Test
	public void drop() throws AlreadyCarryingException {
		collectorVegetable.take(carrot);
		assertTrue(collectorVegetable.drop().equals(carrot));
		assertTrue(collectorVegetable.getCarriedObject() == null);
	}
	@Test
	public void giveTo() throws AlreadyCarryingException {
		collectorCarrot.take(carrot);
		assertTrue(collectorVegetable.getCarriedObject() == null);
		collectorCarrot.giveTo(collectorVegetable);
		assertTrue(collectorCarrot.getCarriedObject() == null);
		assertTrue(collectorVegetable.getCarriedObject().equals(carrot));
	}

}
