package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Working
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 */
class passwordValidatorTest {
    passwordValidator x = new passwordValidator();
    String password_veryWeak = "12345";
    String password_weak = "abcdef";
    String password_strong = "abcd123xyz";

    @Test
    void check() {
        String a = x.check(password_veryWeak);
        assertEquals("The password '12345' is a very weak password.",a);

        a = x.check(password_weak);
        assertEquals("The password 'abcdef' is a weak password.",a);

        a = x.check(password_strong);
        assertEquals("The password 'abcd123xyz' is a strong password.",a);



    }
}