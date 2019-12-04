package main.java.funda.prog101;

public class Boiler extends Container{
	private byte temperature;
	private boolean statePipe;
	
	public ContentType getContentType() {
		return contentType;
	}
	
	public byte getCapacity() {
		return capacity;
	}
	
	public byte getTemperature() {
		return temperature;
	}
	
	public boolean getStatePipe() {
		return statePipe;
	}
	
	public Boiler(ContentType type, byte capacity, byte temperature,
					boolean deliveryPipe) {
		this.contentType = type;
		this.capacity = capacity;
		this.temperature = temperature;
		this.statePipe = deliveryPipe;
	}
	
	public void turnOnPipe(boolean state) {
		statePipe = state;
	}
	
	public void turnOffPipe(boolean state) {
		statePipe = state;
	}
	
	@Override
	public String addCups() {
		// TODO Auto-generated method stub
		return null;
	}
}
