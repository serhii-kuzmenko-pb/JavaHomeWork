package com.pb.kuzmenko.hw6;

public class Animal {
    public void setFood(String food) {
        this.food = food;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private String food = "EDA";
    private String location = "MESTO";

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void makeNoise() {
        System.out.println("Я " + name + ", я умею говорить");
    }

    public void eat() {
        System.out.println(name + " кушает");
    }

    public void sleep() {
        System.out.println(name + " спит");
    }


}