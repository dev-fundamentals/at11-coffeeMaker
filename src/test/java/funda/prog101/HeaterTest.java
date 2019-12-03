package test.java.funda.prog101;

import static org.junit.Assert.*;
import org.junit.Test;

import main.java.funda.prog101.Heater;

public class HeaterTest {

	@Test
	public void TurnOn_SetTurnON_True() {
		Heater heater = new Heater();
		boolean expected = true;
		heater.turnOn();
		boolean actual = heater.getState();
		assertEquals(expected, actual);
	}
	@Test
	public void TurnOff_SetTurnOff_False() {
		Heater heater = new Heater();
		boolean expected = false;
		heater.turnOff();
		boolean actual = heater.getState();
		assertEquals(expected, actual);
	}

}
