package com.ocajexam.chapter.seven.abstrata;

public abstract class MusicPlayer {

	public abstract void play();

	public abstract void stop();

	public void changeVolume(int volumeLevel) {
		/* Configura o volume com volumeLevel */
	}
}