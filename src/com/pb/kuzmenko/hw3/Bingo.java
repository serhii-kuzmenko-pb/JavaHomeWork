package com.pb.kuzmenko.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {

        int numberFromUser;

        Random random = new Random();
        int x = random.nextInt(101);
        //System.out.println("Произвольное число x : " + x);
        System.out.println("Загадано целое число от 0 до 100. Попробуйте отгадать.");

        Scanner fromKeyboard = new Scanner(System.in);
        System.out.println("Если вам надоест или решите просто прекратить игру - напишите число, которое не входит в загаданный по условию диапазон");
        System.out.println("Введите число:");

        int counter = 0;
        do {
            counter++;
            //System.out.println("Попытка №" + counter + " :");

            numberFromUser = fromKeyboard.nextInt();

            if ((numberFromUser < 0) | (numberFromUser > 100)) {
                System.out.println("Спасибо за игру. До встречи.");
                break;
            }
            if (numberFromUser > x) {
                System.out.println("Загаданное число - меньше. Попробуйте еще раз.");
            } else if (numberFromUser < x) {
                System.out.println("Загаданное число - больше. Попробуйте еще раз.");
            } else {
                System.out.println("Поздравляем!!! Вы угадали число с " + counter + "-го раза.");
                break;
            }


        }
        while (counter < 100);


    }
}
