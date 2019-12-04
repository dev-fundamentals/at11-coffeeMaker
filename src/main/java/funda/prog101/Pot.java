package main.java.funda.prog101;

public class Pot extends Container {
	protected boolean aboveHeater = true;

	/*
	 * Adds cups to the container when it has between 0 and 11, maximum 12 cups
	 */
	@Override
	public void addCups(Container container) {
		// TODO Auto-generated method stub
		for (int iterator = container.quantity; iterator < container.limit; iterator++) {
			container.quantity++;
		}
	}

	/* Change the state of variable aboveHeater */
	public void putOnTakeOutPot() {
		if (aboveHeater)
			this.aboveHeater = false;
		this.aboveHeater = true;
	}

	/*
	 * Verify that the Pot is on the Heater, returns true is it, and false if not on
	 * the Heater.
	 */
	public boolean equals(boolean statusPot) {
		if (this.aboveHeater == statusPot)
			return true;
		return false;
	}

	/*
	 * Verify the pot is Pot contains 12 cups.
	 */
	public boolean equals(Container pot) {
		if (pot.quantity == pot.limit)
			return true;
		return false;
	}
}