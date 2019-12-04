package test.java.funda.prog101;

import static org.junit.Assert.*;
import org.junit.Test;

import main.java.funda.prog101.Container;

import main.java.funda.prog101.Sensor;

public class SensorTest {

	@Test
	public void IsEmpty_IfContainerNotEmpty_True() {
		Sensor sensor = new Sensor();
		Container container = null;
		boolean result = sensor.isEmpty(container);
		assertTrue(result);
	}
	
	@Test
	public void IsEmpty_IfContainerIsEmpty_True() {
		Sensor sensor = new Sensor();
		Container container = null;
		boolean result = sensor.isEmpty(container);
		assertTrue(result);
	}

}
