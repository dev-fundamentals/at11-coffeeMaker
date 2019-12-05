package test.java.funda.prog101;

import static org.junit.Assert.*;
import org.junit.Test;

import main.java.funda.prog101.Container;
import main.java.funda.prog101.Pot;
import main.java.funda.prog101.PotSensor;
import main.java.funda.prog101.Sensor;

public class PotTest {

	@Test
	public void addCups_AddCupsofContainerUntil12_True() {
		Container pot = new Pot();
		pot.addCups();
		boolean actual = pot.equals(pot);

		assertTrue(actual);
	}

	@Test
	public void equals_verifyIfPotIsOnHeater_false() {
		Pot pot = new Pot();
		pot.putOnTakeOutPot();
		
		Sensor sensor = new PotSensor();
		
		boolean expected = false;
		boolean actual = sensor.isAboveHeater(pot);

		assertEquals(expected, actual);
	}

	@Test
	public void equals_verifyIfPotIsOnHeater_true() {
		Pot pot = new Pot();
		
		Sensor sensor = new PotSensor();
		
		boolean expected = true;
		boolean actual = sensor.isAboveHeater(pot);

		assertEquals(expected, actual);
	}
}
