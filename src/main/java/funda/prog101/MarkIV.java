package main.java.funda.prog101;

public class MarkIV {
	private boolean switchButton;
	private boolean light;
	/**
	 * This is MarkIV constructor
	 * @param startButton sets an boolean date for starting markIv
	 * @param light sets an boolean date to light
	 */
	public MarkIV(boolean switchButton) {
		this.switchButton = switchButton;
		this.light = switchButton;
	}
	
	/**
	 * This method is for setting startButton
	 * @param start boolean parameter;
	 */
	public void powerButton(boolean switchButton) {
		this.switchButton = switchButton;
	}

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
	
	public boolean verifyStateMark(boolean state) {
		return switchButton == state;
	}
}
