package ex29_d;

import java.util.Scanner;

/*
    //Completed!
       Yes
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 *
 */
/*
years = 72 / r
        What is the rate of return? 0
        Sorry. That's not a valid input.
        What is the rate of return? ABC
        Sorry. That's not a valid input.
        What is the rate of return? 4
        It will take 18 years to double your initial investment.

        Don’t allow the user to enter 0.
        Don’t allow non-numeric values.
        Use a loop to trap bad input, so you can ensure that the user enters valid values.
*/
public class App_ex29 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String rate;
        int num = 0;
        boolean d = true;
        int years;

        while (d = true) {
            System.out.print("What is the rate of return? ");
            rate = in.next();

            try {
                 num = Integer.parseInt(rate);
            }catch (NumberFormatException ex) {
                d = true;
            }

            if (num == 0) {
                d = true;
                System.out.println("Sorry. That's not a valid input.");
            }
            else{
                break;
            }
        }
        years = (72/num);
        System.out.printf("It will take %d years to double your initial investment.",years);


    }
}
