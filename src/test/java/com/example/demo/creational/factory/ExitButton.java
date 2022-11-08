package com.example.demo.creational.factory;

public class ExitButton implements Button {
    @Override
    public String click() {
        return "Exit";
    }

    @Override
    public String hover() {
        return "Hover";
    }
}
