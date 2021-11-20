package com.pb.kuzmenko.hw8;

import java.util.Objects;

public class Auth {
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    static String login1;
    static String password1;

    public static void signUp(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {

        String pattern1 = "[a-zA-Z0-9] {5,20}";
        String pattern2 = "[a-zA-Z_0-9] {5,}";

        if (!login.matches(pattern1)) {
            throw new WrongLoginException("Логин должен быть от 5 до 20 символов и содержать только латинские буквы и цифры");
        } else if (!password.matches(pattern2)) {
            throw new WrongPasswordException("Длинна более 5, только латинские буквы и цифры и знак подчеркивания");
        } else if (!Objects.equals(password, confirmPassword)) {
            throw new WrongPasswordException("НЕправильно подтверждаете пароль");
        } else {
            login1 = login;
            password1 = password;
            System.out.println("Регистрация успешна");
        }
    }

    static void signIn(String login, String password) throws WrongLoginException {
        if (!(login.equals(login1))) {
            throw new WrongLoginException("Не правильно введен логин");
        } else if (!(password.equals(password1))) {
            throw new WrongLoginException("Не правильно введен пароль");
        } else {
            System.out.println("Поздравляем! Вы вошли на сайт!");
        }

    }


}
