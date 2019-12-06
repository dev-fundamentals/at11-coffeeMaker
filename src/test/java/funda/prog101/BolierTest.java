package test.java.funda.prog101;

import static org.junit.Assert.*;
import org.junit.Test;

import main.java.funda.prog101.Boiler;
import main.java.funda.prog101.Container;

public class BolierTest {

	@Test
	public void addCups_AddCupsofContainerUntil12_True() {
		Container boiler = new Boiler();
		boiler.addCups();
		boolean actual = boiler.equals(boiler);
		
		assertTrue(actual);
	}
}
