package main.java.funda.prog101;

public class CoffeeFilter extends Container {

	public CoffeeFilter() {
		this.contentType = ContentType.COFFEEBEAN;
		this.limit = 1;
	}

	/*
	 * Adds cups to the container when it has between 0 and 11, maximum 12 cups Whit
	 * 
	 * @param iterator goes to from quantity to limit
	 */
	@Override
	public void addCups() {
		for (int iterator = this.quantity; iterator < this.limit; iterator++) {
			this.quantity++;
		}
	}

	/*
	 * Mix the Water and Coffee bean to prepare coffee out quantity equals 12 to
	 * fill the Pot
	 */
	public void mixCoffee(Pot pot) {
		byte quantity = 12;
		pot.contentType = ContentType.COFFEE;
		pot.quantity = quantity;
	}
}
