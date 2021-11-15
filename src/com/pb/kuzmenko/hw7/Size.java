package com.pb.kuzmenko.hw7;

public enum Size {
    XXS("Description", 32),
    XS("Description", 34),
    S("Description", 36),
    M("Description", 38),
    L("Description", 40);

    Size(String description, int euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }

    private String description;
    private int euroSize;

    void getEuroSize(Size size) {
        switch (size) {
            case XXS:
                System.out.println("32");
                break;
            case XS:
                System.out.println("34");
                break;
            case S:
                System.out.println("36");
                break;
            case M:
                System.out.println("38");
                break;
            case L:
                System.out.println("40");
                break;
            default:
                System.out.println("Размер отсутствует");
        }
    }

    void getDescription(Size size) {
        if (size == XXS) {
            System.out.println("Детский размер");
        } else {
            System.out.println("Взрослый размер");
        }

    }


}
