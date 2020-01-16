package com.ocajexam.chapter.seven.heranca.com_classes_concretas;

/**
 * @since 16/01/2020
 * @author willian
 * 
 *         Exemplo de harança com classes concretas
 */
public class Bicycle {

	private float wheelRPM;
	private int degreeOfTurn;

	public void pedalRPM(float pedalRPM) {
		float gearRatio = 2f;
		this.wheelRPM = pedalRPM * gearRatio;
	}

	public void setDegreeOfTurn(int degreeOfTurn) {
		this.degreeOfTurn = degreeOfTurn;
	}

	public int getDegreeOfTurn() {
		return degreeOfTurn;
	}

	public float getWheelRPM() {
		return wheelRPM;
	}
}