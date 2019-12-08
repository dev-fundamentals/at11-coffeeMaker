package test.java.funda.prog101;

import static org.junit.Assert.*;

import java.awt.Container;

import org.junit.Test;

import main.java.funda.prog101.Boiler;
import main.java.funda.prog101.CoffeeFilter;
import main.java.funda.prog101.ContentType;
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
	public void testPowerButtonMethodHappyPath() throws InterruptedException {
		MarkIV markIV = new MarkIV();
		Boiler boiler = (Boiler)markIV.getBoiler();
		Pot pot = (Pot)markIV.getPot();
		markIV.powerButton(true);
		String message = markIV.prepareCoffee((byte)6);
		System.out.println(message);
		boolean actual = markIV.verifyStateMark(true);
		boolean actualLight = markIV.isLight();
		boolean expected = true;
		
		assertEquals(expected, actual);
		assertEquals(expected, actualLight);
		assertEquals(6, boiler.quantityChecker());
		assertEquals(6, pot.quantityChecker());
	}
	
	@Test
	public void testPowerButtonMethodToPowerOff() throws InterruptedException {
		MarkIV markIV = new MarkIV();
		Boiler boiler = (Boiler)markIV.getBoiler();
		Pot pot = (Pot)markIV.getPot();
		markIV.powerButton(false);
		boolean actual = markIV.verifyStateMark(true);
		boolean actualLight = markIV.isLight();
		boolean expected = false;
		
		assertEquals(expected, actual);
		assertEquals(expected, actualLight);
		assertEquals(12, boiler.quantityChecker());
		assertEquals(0, pot.quantityChecker());
	}
	
	@Test
	public void markIfPotIsNotAbove() throws InterruptedException {
		MarkIV markIV = new MarkIV();
		Boiler boiler = (Boiler)markIV.getBoiler();
		Pot pot = (Pot)markIV.getPot();
		pot.putOnTakeOutPot();
		markIV.powerButton(true);
		String message = markIV.prepareCoffee((byte)6);
		System.out.println(message);
		boolean actual = markIV.verifyStateMark(true);
		boolean actualLight = markIV.isLight();
		boolean expected = true;
		
		assertEquals(expected, actual);
		assertEquals(false, pot.isAbove(true));
	}
	
	@Test
	public void markIfBoilerIsEmpty() throws InterruptedException {
		MarkIV markIV = new MarkIV();
		Boiler boiler = (Boiler)markIV.getBoiler();
		boiler.AddBoiler(ContentType.EMPTY, (byte)0, (byte)12, false);
		Pot pot = (Pot)markIV.getPot();
		markIV.powerButton(true);
		String message = markIV.prepareCoffee((byte)6);
		System.out.println(message);
		boolean actual = markIV.verifyStateMark(true);
		boolean expected = true;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void markIfBoilerIsNotEnoghWater() throws InterruptedException {
		MarkIV markIV = new MarkIV();
		Boiler boiler = (Boiler)markIV.getBoiler();
		Pot pot = (Pot)markIV.getPot();
		markIV.powerButton(true);
		String message = markIV.prepareCoffee((byte)13);
		System.out.println(message);
		boolean actual = markIV.verifyStateMark(true);
		boolean expected = true;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void markIsNotPowerOn() throws InterruptedException {
		MarkIV markIV = new MarkIV();
		Boiler boiler = (Boiler)markIV.getBoiler();
		Pot pot = (Pot)markIV.getPot();
		markIV.powerButton(false);
		String message = markIV.prepareCoffee((byte)6);
		System.out.println(message);
		boolean actual = markIV.verifyStateMark(true);
		boolean expected = false;
		
		assertEquals(expected, actual);
	}
}
