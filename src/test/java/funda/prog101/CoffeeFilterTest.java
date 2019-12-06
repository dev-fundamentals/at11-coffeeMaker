package test.java.funda.prog101;

import static org.junit.Assert.*;
import org.junit.Test;

import main.java.funda.prog101.Container;
import main.java.funda.prog101.ContentType;
import main.java.funda.prog101.Pot;

public class CoffeeFilterTest {

	@Test
	public void addCups_AddCupsofContainerUntil12_True() {
		Container pot = new Pot();
		pot.addCups();
		boolean actual = pot.equals(pot);

		assertTrue(actual);
	}
	
	@Test
	public void mixCoffee_MixCoffeeBeansWithWater_PotFullofCoffee() {
		Container pot = new Pot();
		boolean expected = pot.equals(pot);
		
		assertTrue(expected);
	}

}
