package com.pb.kuzmenko.hw7;

public class Skirt extends Clothes implements WomenClothes {
    public Skirt(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Skirt " + this.getColor() + " " + this.getSize() + " " + this.getCost());
    }
}
