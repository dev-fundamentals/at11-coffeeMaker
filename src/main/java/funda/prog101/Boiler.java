package main.java.funda.prog101;

public class Boiler extends Container {
	protected boolean statePipe;

	/**
	 * Override addCups methods Adds cups to the container when it has between 0 and
	 * 11, maximum 12 cups
	 */
	public Boiler(ContentType contentType, byte quantity, byte limit, boolean statePipe) {
		this.contentType = contentType;
		this.quantity = quantity;
		this.limit = limit;
		this.statePipe = statePipe;
	}

	public Boiler() {
	}
	
	/**
	 * Method for adding values to Boiler
	 * @param contentType enum
	 * @param quantity byte
	 * @param limit byte
	 * @param statePipe boolean
	 */
	public void AddBoiler(ContentType contentType, byte quantity, byte limit, boolean statePipe) {
		this.contentType = contentType;
		this.quantity = quantity;
		this.limit = limit;
		this.statePipe = statePipe;
	}
	
	/**
	 * Override addCups methods Adds cups to the container when it has between 0 and
	 * 11, maximum 12 cups
	 */
	@Override
	public void addCups() {
		for (int i = this.quantity; i < this.limit; i++) {
			this.quantity++;
		}
	}
	
	/**
	 * Method for checking quantity of Boiler container
	 * @return byte
	 */
	public byte quantityChecker() {
		return this.quantity;
	}
}
