package com.skillstrom.general;

public class Cat extends Animals {

        public Cat(String name, String type, String color, String voice) {
            super(name, type, color, voice);
            System.out.println("********CAT********\n" );
        }

        @Override
        public void speak() {
            System.out.println("MEOW MEOW MEOW");
        }

        @Override
        public void eat() {
            System.out.println("The cat is eating cat food..");
        }
        public void scratch() {
            System.out.println("The cat is scratching furniture..");
        }
}
