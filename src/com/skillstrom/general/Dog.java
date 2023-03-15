package com.skillstrom.general;

public class Dog extends Animals {

    public Dog(String name, String type, String color, String voice) {
        super(name, type, color, voice);
    }

    @Override
    public void speak() {
        System.out.println("********DOG********\n"  +
                "The Dog is Barking!! BARK BARK BARK");
    }

    @Override
    public void eat() {
        System.out.println("The dog is chowing down on dog food..");
    }


    public void fetch() {
        System.out.println("The dog is fetching..");
    }
}