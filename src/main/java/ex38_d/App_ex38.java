package ex38_d;


/*
    Completed!
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 *
 */
import java.util.Scanner;

public class App_ex38 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String numbers;
        int number_to_check = 0;
        System.out.print("Enter a list of numbers, separated by spaces: ");
        numbers = in.nextLine();


        String [] numbers_separate = numbers.split(" "); //Here we are separating each one in the array.
        System.out.print("The even numbers are");

        for(int i = 0; i < numbers_separate.length; i++){

            number_to_check = Integer.parseInt(numbers_separate[i]);

            if(number_to_check % 2 == 0){
                System.out.printf(" %s",numbers_separate[i]);
            }
        }
        System.out.print(".");
    }
}
