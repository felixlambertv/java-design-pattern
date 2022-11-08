package com.example.demo.structural.adapter;

public class MP3Player implements MediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing MP3 File " + fileName);
    }
}
