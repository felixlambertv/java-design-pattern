package com.example.demo.creational.factory;

import org.junit.jupiter.api.Assertions;

public class ButtonFactory {
    public Button createButton(String type) {
        Button button;
        if(type.equals("Enter")){
            button = new EnterButton();
        } else {
            button = new ExitButton();
        }
        return button;
    }
}
