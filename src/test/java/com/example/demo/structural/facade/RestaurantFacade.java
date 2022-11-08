package com.example.demo.structural.facade;

public class RestaurantFacade {
    private final Waiter waiter = new Waiter();
    private final Kitchen kitchen = new Kitchen();

    public void orderFood(){
        waiter.takeOrder();
        waiter.takeOrderToCook();
        kitchen.cookFood();
        kitchen.signalReady();
        waiter.serveCustomer();
    }

    public void openRestaurant(){
        waiter.cleanRoom();
        kitchen.cleanKitchen();
    }
}
