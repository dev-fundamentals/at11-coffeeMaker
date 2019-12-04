package main.java.funda.prog101;

public class Pot extends Container {
	protected boolean aboveHeater = true;
	/*Adds cups to the container when it has between 0 and 11, maximum 12 cups*/
	@Override
	public void addCups(Container container) {
		// TODO Auto-generated method stub

		for (int i = container.quantity; i < container.limit; i++) {
			container.quantity++;
		}
	}
	/* Change the state of variable aboveHeater */
	public void putInTakeOutPot() {
		if (aboveHeater) {
			aboveHeater = true;
		} else {
			aboveHeater = false;
		}
	}
	/* Verify that the Pot is on the Heater, returns true is it, and false if not on the Heater.*/
	public boolean equals(boolean statePot) {
		if (statePot == this.aboveHeater) {
			return true;
		} else {
			return false;
		}
	}
}
