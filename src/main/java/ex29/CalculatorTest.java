package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 */
//Working
class CalculatorTest {
    Calculator x = new Calculator();
    Boolean d = true;
    String rate = "4";
    int num = 0;
    int years = 0;

    @Test
    void fun() {
        while (d = true) {
            try {
                num = Integer.parseInt(rate);
            }catch (NumberFormatException ex) {
                d = true;
            }

            if (num == 0) {
                d = true;
                System.out.println("Sorry. That's not a valid input.");
            }
            else{
                break;
            }
        }
        years = (72/num);
        assertEquals(18,years);

    }
}