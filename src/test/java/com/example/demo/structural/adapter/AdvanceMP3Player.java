package com.example.demo.structural.adapter;

public class AdvanceMP3Player implements AdvanceMediaPlayer{
    @Override
    public void playAdvance(String filename) {
        System.out.println("Playing advance MP3 file " + filename);
    }
}
