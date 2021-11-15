package com.pb.kuzmenko.hw7;

public class Tie extends Clothes implements ManClothes {
    public Tie(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Tie " + this.getColor() + " " + this.getSize() + " " + this.getCost());
    }
}
