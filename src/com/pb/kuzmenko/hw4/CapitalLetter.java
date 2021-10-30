package com.pb.kuzmenko.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        System.out.println("Напишите, пожалуйста, произвольное предложение без привязки к регистру :");
        Scanner inputFromKeyboard = new Scanner(System.in);
        String text = inputFromKeyboard.nextLine();

        wordsToUpperCase(text);
    }

    public static void wordsToUpperCase(String input) {
        String output = "";
        output = output + input.substring(0, 1).toUpperCase();
        for (int i = 1; i < input.length(); i++) {
            if (" ".equals(input.substring(i - 1, i)))
                output = output + input.substring(i, i + 1).toUpperCase();
            else
                output = output + input.substring(i, i + 1);
        }
        System.out.println(output);
    }

}





