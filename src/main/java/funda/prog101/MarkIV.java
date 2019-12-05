package main.java.funda.prog101;

public class MarkIV {
	private boolean switchButton;
	private boolean light;
	
	/**
	 * This is MarkIV constructor
	 */
	public MarkIV() {
		this.switchButton = false;
		this.light = false;
	}
	
	/**
	 * This method is for setting startButton
	 * @param switchButton boolean parameter;
	 */
	public void powerButton(boolean switchButton) {
		this.switchButton = switchButton;
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
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MarkIV other = (MarkIV) obj;
		if (light != other.light)
			return false;
		if (switchButton != other.switchButton)
			return false;
		return true;
	}
}
