package main.java.funda.prog101;

public class Boiler extends Container {
	protected byte temperature;
	protected boolean statePipe;

	/**
	 * Override addCups methods Adds cups to the container when it has between 0 and
	 * 11, maximum 12 cups
	 */
	public Boiler(ContentType contentType, byte quantity, byte limit, boolean aboveHeater) {
		this.contentType = contentType;
		this.quantity = quantity;
		this.limit = limit;
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
}
