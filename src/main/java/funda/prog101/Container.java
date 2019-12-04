package main.java.funda.prog101;

public abstract class Container {
	protected ContentType contentType;
	protected byte quantity;
	
	public abstract String addCups(Container container);
	
	public boolean switchPipe() {
		return true;
	}
	
	public void mixCoffee(Pot pot) {
	}
	
}
