package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
         *  Copyright 2021 Luis Andres Acosta Mejia
         *
         *
         *
         */
//Working
class Standard_DeviationTest {
    Standard_Deviation x = new Standard_Deviation();

    @Test
    void fun() {
        ArrayList<Integer> list_numbers = new ArrayList<Integer>(); //Array list to save all the integers
        list_numbers.add(100);
        list_numbers.add(200);
        list_numbers.add(1000);
        list_numbers.add(300);
        assertEquals(353.5533905932738,x.Fun(list_numbers,400));
    }
}