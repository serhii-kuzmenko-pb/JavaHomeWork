package com.pb.kuzmenko.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {

        try {

            Auth auth = new Auth();
            System.out.println("Зарегистрируйтесь");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите логин");
            auth.setLogin(scanner.nextLine());
            System.out.println("Введите пароль");
            auth.setPassword(scanner.nextLine());
            System.out.println("Подтвердите пароль");
            String confirmPassword = scanner.nextLine();
            Auth.signUp(auth.getLogin(), auth.getPassword(), confirmPassword);
            System.out.println("Спасибо за регистрацию " + auth.getLogin());
            System.out.println("Теперь войдите на сайт");
            System.out.println("Введите логин");
            auth.setLogin(scanner.nextLine());
            System.out.println("Введите пароль");
            auth.setPassword(scanner.nextLine());
            Auth.signIn(auth.getLogin(), auth.getPassword());
        } catch (WrongLoginException e) {
            System.out.println("Проблема со входом на сайт");
            e.printStackTrace();
        } catch (WrongPasswordException e) {
            System.out.println("Неправильный пароль");
            e.printStackTrace();
        } finally {
            System.out.println("Спасибо за визит");
        }

    }
}
