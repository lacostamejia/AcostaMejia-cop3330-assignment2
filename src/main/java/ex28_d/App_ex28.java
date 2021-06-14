package ex28_d;
/*
//Finished working!

Enter a number: 1
Enter a number: 2
Enter a number: 3
Enter a number: 4
Enter a number: 5
The total is 15.

/*
    Completed!
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 *
 */
import java.util.Scanner;

public class App_ex28 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int total_sum = 0;

        int hold_num;

        for(int i = 0; i < 5; i++){

            System.out.print("Enter a number: ");

            hold_num = in.nextInt();

            total_sum += hold_num;
        }

        System.out.printf("The total is %d.",total_sum);
    }
}
