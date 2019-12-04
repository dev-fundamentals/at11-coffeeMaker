package test.java.funda.prog101;

import static org.junit.Assert.*;
import org.junit.Test;

import main.java.funda.prog101.Container;
import main.java.funda.prog101.Pot;

public class PotTest {

	@Test
	public void addCups_AddCupsofContainer_12() {
		var expected = 12;
		Container pot = new Pot();
		var actual = pot.addCups(pot);
		assertEquals(expected, actual);
	}

	@Test
	public void addCups_AddCupsofContainer_0() {
		var expected = 8;
		Container pot = new Pot();
		var actual = pot.addCups(pot);
		assertEquals(expected, actual);
	}
	
	@Test
	public void equals_verifyIfPotIsOnHeater_false() {
		boolean expected = false;
		Container pot = new Pot();
		boolean statePot = false;
		boolean actual = pot.equals(statePot);
		assertEquals(expected, actual);
	}
	
	@Test
	public void equals_verifyIfPotIsOnHeater_true() {
		boolean expected = true;
		Container pot = new Pot();
		boolean statePot = false;
		boolean actual = pot.equals(statePot);
		assertEquals(expected, actual);
	}
}
