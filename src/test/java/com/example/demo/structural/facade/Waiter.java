package com.example.demo.structural.facade;

public class Waiter {
    public void takeOrder(){
        System.out.println("Take order");
    }

    public void takeOrderToCook(){
        System.out.println("Send order to cook");
    }

    public void serveCustomer(){
        System.out.println("Server food");
    }

    public void cleanRoom(){
        System.out.println("Clean room");
    }
}
