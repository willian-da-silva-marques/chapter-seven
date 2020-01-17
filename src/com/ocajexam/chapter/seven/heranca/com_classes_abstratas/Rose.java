package com.ocajexam.chapter.seven.heranca.com_classes_abstratas;

public class Rose extends Plant {

	private static final int AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON = 3;

	private void grow() {
		int currentHeight = getHeight();
		setHeight(currentHeight + AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON);
	}

	@Override
	public void doSpring() {
		this.grow();
		addYearToAge();
		System.out.println("Spring: The rose is starting to grow leaves and new branches");
		System.out.println("\tCurrent Age: " + getAge() + " " + " Current Height: " + getHeight());
	}

	@Override
	public void doSummer() {
		this.grow();
		System.out.println("Summer: The rose is continuing to grow");
		System.out.println("\tCurrent Age: " + getAge() + " " + " Current Height: " + getHeight());
	}

	@Override
	public void doFall() {
		this.grow();
		System.out.println("Fall: The rose is continuing to grow");
		System.out.println("\tCurrent Age: " + getAge() + " " + " Current Height: " + getHeight());
	}

	@Override
	public void doWinter() {
		System.out.println("Fall: The rose has stopped growing and is losing its leaves");
		System.out.println("\tCurrent Age: " + getAge() + " " + " Current Height: " + getHeight());
	}

}
