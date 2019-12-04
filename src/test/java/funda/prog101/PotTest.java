package test.java.funda.prog101;

import static org.junit.Assert.*;
import org.junit.Test;

import main.java.funda.prog101.Container;
import main.java.funda.prog101.Pot;

public class PotTest {

	@Test
	public void addCups_AddCupsofContainerUntil12_True() {
		Container pot = new Pot();
		pot.addCups(pot);
		var actual = pot.equals(pot);
		assertTrue(actual);
	}

	@Test
	public void equals_verifyIfPotIsOnHeater_false() {
		boolean expected = false;
		Pot pot = new Pot();
		pot.putInTakeOutPot();
		boolean actual = pot.equals(expected);
		assertEquals(expected, actual);
	}

	@Test
	public void equals_verifyIfPotIsOnHeater_true() {
		boolean expected = true;
		Pot pot = new Pot();
		boolean actual = pot.equals(expected);
		assertEquals(expected, actual);
	}
}
