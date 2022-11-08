package com.example.demo.creational.singleton;

public class Singleton {
    private static Singleton instance = null;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
//        instance = new Singleton();
        return instance;
    }
}
