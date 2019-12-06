package main.java.funda.prog101;

public class Pot extends Container {
	protected boolean aboveHeater = true;

	/*
	 * Adds cups to the container when it has between 0 and 11, maximum 12 cups
	 */
	public Pot(ContentType contentType, byte quantity, byte limit, boolean aboveHeater) {
		this.contentType = contentType;
		this.quantity = quantity;
		this.limit = limit;
		this.aboveHeater = aboveHeater;
	}

	public Pot() {
	}

	/**
	 * Adds cups to the container when it has between 0 and 11, maximum 12 cups.
	 */
	@Override
	public void addCups(Container container) {
		// TODO Auto-generated method stub
		for (int iterator = container.quantity; iterator < container.limit; iterator++) {
			container.quantity++;
		}
	}

	/**
	 * The method putOnTakeOutPot change the state of variable aboveHeater
	 */
	public void putOnTakeOutPot() {
		if (aboveHeater) {
			this.aboveHeater = false;
		} else {
			this.aboveHeater = true;
		}
	}

	/*
	 * This method the Pot is on the Heater, returns true is it, and false if not on
	 * the Heater.
	 */
	public boolean equals(boolean statusPot) {
		return this.aboveHeater == statusPot;
	}
}