package test.java.funda.prog101;

import static org.junit.Assert.*;
import org.junit.Test;
import main.java.funda.prog101.MarkIV;

public class MarkIVTest {

	@Test
	public void testInitMarkIV_MarkIVInited() {
		MarkIV markIV = new MarkIV(true, true);
		assertEquals(markIV.getStartButton(), true);
		assertEquals(markIV.getLight(), true);
	}
}
