package ex38;


/*
    Completed!
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 *
 */
import java.util.ArrayList;
import java.util.Scanner;

public class App_ex38 {
    public static void main(String[] args) {

        EvenChecker x = new EvenChecker();
        ArrayList<Integer> answer = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        String numbers;
        int number_to_check = 0;
        System.out.print("Enter a list of numbers, separated by spaces: ");
        numbers = in.nextLine();


        String [] numbers_separate = numbers.split(" "); //Here we are separating each one in the array.
        System.out.print("The even numbers are");
        answer = x.Fun(numbers_separate); //Calling the method of the class
        for(int i = 0; i < answer.size(); i++){
            System.out.print(" " + answer.get(i));
        }
        System.out.print(".");
    }
}
