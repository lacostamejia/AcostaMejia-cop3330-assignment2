package ex38;

import java.util.ArrayList;
/*
    Completed!
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 *
 */
//Working
public class EvenChecker {

    public ArrayList Fun(String [] numbers_separate){
        int number_to_check = 0;
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for(int i = 0; i < numbers_separate.length; i++){

            number_to_check = Integer.parseInt(numbers_separate[i]);

            if(number_to_check % 2 == 0){
                evenNumbers.add(number_to_check);
            }
        }
        return evenNumbers;
    }
}
