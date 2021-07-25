package ex38;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EvenCheckerTest {
    EvenChecker x = new EvenChecker();

    @Test
    void fun() {
        //This is used to create a sample to test
        String numbers = "1 2 3 4 5";
        String [] numbers_separate = numbers.split(" ");
        ArrayList<Integer> answer = new ArrayList<Integer>();
        answer = x.Fun(numbers_separate);
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(4);

        //Checking if the output is correct
        assertEquals(expected,answer);

    }
}