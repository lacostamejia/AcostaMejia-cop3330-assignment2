package ex33;

import java.util.List;
import java.util.*;

/*
    Completed!
yess
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 *
 *
 *
 */
public class App_ex33 {
    public static void main(String[] args) {

        Random x = new Random();

        Scanner in = new Scanner(System.in);
        String question;

        int random;

        List<String> list = new ArrayList<String>(); //Creation of the list
        list.add("Yes"); //Adding values to the array list
        list.add("Maybe");
        list.add("Ask again later.");

        System.out.print("What's your question? \n> ");
        question = in.next();

        random = x.fun();

        System.out.println(list.get(random)); //Get a string from the list with the random number.




    }
}
