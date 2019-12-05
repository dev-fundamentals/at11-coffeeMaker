package test.java.funda.prog101;

import static org.junit.Assert.*;
import org.junit.Test;

import main.java.funda.prog101.Heater;

public class HeaterTest {

	@Test
	public void SwichHeater_TurnOn_True() {
		Heater heater = new Heater();
		
		boolean expected = true;
		boolean actual = heater.switchHeater();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void SwichHeater_TurnOff_False() {
		Heater heater = new Heater();
		heater.switchHeater();
		
		boolean expected = false;
		boolean actual = heater.switchHeater();
		
		assertEquals(expected, actual);
	}

}
