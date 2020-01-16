package com.ocajexam.chapter.seven.interfaces;

public class VideoPhone implements Phone, VideoPlayer {

	private boolean callInProgress;

	@Override
	public void start() {
		/* Come�a a decodificar e a reproduzir o v�deo */
	}

	@Override
	public void stop() {
		/* Interrompe e decodifica��o e a reprodu��o de v�deo */
	}

	@Override
	public void dialNumber(int number) {
		/* Disca o n�mero via rede */
	}

	@Override
	public boolean isCallInProgress() {
		return callInProgress;
	}
}