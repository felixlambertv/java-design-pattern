package com.example.demo.creational.factory;

public class EnterButton implements Button{
    @Override
    public String click() {
        return "Enter";
    }

    @Override
    public String hover() {
        return "Enter";
    }
}
