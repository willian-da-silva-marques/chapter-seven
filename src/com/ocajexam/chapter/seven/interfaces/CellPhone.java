package com.ocajexam.chapter.seven.interfaces;

public class CellPhone implements Phone {

	private boolean callInProgress;

	@Override
	public void dialNumber(int number) {
		/* Disca o n�mero via rede de celular */
	}

	@Override
	public boolean isCallInProgress() {
		return callInProgress;
	}
}