package com.ocajexam.chapter.seven.heranca.com_classes_abstratas;

public abstract class Plant {

	private int age;
	private int height;

	public int getAge() {
		return age;
	}

	public void addYearToAge() {
		this.age++;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public abstract void doSpring();

	public abstract void doSummer();

	public abstract void doFall();

	public abstract void doWinter();
}