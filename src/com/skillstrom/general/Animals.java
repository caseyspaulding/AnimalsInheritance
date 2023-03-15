package com.skillstrom.general;

public class Animals {
    private String name;
    private String type;
    private String color;
    private String voice;

    public Animals(){}

    public Animals(String name, String type, String color, String voice) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.voice = voice;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getVoice() {
        return voice;
    }
    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void speak() {
        System.out.println("Animals Speaking... ");
    }

    public void eat() {
        System.out.println("Animals Eating....");
    }

    public void sleep() {
        System.out.println("Animals Sleeping..");
    }









}
