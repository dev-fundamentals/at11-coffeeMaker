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
	public void addCups() {
		this.quantity++;
	}

	/**
	 * The method putOnTakeOutPot change the state of variable aboveHeater
	 */
	public void putOnTakeOutPot() {
		this.aboveHeater = !aboveHeater;
	}
	
	/**
	 * Method for checking quantity of Pot container
	 * @return byte
	 */
	public byte quantityChecker() {
		return this.quantity;
	}
	
	/**
	 * This method is for return pot quantity
	 * @return byte
	 */
	public boolean isAbove(boolean above) {
		return this.aboveHeater == above;
	}
}