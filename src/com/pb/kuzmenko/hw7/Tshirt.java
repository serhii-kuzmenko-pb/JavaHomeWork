package com.pb.kuzmenko.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {

    public Tshirt(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Tshirt " + this.getColor() + " " + this.getSize() + " " + this.getCost());
    }

    @Override
    public void dressWoman() {
        System.out.println("Tshirt " + this.getColor() + " " + this.getSize() + " " + this.getCost());
    }
}
