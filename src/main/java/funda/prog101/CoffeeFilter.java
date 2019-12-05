package main.java.funda.prog101;

public class CoffeeFilter extends Container{
	
	public CoffeeFilter() {
		this.contentType = ContentType.COFFEEBEAN;
		this.limit = 1;  
	}

	@Override
	public void addCups() {
		this.contentType = ContentType.COFFEE;
		this.quantity = 1;
	}
}
