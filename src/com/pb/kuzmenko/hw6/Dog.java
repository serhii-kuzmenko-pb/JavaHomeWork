package com.pb.kuzmenko.hw6;

import java.util.Objects;

public class Dog extends Animal {

    int obonyanie;

    @Override
    public String getFood() {
        String food = "Pedigree";
        return food;
    }

    @Override
    public String getLocation() {
        String location = "Dvor";
        return location;
    }

    @Override
    public void setFood(String food) {
        super.setFood("Pedigri");
    }

    public Dog(String name) {
        super("Gerda");
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " говорит 'Гав'");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " кушает косточку");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "obonyanie=" + obonyanie +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return obonyanie == dog.obonyanie;
    }

    @Override
    public int hashCode() {
        return Objects.hash(obonyanie);
    }
}
