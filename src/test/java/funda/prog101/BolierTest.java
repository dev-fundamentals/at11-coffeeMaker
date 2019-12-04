package test.java.funda.prog101;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import main.java.funda.prog101.Boiler;
import main.java.funda.prog101.ContentType;

public class BolierTest {

	byte contentType = 12;
	byte temperature = 2;
	Boiler boiler1 = new Boiler(ContentType.WATER, contentType, temperature, true);
	@Test
	public void testBoilerConstructor() {
		assertEquals(boiler1, ContentType.WATER);
		assertEquals(boiler1.getCapacity(), 12);
		assertEquals(boiler1.getTemperature(), temperature);
		assertEquals(boiler1.getStatePipe(), true);
	}

	@Test
	public void testTurnOnPipeMethodToTrue() {
		boiler1.turnOnPipe(true);
		assertEquals(boiler1.getStatePipe(), true);
	}
	
	@Test
	public void testTurnOffPipeMethodToFalse() {
		boiler1.turnOffPipe(false);
		assertEquals(boiler1.getStatePipe(), false);
	}
}
