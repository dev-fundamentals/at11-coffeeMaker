package test.java.funda.prog101;

import static org.junit.Assert.*;

import java.awt.Container;

import org.junit.Test;

import main.java.funda.prog101.Boiler;
import main.java.funda.prog101.CoffeeFilter;
import main.java.funda.prog101.Heater;
import main.java.funda.prog101.MarkIV;
import main.java.funda.prog101.Pot;

public class MarkIVTest {
	
	@Test
	public void testInitMarkIVMarkIVInited() {
		MarkIV markIV = new MarkIV();
		MarkIV mark = new MarkIV();
		assertTrue(markIV.equals(mark));
	}
	
	@Test
	public void testPowerButtonMethodToPowerOn() {
		MarkIV markIV = new MarkIV();
		markIV.powerButton(true);
		assertTrue(markIV.verifyStateMark(true));
	}
	
	@Test
	public void testPowerButtonMethodToPowerOff() {
		MarkIV markIV = new MarkIV();
		markIV.powerButton(false);
		boolean actual = markIV.verifyStateMark(false);
		assertEquals(true, actual);
	}
	
	@Test
	public void testPowerButtonMethodHappyPath() throws InterruptedException {
		MarkIV markIV = new MarkIV();
		markIV.powerButton(true);
		boolean actual = markIV.verifyStateMark(true);
		Heater heaterBolier = markIV.getHeaterBoiler();
		Heater heaterPot = markIV.getHeaterPot();
		Boiler boiler = (Boiler)markIV.getBoiler();
		
		heaterBolier.switchHeater();
		CoffeeFilter coffe = (CoffeeFilter)markIV.getCoffeeFilter();
		coffe.mixCoffee();
		Thread.sleep(10000);
		Pot pot = (Pot)markIV.getPot();
		pot.addCups();
		heaterPot.switchHeater();
		heaterBolier.switchHeater();
//		markIV.presure = true;
		boiler.switchPipe();
	}
}
