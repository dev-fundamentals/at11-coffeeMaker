package main.java.funda.prog101;

public class PotSensor extends Sensor{
	public boolean isAboveHeater(Pot pot) {
		return pot.aboveHeater;
	}

	@Override
	public boolean isEmpty(Container pot) {
		return pot.contentType.equals(ContentType.EMPTY);
	}
}
