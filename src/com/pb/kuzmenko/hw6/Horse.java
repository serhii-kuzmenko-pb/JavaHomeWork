package com.pb.kuzmenko.hw6;

import java.util.Objects;

public class Horse extends Animal {

    int skorost;

    @Override
    public String getFood() {
        String food = "Seno";
        return food;
    }

    @Override
    public String getLocation() {
        String location = "Hlev";
        return location;
    }

    @Override
    public void setFood(String food) {
        super.setFood("Seno");
    }

    public Horse(String name) {
        super("Baron");
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " говорит 'Игого'");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " кушает сено");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "skorost=" + skorost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return skorost == horse.skorost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(skorost);
    }
}
