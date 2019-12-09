package main.java.funda.prog101;

public class Heater {
	boolean state;

	public Heater() {
		this.state = false;
	}

	public boolean switchHeater() {
		return this.state = !state;
	}
}
