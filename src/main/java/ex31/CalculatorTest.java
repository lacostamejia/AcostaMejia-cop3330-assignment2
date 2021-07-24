package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 */
//Working
class CalculatorTest {

    @Test
    void heartRate() {
        int pulse = 65;
        int age = 22;
        double percentage = (double) 55/100;

        //Checking if the formula works correctly.
        int target = (int) (((220 - age) - pulse) * (percentage)) + pulse;
        assertEquals(138,target);
    }
}