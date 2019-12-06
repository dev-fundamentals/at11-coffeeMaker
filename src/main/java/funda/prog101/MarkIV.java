package main.java.funda.prog101;

/**
 * Mark class, this is used to interetac with user 
 * @author Juan
 *
 */
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
		this.boiler = new Boiler(ContentType.WATER, (byte)12, (byte)12, false);
		this.pot = new Pot(ContentType.EMPTY, (byte)0, (byte)12, true);
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
	 * @throws InterruptedException 
	 */
	public void powerButton(boolean switchButton) throws InterruptedException {
		this.switchButton = switchButton;
		if (switchButton) {
			heaterBoiler.switchHeater();
			boiler.switchPipe();
			Thread.sleep(10000);
			this.light = true;
			for (int item = 0; item < boiler.limit; item++) {
				boiler.quantity--;
				coffeeFilter.addCups();
				coffeeFilter.mixCoffee();
				Thread.sleep(1000);
				pot.addCups();
			}
			heaterPot.switchHeater();
			this.presureValvue = true;
		}
		else {
			heaterBoiler.switchHeater();
			heaterPot.switchHeater();
			this.light = false;
			boiler.switchPipe();
			presureValvue = false;
		}
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
	
	public void actionHeater() {
		Pot pot1 = (Pot)pot;
		if (sensorPot.isAboveHeater(pot1)) {
			pot1.aboveHeater = false;
			heaterBoiler.switchHeater();
			this.presureValvue = false;
			boiler.switchPipe();
		}
		else {
			pot1.aboveHeater = true;
			heaterBoiler.switchHeater();
			this.presureValvue = false;
			boiler.switchPipe();
		}
	}
}
