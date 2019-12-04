package main.java.funda.prog101;

public class Boiler extends Container{
	/** Override addCups methods
	  Adds cups to the container when it has between 0 and 11, 
	  maximum 12 cups*/
	@Override
	public void addCups(Container container) {
		// TODO Auto-generated method stub
		for (int i = container.quantity; i < container.limit; i++) {
			container.quantity++;
		}
	}
}
