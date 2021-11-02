package com.pb.kuzmenko.hw5;

public class Library {

    public static void main(String[] args) {

        Book book1 = new Book("Приключения", "Иванов И. И.", 2000);
        Book book2 = new Book("Словарь", "Сидоров А. В.", 1980);
        Book book3 = new Book("Энциклопедия", "Гусев К. В.", 2010);

        Book[] bookArray = new Book[]{book1, book2, book3};

        System.out.println(bookArray[0].getInfo());
        System.out.println(bookArray[1].getInfo());
        System.out.println(bookArray[2].getInfo());

        Reader reader1 = new Reader("Петров В. В.", 1, "Филология", 1988, 3809777777777L);
        Reader reader2 = new Reader("Ветров Н.Н.", 2, "Социология", 1989, 3809888888888L);
        Reader reader3 = new Reader("Ткач Г.Г.", 3, "Природоведенье", 1990, 3809999999999L);

        Reader[] readerArray = new Reader[]{reader1, reader2, reader3};

        System.out.println(readerArray[0].getInfo());
        System.out.println(readerArray[1].getInfo());
        System.out.println(readerArray[2].getInfo());

        readerArray[0].takeBook(3);
        readerArray[0].takeBook(book1.getNazvanieKnigi(), book2.getNazvanieKnigi(), book3.getNazvanieKnigi());
        readerArray[0].takeBook(bookArray[2], bookArray[0], bookArray[1]);

        readerArray[0].returnBook(2);
        readerArray[0].returnBook(book1.getNazvanieKnigi(), book2.getNazvanieKnigi());
        readerArray[0].returnBook(bookArray[0], bookArray[1]);

    }
}
