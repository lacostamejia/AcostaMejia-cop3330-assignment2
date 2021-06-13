package ex38;

/*
Sometimes input you collect will need to be filtered down.
Data structures and loops can make this process easier.

Create a program that prompts for a list of numbers, separated by spaces.
 Have the program print out a new list containing only the even numbers.

 Enter a list of numbers, separated by spaces: 1 2 3 4 5 6 7 8
The even numbers are 2 4 6 8.
 */
import java.util.Scanner;

public class App_ex38 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String numbers;
        numbers = in.nextLine();
        char [] num = new char[numbers.length()];
        int [ ] num_1 = new int[numbers.length()];

        for(int i = 0; i < numbers.length(); i++){
            num[i] = numbers.charAt(i);
        }
    }
}
