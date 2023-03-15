package com.skillstrom.general;

public class Lion extends Animals {


    public Lion(String name, String type, String color, String voice) {
        super(name, type, color, voice);
    }

    @Override
    public void speak() {
        System.out.println("********Lion********\n"  +
                "The Lion is Roaring...ROAR ROAR ROAR");
    }

    @Override
    public void eat() {
        System.out.println("The lion is eating a zebra..");
    }

    public void running() {
        System.out.println("The lion is running ...");
    }

    public void hunt() {
        System.out.println("The lion is hunting..");
    }
}
