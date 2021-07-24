package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 */
//Working

class isAnagramTest {
    isAnagram x = new isAnagram();
    @Test
    void isAnagram() {
        char [] s1 = {'t', 'o', 'n', 'e'};
        char [] s2 = {'n','o','t','e'};
        int length_1 = s1.length;
        int length_2 = s2.length;

        assertEquals(true,x.isAnagram(s1,s2,length_1,length_2));

    }
}