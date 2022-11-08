package com.example.demo.structural.adapter;

public class MediaPlayerAdapter implements MediaPlayer {
    private final AdvanceMediaPlayer advanceMediaPlayer;

    public MediaPlayerAdapter(AdvanceMediaPlayer advanceMediaPlayer){
        this.advanceMediaPlayer = advanceMediaPlayer;
    }

    @Override
    public void play(String fileName) {
        System.out.println(("Using Advance Media Player - "));
        advanceMediaPlayer.playAdvance(fileName);
    }
}
