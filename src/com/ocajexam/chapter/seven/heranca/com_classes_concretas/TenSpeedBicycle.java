package com.ocajexam.chapter.seven.heranca.com_classes_concretas;

public class TenSpeedBicycle extends Bicycle {

	private float gearRatio = 2f;
	private float wheelRPM;
	
	public void setGearRatio(float gearRatio) {
		this.gearRatio = gearRatio;
	}
	
	public void pedalRPM(float pedalRPM) {
		this.wheelRPM = pedalRPM * this.gearRatio;
	}

	@Override
	public float getWheelRPM() {
		return wheelRPM;
	}
}