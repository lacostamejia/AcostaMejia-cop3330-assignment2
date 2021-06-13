package ex35_d;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
    Completed!

 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 *
 *
 *
 */

public class App_ex35 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        List <String> list_names = new ArrayList<>();

        Random ran = new Random();

        boolean b = true;
        String name;
        int counter = 0;
        int number = 0;

        while (b){

            System.out.print("Enter a name: ");
            name = in.nextLine();
            if(name.isEmpty())
            {
                number = ran.nextInt(counter); //Get the number
                break;
            }

            list_names.add(counter,name); //Adding a name to the array list at the index of counter, which starts at 0
            counter++;
        }
        System.out.printf("The winner is... %s.", list_names.get(number));

    }
}
