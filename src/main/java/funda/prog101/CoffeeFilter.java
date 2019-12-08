package main.java.funda.prog101;

public class CoffeeFilter extends Container{
	
	/**
	 * Constructor of CoffeeFilter class
	 */
	public CoffeeFilter() {
		this.contentType = ContentType.COFFEEBEAN;
		this.quantity = 1;
		this.limit = 1;  
	}

	/**
	 * Override method of Container class
	 */
	@Override
	public void addCups() {
		this.contentType = ContentType.COFFEEBEAN;
		this.quantity = 1;
	}
	
	/**
	 * mix coffee method
	 */
	public void mixCoffee() {
		this.contentType = contentType.COFFEE;
	}
	
	/**
	 * Method for checking quantity of filter container
	 * @return byte
	 */
	public byte quantityChecker() {
		return this.quantity;
	}
}
