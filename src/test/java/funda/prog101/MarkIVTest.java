package test.java.funda.prog101;

import static org.junit.Assert.*;
import java.util.concurrent.locks.Condition;
import org.junit.Test;
import main.java.funda.prog101.MarkIV;

public class MarkIVTest {
	
	@Test
	public void testInitMarkIV_MarkIVInited() {
		MarkIV markIV = new MarkIV(true);
		MarkIV mark = new MarkIV(true);
		assertTrue(markIV.equals(mark));
	}
	
	@Test
	public void testPowerButtonMethodToPowerOn() {
		MarkIV markIV = new MarkIV(false);
		markIV.powerButton(true);
		assertTrue(markIV.verifyStateMark(true));
	}
	
	@Test
	public void testPowerButtonMethodToPowerOff() {
		MarkIV markIV = new MarkIV(false);
		markIV.powerButton(false);
		boolean actual = markIV.verifyStateMark(false);
		assertEquals(true, actual);
	}
}
