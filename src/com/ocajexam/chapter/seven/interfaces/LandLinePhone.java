package com.ocajexam.chapter.seven.interfaces;

public class LandLinePhone implements Phone {

	private boolean callInProgress;

	@Override
	public void dialNumber(int number) {
		/* Disca o n�mero via rede com fio */
	}

	@Override
	public boolean isCallInProgress() {
		return callInProgress;
	}
}