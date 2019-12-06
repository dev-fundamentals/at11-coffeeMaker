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

	@Override
	public void addCups() {
		// TODO Auto-generated method stub
		for (int i = this.quantity; i < this.limit; i++) {
			this.quantity++;
		}
	}
	
	/**
	 * Method for get Boiler quantity
	 * @return byte
	 */
	public byte getQuantity() {
		return this.quantity;
	}
}
