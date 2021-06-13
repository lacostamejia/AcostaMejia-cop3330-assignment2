package ex33_d;

import java.util.List;
import java.util.*;
import java.util.Random;
/*
    Completed!

 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 *
 *
 *
 */
public class App_ex33 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String question;

        int random;

        List<String> list = new ArrayList<String>(); //Creation of the list
        list.add("Yes"); //Adding values to the array list
        list.add("Maybe");
        list.add("Ask again later.");

        System.out.print("What's your question? \n> ");
        question = in.next();

        Random ran = new Random(); //Getting random number
        random = ran.nextInt(3); //Upperbound is 3 since there are 3 decision.

        System.out.println(list.get(random)); //Get a string from the list with the random number.




    }
}
