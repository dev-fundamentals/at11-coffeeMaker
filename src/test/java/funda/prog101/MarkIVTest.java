package test.java.funda.prog101;

import static org.junit.Assert.*;
import org.junit.Test;
import main.java.funda.prog101.MarkIV;

public class MarkIVTest {
	
	@Test
	public void testInitMarkIV_MarkIVInited() {
		MarkIV markIV = new MarkIV();
		MarkIV mark = new MarkIV();
		assertTrue(markIV.equals(mark));
	}
	
	@Test
	public void testPowerButtonMethodTo_powerOn() {
		MarkIV markIV = new MarkIV();
		markIV.powerButton(true);
		assertTrue(markIV.verifyStateMark(true));
	}
	
	@Test
	public void testPowerButtonMethodTo_powerOff() {
		MarkIV markIV = new MarkIV();
		markIV.powerButton(false);
		boolean actual = markIV.verifyStateMark(false);
		assertEquals(true, actual);
	}
}
