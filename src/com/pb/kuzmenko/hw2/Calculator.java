package com.pb.kuzmenko.hw2;

import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {

    int operand1;
    int operand2;
    String sign;
    int result = 0;
    float resultFloat = 0;
    Scanner vvod = new Scanner(System.in);

    System.out.println("Внимание! Калькулятор может только складывать, отнимать, умножать и делить целые числа.");
    System.out.println("Введите первое число");
    operand1 = vvod.nextInt();
    System.out.println("Введите второе число");
    operand2 = vvod.nextInt();
    System.out.println("Введите один из предложенных знаков : '+' , '-' , '*' , '/'");
    sign = vvod.next();

    switch (sign) {
      case "+":
        result = operand1 + operand2;
        System.out.println("Результат выполнения операции сложения:");
        break;
      case "-":
        result = operand1 - operand2;
        System.out.println("Результат выполнения операции вычитания:");
        break;
      case "*":
        result = operand1 * operand2;
        System.out.println("Результат выполнения операции умножения:");
        break;
      case "/":
        if (operand2 == 0) {
          System.out.println("Нельзя делить на 0.");
        } else {
          resultFloat = (float) operand1 / (float) operand2;
          System.out.println("Результат выполнения операции деления:");
        }
        break;
      default:
        System.out.println("Введен недопустимый знак");
    }

    if (operand2 == 0 && sign.equals("/")) {
      System.out.println("Выберите другую арифметическую операцию или делитель.");
    } else if (sign.equals("/")) {
      System.out.println(operand1 + " " + sign + " " + operand2 + " = " + resultFloat);
    } else {
      System.out.println(operand1 + " " + sign + " " + operand2 + " = " + result);
    }
  }


}
