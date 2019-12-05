package main.java.funda.prog101;

public class MarkIV {
	private Container boiler;
	private Container pot;
	private Container coffeeFilter;
	private Heater heaterBoiler;
	private Heater heaterPot;
	private Sensor sensorBoiler;
	private Sensor sensorPot;
	private boolean switchButton;
	private boolean light;
	private boolean presureValvue;
	
	public Container getBoiler() {
		return boiler;
	}

	public Container getPot() {
		return pot;
	}

	public Container getCoffeeFilter() {
		return coffeeFilter;
	}

	public Heater getHeaterBoiler() {
		return heaterBoiler;
	}

	public Heater getHeaterPot() {
		return heaterPot;
	}

	public Sensor getSensorBoiler() {
		return sensorBoiler;
	}

	public Sensor getSensorPot() {
		return sensorPot;
	}

	public boolean isSwitchButton() {
		return switchButton;
	}

	public boolean isLight() {
		return light;
	}

	/**
	 * This is MarkIV constructor
	 */
	public MarkIV() {
		this.boiler = new Boiler(ContentType.WATER, (byte)12, (byte)12, true);
		this.pot = new Pot();
		this.coffeeFilter = new CoffeeFilter();
		this.heaterBoiler = new Heater();
		this.heaterPot = new Heater();
		this.sensorBoiler = new BoilerSensor();
		this.sensorBoiler = new PotSensor();
		this.switchButton = false;
		this.light = false;
		this.presureValvue = false;
	}
	
	/**
	 * This method is for setting startButton
	 * @param switchButton boolean parameter;
	 */
	public void powerButton(boolean switchButton) {
		this.switchButton = switchButton;
		this.light = switchButton;
		this.presureValvue = switchButton;
	}
	
	/**
	 * This is the verifyingStateMark used to verify markIv state
	 * @param state gets boolean value
	 * @return a boolean result e.g. true or false
	 */
	public boolean verifyStateMark(boolean state) {
		return switchButton == state;
	}

	/**
	 * This is an Override of equals method from object class
	 * @param obj Object parameter to compare the object
	 * @return its return is false or true
	 */
	@Override
	public boolean equals(Object obj) {
		MarkIV other = (MarkIV) obj;
		if (light != other.light)
			return false;
		if (switchButton != other.switchButton)
			return false;
		return true;
	}
}
