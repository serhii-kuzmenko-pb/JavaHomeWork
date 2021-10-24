package com.pb.kuzmenko.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[10];

        System.out.println("Просьба ввести десять целых цифр для формирования массива");
        int i = 0;
        Scanner numberFromKeyboard = new Scanner(System.in);

        for (int counter = 1; counter < 11; counter++) {
            System.out.println("Введите " + counter + "-е число :");
            int arr = numberFromKeyboard.nextInt();
            array[i] = arr;
            i++;
        }
        System.out.println("Из ваших цифр был создан отличный одномерный массив размерностью 10 элементов :");

        //        Сокращенная запись
        //        for (int j : array) {
        //            System.out.print(j + " ");
        //        }

        // печать введенного массива
        System.out.print("[ ");
        for (int n = 0; n < array.length; n++) {
            System.out.print(array[n] + " ");
        }
        System.out.println("]");

        int sum = 0; //Сумма чисел массива
        //    запись суммы без цикла
        //    int sum = array[0] + array[1] + array[2] + array[2] + array[4] + array[5] + array[6] + array[7] + array[8] + array[9];
        int k = 0; //Количество положительных чисел массива
        for (int m = 0; m < array.length; m++) {
            sum = sum + array[m];
            if (array[m] > 0) {
                k++;
            }
        }
        System.out.println();
        System.out.println("Сумма чисел массива: " + sum);
        System.out.println();
        System.out.println("Количество положительных чисел массива: " + k);

        // сортировка пузырьком
        bubbleSort(array);
        System.out.println();
        System.out.println("Сортировка массива от меньшего к большему по алгоритму сортировки пузырьком :");
        System.out.print("[ ");
        for (int d = 0; d < array.length; d++) {
            System.out.print(array[d] + " ");
        }
        System.out.println("]");

    }

    static void bubbleSort(int[] array) {
        int n = array.length;
        int temporary = 0;
        for (int s = 0; s < n; s++) {
            for (int j = 1; j < (n - s); j++) {
                if (array[j - 1] > array[j]) {
                    //сортировка элементов
                    temporary = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temporary;
                }
            }
        }

    }
}
