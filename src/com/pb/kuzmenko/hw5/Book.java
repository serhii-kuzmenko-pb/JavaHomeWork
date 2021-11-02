package com.pb.kuzmenko.hw5;

public class Book {

    private final String nazvanieKnigi;
    private final String avtorKnigi;
    private final int year;

    public Book(String nazvanieKnigi, String avtorKnigi, int year) {
        this.nazvanieKnigi = nazvanieKnigi;
        this.avtorKnigi = avtorKnigi;
        this.year = year;
    }

    public String getNazvanieKnigi() {
        return nazvanieKnigi;
    }

    String getInfo() {
        return nazvanieKnigi + " (" + avtorKnigi + year + ")";
    }

}
