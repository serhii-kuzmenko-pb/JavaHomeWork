package com.pb.kuzmenko.hw5;

public class Reader {

    private final String fio;
    private final int nomerBileta;
    private final String facultet;
    private final int dateOfBirth;
    private final long telefonNumber;

    public Reader(String fio, int nomerBileta, String facultet, int dateOfBirth, long telefonNumber) {
        this.fio = fio;
        this.nomerBileta = nomerBileta;
        this.facultet = facultet;
        this.dateOfBirth = dateOfBirth;
        this.telefonNumber = telefonNumber;
    }

    String getInfo() {
        return "[ Фамилия : " + fio + ", Номер билета : " + nomerBileta + ", Факультет : " + facultet + ", Дата рождения : " + dateOfBirth + ", Номер телефона: " + telefonNumber + " ]";
    }

    public void takeBook(int countOfBooks) {
        {
            System.out.println(fio + " взял : " + countOfBooks + " книги");
        }
    }

    public void takeBook(String... nazvanieKnig) {
        System.out.print(fio + " взял книги : ");
        for (String nazvanieKnigi : nazvanieKnig) {
            System.out.print(nazvanieKnigi + ",");
        }
        System.out.print('\b');
        System.out.println(" ");
    }

    public void takeBook(Book... nazvanieKnig) {
        System.out.print(fio + " взял книги : ");
        for (Book book : nazvanieKnig) {
            System.out.print(book.getInfo() + ",");
        }
        System.out.print('\b');
        System.out.println(" ");
    }

    public void returnBook(int countOfBooks) {
        System.out.println(fio + " вернул : " + countOfBooks + " книги");
    }

    public void returnBook(String... nazvanieKnig) {
        System.out.print(fio + " вернул книги: ");
        for (String nazvanieKnigi : nazvanieKnig) {
            System.out.print(nazvanieKnigi + ",");
        }
        System.out.print('\b');
        System.out.println(" ");
    }

    public void returnBook(Book... nazvanieKnig) {
        System.out.print(fio + " вернул книги: ");
        for (Book book : nazvanieKnig) {
            System.out.print(book.getInfo() + ",");
        }
        System.out.print('\b');
        System.out.println(" ");
    }

}
