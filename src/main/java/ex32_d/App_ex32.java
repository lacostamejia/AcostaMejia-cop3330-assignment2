package ex32_d;
/*
    Completed!

 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 *
 *
 *
 */


import java.util.Scanner;
import java.util.Random;
public class App_ex32 {

    public static boolean game(int number_to_guess,boolean n){

        Scanner in = new Scanner(System.in);

        boolean d = true;
        boolean x = true;
        boolean p = true;
        String answer;

        String my_guess;
        int my_guess_number = 0;
        int counter = 1;



        System.out.println(number_to_guess);
        System.out.print("I have my number. What's your guess? ");
        while(x) {
            while(p) {
                my_guess = in.next();
                try {
                    my_guess_number = Integer.parseInt(my_guess);
                    p = false;
                } catch (NumberFormatException ex) {
                    System.out.print("Please enter a valid number: ");
                    p = true;
                    counter++;
                }
            }
            if(my_guess_number < number_to_guess){
                System.out.print("Too low. Guess again: ");
                counter++;
            }
            else if (my_guess_number > number_to_guess){
                System.out.print("Too high. Guess again: ");
                counter++;
            }
            else{
                System.out.println("You got it in " + counter + " guesses!");
                x = false;
                System.out.print("Do you want to play again (Y/N) ? ");
                answer = in.next();
                if(answer.equals("Y")){
                    n = true;
                    x = false;
                    p = false;
                }
                if(answer.equals("N")){
                 n = false;
                 x = false;
                 p = false;
                 return false;
                }

            }
            p = true;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random ran = new Random();

        int number_to_guess;
        String difficulty;
        int difficulty_number = 0;

        boolean d = true;
        boolean n = true;


        System.out.println("Let's play Guess the Number!");
        while (n) {
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            while (d) {
                difficulty = in.next();
                try {
                    difficulty_number = Integer.parseInt(difficulty);
                    d = false;
                } catch (NumberFormatException ex) {
                    System.out.println("Please enter a valid number");
                    d = true;
                }
            }

            switch (difficulty_number) {

                case 1:
                    number_to_guess = ran.nextInt(10) + 1;
                   n = game(number_to_guess,n);
                    d = true;

                    break;

                case 2:
                    number_to_guess = ran.nextInt(100) + 1; //The upperbound is 100
                   n = game(number_to_guess,n);
                    d = true;

                    break;

                case 3:
                    number_to_guess = ran.nextInt(1000); //The upperbound is 1000
                     n = game(number_to_guess,n);
                    d = true;

                    break;

                default:
                    System.out.println("The inputted number is not correct");
                    break;
            }

        }
    }
}
