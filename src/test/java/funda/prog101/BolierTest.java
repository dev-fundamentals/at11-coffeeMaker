package test.java.funda.prog101;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import main.java.funda.prog101.Boiler;

public class BolierTest {

	Boiler boiler1 = new Boiler(TypeContent.WATER, 12, 2, true);
	@Test
	public void testBoilerConstructor() {
		assertEquals(boiler1.TypeContent, TypeContent.WATER);
		assertEquals(boiler1.capacity, 12);
		assertEquals(boiler1.getTemperature(), 2);
		assertEquals(boiler1.getDeliveryPipe(), true);
	}

	@Test
	public void testTurnOnPipeMethodToTrue() {
		boiler1.turnOnPipe(true);
		assertEquals(boiler1.getDeliveryPipe(), true);
	}
	
	@Test
	public void testTurnOffPipeMethodToFalse() {
		boiler1.turnOffPipe(false);
		assertEquals(boiler1.getDeliveryPipe(), false);
	}
}
