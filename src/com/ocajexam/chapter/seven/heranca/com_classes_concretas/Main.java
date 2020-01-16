package com.ocajexam.chapter.seven.heranca.com_classes_concretas;

public class Main {

	public static void main(String[] args) {

		System.out.println("Starting...");
		System.out.println("Creating a bicycle...");
		
		Bicycle bicycle = new Bicycle();
		bicycle.setDegreeOfTurn(0);
		bicycle.pedalRPM(50);

		System.out.println("Turning: " + bicycle.getDegreeOfTurn());
		System.out.println("Wheel RPM: " + bicycle.getWheelRPM());
		System.out.println("Creating a 10 speed bicycle...");

		TenSpeedBicycle tenSpeedBicycle = new TenSpeedBicycle();
		tenSpeedBicycle.setDegreeOfTurn(10);
		tenSpeedBicycle.setGearRatio(3f);
		tenSpeedBicycle.pedalRPM(40);

		System.out.println("Turning: " + tenSpeedBicycle.getDegreeOfTurn());
		System.out.println("Wheel RPM: " + tenSpeedBicycle.getWheelRPM());
	}
}