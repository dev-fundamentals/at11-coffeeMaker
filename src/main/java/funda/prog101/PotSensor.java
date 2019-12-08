package main.java.funda.prog101;

public class PotSensor extends Sensor {
	public boolean isAboveHeater(Container pot) {
		Pot p = (Pot)pot;
		return p.aboveHeater;
	}

	@Override
	public boolean isEmpty(Container pot) {
		return pot.contentType.equals(ContentType.EMPTY);
	}
}
