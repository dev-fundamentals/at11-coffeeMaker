package main.java.funda.prog101;

public class BoilerSensor extends Sensor {

	@Override
	public boolean isEmpty(Container boiler) {
		return boiler.contentType.equals(ContentType.EMPTY);
	}

}
