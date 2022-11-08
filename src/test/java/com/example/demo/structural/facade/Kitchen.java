package com.example.demo.structural.facade;

public class Kitchen {
    public void cookFood(){
        System.out.println("Cook the food");
    }

    public void signalReady(){
        System.out.println("Signal food is ready");
    }

    public void cleanKitchen() {
        System.out.println("Clean kitchen");
    }
}
