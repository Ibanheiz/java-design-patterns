package com.ibanheiz;

public abstract class Veiculo {

	private Motor motor;
	
	public void dirigir() {
		motor.darPartida();
		acelerar();
	}
	
	public abstract void acelerar();

	/**
	 * @param motor the motor to set
	 */
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
}
