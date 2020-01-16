package com.ocajexam.chapter.seven.heranca;

public class Horse3 extends Animal {

	@Override
	public void rest() {
		/* Fica de pé antes de descansar */
		super.rest();
	}
	
	public void neigh() {
		/* Relincha */
	}
}
