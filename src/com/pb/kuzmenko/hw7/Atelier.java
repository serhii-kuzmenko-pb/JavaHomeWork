package com.pb.kuzmenko.hw7;

public class Atelier {
    public static void main(String[] args) {

        Pants pants = new Pants(Size.XS, 450, "Blue");
        Tshirt tshirt = new Tshirt(Size.L, 50, "White");
        Skirt skirt = new Skirt(Size.S, 500, "Green");
        Tie tie = new Tie(Size.XXS, 15, "Yellow");

        Clothes[] mass = new Clothes[]{pants, tshirt, skirt, tie};

        dressMan(mass);
        System.out.println("+++++++++++++++++");
        dressWomMan(mass);
    }

    public static void dressMan(Clothes[] clothes1) {
        System.out.println("Мужчина надевает :");
        for (Clothes odezhda : clothes1) {
            if (odezhda instanceof ManClothes) {
                ManClothes print = (ManClothes) odezhda;
                print.dressMan();
            }
        }

    }

    public static void dressWomMan(Clothes[] clothes2) {
        System.out.println("Женщина надевает :");
        for (Clothes odezhda : clothes2) {
            if (odezhda instanceof WomenClothes) {
                WomenClothes print = (WomenClothes) odezhda;
                print.dressWoman();
            }
        }

    }
}
