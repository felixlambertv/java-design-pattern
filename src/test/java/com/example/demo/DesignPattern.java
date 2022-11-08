package com.example.demo;

import com.example.demo.behavioral.strategy.Context;
import com.example.demo.behavioral.strategy.OperationAdd;
import com.example.demo.creational.builder.Ballon;
import com.example.demo.creational.factory.Button;
import com.example.demo.creational.factory.ButtonFactory;
import com.example.demo.creational.singleton.Singleton;
import com.example.demo.structural.adapter.AdvanceMP3Player;
import com.example.demo.structural.adapter.MP3Player;
import com.example.demo.structural.adapter.MediaPlayer;
import com.example.demo.structural.adapter.MediaPlayerAdapter;
import com.example.demo.structural.facade.RestaurantFacade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DesignPattern {

    @Test
    void test_singleton(){
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        int hashSingleton1 = singleton1.hashCode();
        int hashSingleton2 = singleton2.hashCode();
        Assertions.assertEquals(hashSingleton1, hashSingleton2);
    }

    @Test
    void test_factory(){
        String input = "Enter";
        ButtonFactory buttonFactory = new ButtonFactory();
        Button button = buttonFactory.createButton(input);
        Assertions.assertEquals(input, button.click());
    }

    @Test
    void test_builder(){
        String color = "red";
        String shape = "oval";
        Ballon ballon = Ballon.Builder.newInstance().setColor(color).setShape(shape).build();

        Assertions.assertEquals(ballon.color, color);
        Assertions.assertEquals(ballon.shape, shape);
    }

    @Test
    void test_facade(){
        RestaurantFacade restaurantFacade = new RestaurantFacade();
        restaurantFacade.openRestaurant();
        restaurantFacade.orderFood();
    }

    @Test
    void test_adapter(){
        MediaPlayer player = new MP3Player();
        player.play("test.test");

        MediaPlayer player1 = new MediaPlayerAdapter(new AdvanceMP3Player());
        player1.play("test.test");
    }

    @Test
    void test_strategy(){
        Context context = new Context(new OperationAdd());
        Assertions.assertEquals(2, context.executeStrategy(1,1));
    }
}
