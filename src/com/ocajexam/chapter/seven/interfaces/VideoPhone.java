package com.ocajexam.chapter.seven.interfaces;

public class VideoPhone implements Phone, VideoPlayer {

	private boolean callInProgress;

	@Override
	public void start() {
		/* Começa a decodificar e a reproduzir o vídeo */
	}

	@Override
	public void stop() {
		/* Interrompe e decodificação e a reprodução de vídeo */
	}

	@Override
	public void dialNumber(int number) {
		/* Disca o número via rede */
	}

	@Override
	public boolean isCallInProgress() {
		return callInProgress;
	}
}