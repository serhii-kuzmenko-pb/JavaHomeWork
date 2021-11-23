package com.pb.kuzmenko.hw9;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class FileNumbers {
    public static void main(String[] args) throws IOException {

        createNumbersFile();
        createOddNumbersFile();
    }

    public static void createNumbersFile() {
        try (final FileWriter writer = new FileWriter("files/hw9-output-text.txt", false)) {
            int[][] array = new int[10][10];
            final Random random = new Random();
            for (int i = 0; i < array.length; ++i) {
                for (int k = 0; k < array.length; ++k) {
                    array[i][k] = random.nextInt((99 - 1) + 1) + 1;
                    System.out.print(array[i][k] + " ");
                    writer.write(array[i][k] + " ");

                }
                writer.write("\n");
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }

    public static void createOddNumbersFile() {
        try (Scanner in = new Scanner(new File("files/hw9-output-text.txt"))) {
            PrintWriter pw = new PrintWriter(new File("files/hw9-odd-numbers.txt"));
            System.out.println("Вывод чисел , с учетом замены целых четных чисел на '0':");
            while (in.hasNextLine()) {
                Scanner line = new Scanner(in.nextLine());
                while (line.hasNextInt()) {
                    int ch = line.nextInt();
                    if (ch % 2 == 0) {
                        System.out.print("0");
                        ch = 0;
                    } else
                        System.out.println(ch + " ");
                    pw.print(ch + " ");
                }
                line.close();
                pw.println();

            }
            System.out.println();
            pw.close();
        } catch (IOException ioException) {
            System.out.println("Файл не записан" + ioException);
        }
    }


}
