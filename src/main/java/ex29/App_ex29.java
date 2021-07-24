package ex29;

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

        Calculator x = new Calculator();

        String rate = "";
        int num = 0;
        boolean d = true;
        int years = 0;

        System.out.printf("It will take %d years to double your initial investment.",x.Fun(d,rate,num,years));


    }
}
