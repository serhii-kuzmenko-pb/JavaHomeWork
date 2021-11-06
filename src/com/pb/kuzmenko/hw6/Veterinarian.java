package com.pb.kuzmenko.hw6;

import java.lang.reflect.Constructor;

public class Veterinarian {

    private String name;

    public Veterinarian(Animal animal) {
        this.name = animal.getName();
    }

    public void treatAnimal(Animal animal) throws Exception {
        Animal an = new Animal("NEWANIMAL");
        Class clazz = an.getClass();
        Class animalClazz = Class.forName("com.pb.kuzmenko.hw6.Animal");

        Constructor constr = animalClazz.getConstructor(new Class[]{String.class});
        Object obj = constr.newInstance(animal.getName());
        if (obj instanceof Animal) {
            ((Animal) obj).sleep();
        }

        System.out.println("food : " + animal.getFood());
        System.out.println("location : " + animal.getLocation());


    }
}
