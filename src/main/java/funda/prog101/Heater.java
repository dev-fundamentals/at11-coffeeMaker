package main.java.funda.prog101;

public class Heater {
	boolean state;

	public Heater() {
		this.state = false;
	}

	public boolean switchHeater() {
		if (this.state)
			return this.state = false;
		return this.state = true;
		
	}
}
