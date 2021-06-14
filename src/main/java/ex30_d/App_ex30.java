package ex30_d;
/*
    Completed!
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 * Yess
 *
 * Create a program that generates a multiplication table for the numbers 1 through 12 (inclusive).
 * Use a nested loop to complete this program.
Align each column within the table without using the tab character.
 */

public class App_ex30 {
    public static void main(String[] args) {

        for(int i = 1; i <= 12; i++){

            for(int j = 1; j<= 12; j++){
                if(Math.multiplyExact(i,j) < 10){
                    System.out.print("  ");
                }
                else if(Math.multiplyExact(i,j) >= 10 && Math.multiplyExact(i,j) < 100){
                    System.out.print(" ");

                }
                System.out.printf("%d ", Math.multiplyExact(i,j));
            }
            System.out.println("");
        }

    }
}
