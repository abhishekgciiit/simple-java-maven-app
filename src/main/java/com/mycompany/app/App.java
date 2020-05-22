package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
        String user = "random";
        String pass = "user";
        String query = "SELECT * FROM users WHERE user = '" + user + "' AND pass = '" + pass + "'";
    }

    private final String getMessage() {
        return message;
    }

}
