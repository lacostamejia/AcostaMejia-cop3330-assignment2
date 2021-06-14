package ex26_d;

/*
    Completed!
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 *
 */

import java.util.*;

public class App_ex26 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PaymentCalculator calculator = new PaymentCalculator(); //Calling the class

        System.out.print("What is your balance? ");
        int b = in.nextInt();

        System.out.print("What is the APR on the card ( as a percent)? ");
        double APR = in.nextInt();

        APR = (APR/100); //Percentage
        APR = APR/365; //Daily rate APR

        System.out.print("What is the monthly payment you can make? ");
        double p = in.nextDouble();

        int months = (int) Math.ceil(calculator.calculateMonthsUntilPaidOff(b,APR,p));
        System.out.printf("It will take you %d months to pay off this card.",months);

    }
}
