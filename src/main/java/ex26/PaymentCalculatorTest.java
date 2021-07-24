package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Working
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 */
class PaymentCalculatorTest {
    ex26.PaymentCalculator x = new ex26.PaymentCalculator();
    int balance = 5000;
    double APR = 12;
    double monthly = 100;



    //Check this
    @Test
    void calculate() {
        APR = (APR/100); //Percentage
        APR = APR/365; //Daily rate APR

        int answer = (int) Math.ceil(x.calculateMonthsUntilPaidOff(balance,APR,monthly));
        assertEquals(70,answer);
    }
}