package com.pb.kuzmenko.hw6;

import java.util.Objects;

public class Cat extends Animal {
    int zrenie;

    @Override
    public String getFood() {
        String food = "Milk";
        return food;
    }

    @Override
    public String getLocation() {
        String location = "Kvartira";
        return location;
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " говорит 'Мяу'");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " кушает рыбку");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "zrenie=" + zrenie +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return zrenie == cat.zrenie;
    }

    @Override
    public int hashCode() {
        return Objects.hash(zrenie);
    }
}
