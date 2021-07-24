package ex28;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 */
//Working
class SumTest {
    Sum x = new Sum();

    @Test
    void fun() {
        Scanner in = new Scanner(System.in);
        int total_sum = 0;
        int hold_num = 0;
        for(int i = 0; i < 5; i++){
            hold_num = (i+ 1);
            total_sum += hold_num;
        }

        assertEquals(15,total_sum);
    }
}