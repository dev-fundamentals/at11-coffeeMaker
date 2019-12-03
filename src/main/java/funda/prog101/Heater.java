package main.java.funda.prog101;

public class Heater {
	
	boolean state;
	Pot pot;
	public Heater() {
		state = false;
	}
	public void turnOn() {
		this.state = true;
	}
	public void turnOff() {
		this.state = false;
	}
	public boolean getState() {
		return this.state;
	}

}
