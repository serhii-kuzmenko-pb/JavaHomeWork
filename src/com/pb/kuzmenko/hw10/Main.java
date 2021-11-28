package com.pb.kuzmenko.hw10;

public class Main {
    public static void main(String[] args) {
        NumBox<Float> floatNumBox = new NumBox<>(2);
        NumBox<Float> floatNumBox1 = new NumBox<>(4);
        NumBox<Integer> integerNumBox = new NumBox<>(5);
        NumBox<Integer> integerNumBox1 = new NumBox<>(3);

        try {
            floatNumBox.add(0, 4.4F);
            floatNumBox.add(1, 2.2F);
            System.out.println("Среднее арифметическое, среди элементов массива : " + floatNumBox.average());
            System.out.println("Сумма всех элементов массива : " + floatNumBox.sum());
            System.out.println("Текущее количество элементов : " + floatNumBox.length());
            System.out.println("Максимальный элемент массива : " + floatNumBox.max());
            System.out.println("-----");
            floatNumBox1.add(0, 84.4F);
            floatNumBox1.add(1, 2.2F);
            floatNumBox1.add(3, 8.2F);
            floatNumBox1.add(4, 0.6F);
            System.out.println("Среднее арифметическое, среди элементов массива : " + floatNumBox1.average());
            System.out.println("Сумма всех элементов массива : " + floatNumBox1.sum());
            System.out.println("Текущее количество элементов : " + floatNumBox1.length());
            System.out.println("Максимальный элемент массива : " + floatNumBox1.max());
            System.out.println("-----");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            integerNumBox.add(0, 1);
            integerNumBox.add(1, 3);
            integerNumBox.add(3, 6);
            integerNumBox.add(4, 8);
            System.out.println("Среднее арифметическое, среди элементов массива : " + integerNumBox.average());
            System.out.println("Сумма всех элементов массива : " + integerNumBox.sum());
            System.out.println("Текущее количество элементов : " + integerNumBox.length());
            System.out.println("Третий элемент : " + integerNumBox.get(2));
            System.out.println("Максимальный элемент массива : " + integerNumBox.max());
            System.out.println("-----");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            integerNumBox1.add(0, 1);
            integerNumBox1.add(1, 3);
            integerNumBox1.add(3, 6);
            integerNumBox1.add(4, 8);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
