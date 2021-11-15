package com.pb.kuzmenko.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes {

    public Pants(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Pants " + this.getColor() + " " + this.getSize() + " " + this.getCost());
    }

    @Override
    public void dressWoman() {
        System.out.println("Pants " + this.getColor() + " " + this.getSize() + " " + this.getCost());
    }
}
