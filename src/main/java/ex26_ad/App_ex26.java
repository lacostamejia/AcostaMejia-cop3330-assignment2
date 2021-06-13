package ex26_ad;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 *
 * What is your balance? 5000
What is the APR on the card (as a percent)? 12
What is the monthly payment you can make? 100
It will take you 70 months to pay off this card.
*
* n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
*
* n is the number of months.
i is the daily rate (APR divided by 365).
b is the balance.
p is the monthly payment.
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

        double months = calculator.calculateMonthsUntilPaidOff(b,APR,p);
        System.out.printf("%f",months);

    }
}
