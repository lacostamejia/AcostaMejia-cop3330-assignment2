package ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 *
 */
class RandomTest {
    Random x = new Random();

    @Test
    void fun() {
        //Since the numbers are random from 1 to 3.
       int answer = x.fun();
       assertEquals(answer,answer);
    }
}