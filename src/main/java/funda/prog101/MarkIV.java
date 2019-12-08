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
	private Sensor boilerSensor;
	private Sensor potSensor;
	private boolean switchButton;
	private boolean light;
	private boolean presureValvue;
	
	public Container getBoiler() {
		return boiler;
	}

	public Container getPot() {
		return pot;
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
		this.boilerSensor = new BoilerSensor();
		this.potSensor = new PotSensor();
		this.switchButton = false;
		this.light = false;
		this.presureValvue = false;
	}
	
	/**
	 * This method is for setting startButton
	 * @param switchButton boolean parameter
	 * @throws InterruptedException 
	 */
	public void powerButton(boolean switchButton) throws InterruptedException {
		this.switchButton = switchButton;
	}
	/**
	 * This method is for setting prepareCoffee
	 * @param required byte parameter
	 * @throws InterruptedException 
	 */
	public String prepareCoffee(byte required) throws InterruptedException {
		String message = "";
		byte minimumQuantity = 0;
		byte boilerQuantity = this.boiler.quantityChecker();
		boolean boilerContent = boilerSensor.isEmpty(boiler);
		if (boilerContent)
			return message = "Boiler is "+ boiler.contentType + " load WATER";
		boolean potContent = potSensor.isAboveHeater(pot);
		if (!potContent)
			return message = "Pot is not above";
		if (boilerQuantity < required)
			return message = "there are not enough "+ boiler.contentType;
		byte filterQuantity = this.coffeeFilter.quantityChecker();
		byte potQuantity = this.pot.quantityChecker();
		if (filterQuantity > minimumQuantity && boilerQuantity > minimumQuantity
				&& required + potQuantity <= pot.limit && switchButton) {
			executeMark(required);
			message = "Successful";
			return message;
		}
		else {
			heaterBoiler.switchHeater();
			heaterPot.switchHeater();
			this.light = false;
			boiler.switchPipe();
			presureValvue = false;
			message = "Something was wrong";
			return message;
		}
	}
	
	/**
	 * This method is for execute mark action
	 * @param state gets boolean value
	 * @return a boolean result e.g. true or false
	 * @throws InterruptedException 
	 */
	public void executeMark(byte required) throws InterruptedException {
		this.switchButton = true;
		heaterBoiler.switchHeater();
		boiler.switchPipe();
		Thread.sleep(10000);
		this.light = true;
		for (int item = 0; item < required; item++) {
			boiler.quantity--;
			coffeeFilter.addCups();
			coffeeFilter.mixCoffee();
			Thread.sleep(1000);
			pot.addCups();
		}
		heaterPot.switchHeater();
		this.presureValvue = true;
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
