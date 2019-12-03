package main.java.funda.prog101;

public class Boiler extends Container{
	
	@Override
	public String addCups() {
		// TODO Auto-generated method stub
		return null;
	}

	private byte temperature;
	private boolean deliveryPipe;
	
	public Boiler(TypeContent type, byte capacity, byte temperature,
					boolean deliveryPipe) {
		super(type, capacity);
		this.temperature = temperature;
		this.deliveryPipe = deliveryPipe;
	}
	
	public void turnOnPipe() {
		deliveryPipe = true;
	}
	
	public void turnOffPipe() {
		deliveryPipe = false;
	}
}
