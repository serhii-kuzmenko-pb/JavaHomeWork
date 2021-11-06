package com.pb.kuzmenko.hw6;

public class VetСlinic {
    public static void main(String[] args) throws Exception {

        Cat animal1 = new Cat("Nafanya");
        Dog animal2 = new Dog("Barbos");
        Horse animal3 = new Horse("Sivka");

        Animal[] animals = new Animal[]{animal1, animal2, animal3};

        for (Animal a : animals) {
            System.out.println("К ветеринару пошел : " + a.getName());
            use(a);
            System.out.println("++++++++++");
        }

//        System.out.println("++++++++++");
//        for (Animal a : animals) {
//            a.eat();
//        }
//        System.out.println("++++++++++");
//        for (Animal a : animals) {
//            a.makeNoise();
//        }
//        System.out.println("++++++++++");
        System.out.println("equals 1 3: " + animal1.equals(animal3));

    }

    public static void use(Animal animal) throws Exception {
        new Veterinarian(animal).treatAnimal(animal);

    }

}
