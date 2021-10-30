package com.pb.kuzmenko.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        System.out.println("Программа определяет, является ли одна строка анаграммой другой строки.");
        Scanner inputFromKeyboard = new Scanner(System.in);
        System.out.println("Напишите, пожалуйста, слово/словосочетание или предложение:");
        String text1 = inputFromKeyboard.nextLine();
        System.out.println("Напишите, пожалуйста, еще что-то для сравнения:");
        String text2 = inputFromKeyboard.nextLine();
        System.out.println("");

        proverkaAnagrams(text1, text2);
    }

    public static void proverkaAnagrams(String string1, String string2) {
        String sentence1 = string1.replaceAll("\\s", "");
        String sentence2 = string2.replaceAll("\\s", "");
        boolean sovpadenie = true;
        if (sentence1.length() != sentence2.length()) {
            sovpadenie = false;
        } else {
            char[] ArrayS1 = sentence1.toLowerCase().toCharArray();
            char[] ArrayS2 = sentence2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            sovpadenie = Arrays.equals(ArrayS1, ArrayS2);
        }
        if (sovpadenie) {
            System.out.println("\"" + string1 + "\"" + " и " + "\"" + string2 + "\"" + " - являются анаграммами");
        } else {
            System.out.println("\"" + string1 + "\"" + " и " + "\"" + string2 + "\"" + " - НЕ являются анаграммами");
        }

    }
}