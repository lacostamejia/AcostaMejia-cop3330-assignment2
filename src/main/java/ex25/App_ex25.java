package ex25;

import java.util.Scanner;

/*
    Completed!
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 *
 */

public class App_ex25 {

    public static void main(String[] args) {
        passwordValidator d = new passwordValidator();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = in.next();

        String answer = d.check(password);
        System.out.println(answer);



    }
}
