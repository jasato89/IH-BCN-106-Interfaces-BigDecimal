package com.ironhack;

public class iOSPlayer implements Playable{

    private final double MAX_VOLUME = 200;
    private double volume;

    public iOSPlayer(double volume) {
        this.volume = volume;
    }

    public void play() {
        System.out.println("Playing on iOS");

    }

    public void pause() {
        System.out.println("Pausing on iOS");

    }

    public void mute() {
        System.out.println("Muting on iOS");

    }

    public void increaseVolume(double volume) {
        this.volume = this.volume + volume > MAX_VOLUME ? MAX_VOLUME : this.volume + volume;

        System.out.println("Current volume = " + this.volume);

    }
}
