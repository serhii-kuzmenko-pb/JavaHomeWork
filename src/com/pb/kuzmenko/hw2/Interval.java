package com.pb.kuzmenko.hw2;

import java.util.Scanner;

public class Interval {
  public static void main(String[] args) {

    int numberFromConsole;
    String interval1 = "[0 - 14]";
    String interval2 = "[15 - 35]";
    String interval3 = "[36 - 50]";
    String interval4 = "[51 - 100]";

    Scanner typeFromConsole = new Scanner(System.in);
    System.out.println("Введите число от 0 до 100 :");
    numberFromConsole = typeFromConsole.nextInt();

    if ((numberFromConsole >= 0) && (numberFromConsole <= 14)) {
      System.out.println("Указанное число " + numberFromConsole + " находится в интервале " + interval1);
    } else if ((numberFromConsole >= 15) && (numberFromConsole <= 35)) {
      System.out.println("Указанное число " + numberFromConsole + " находится в интервале " + interval2);
    } else if ((numberFromConsole >= 36) && (numberFromConsole <= 50)) {
      System.out.println("Указанное число " + numberFromConsole + " находится в интервале " + interval3);
    } else if ((numberFromConsole >= 51) && (numberFromConsole <= 100)) {
      System.out.println("Указанное число " + numberFromConsole + " находится в интервале " + interval4);
    } else {
      System.out.println("Указанное число " + numberFromConsole + " вне допустимого в условии интервала ");
    }
  }
}

