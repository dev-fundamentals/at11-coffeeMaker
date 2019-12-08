package main.java.funda.prog101;

/**
 * This class define data objects for Pot, Boiler and CoffeeContainer, it is a superclass.
 * @author Enrique Carrizales
 *
 */
public abstract class Container {
	protected ContentType contentType;
	protected byte quantity;
	protected byte limit;
	
	/**
	 * This method increments the parameter quantity.
	 * @param container
	 */
	public abstract void addCups();
	
	/**
	 * This method activates a pipe and return his state.
	 * @return
	 */
	public boolean switchPipe() {
		return true;
	}
	
	/**
	 * This method update Pot's contentType.
	 * @param pot
	 */
	public void mixCoffee() {
	}
	/*
	 * Verify the pot is Pot contains 12 cups.
	 */
	public boolean equals(Container container) {
		if (container.quantity == container.limit)
			return true;
		return false;
	}
	
	/**
	 * Method for checking quantity of container
	 * @return byte
	 */
	public abstract byte quantityChecker();
}
