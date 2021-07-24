package ex24;

import java.util.Scanner;

/*
    Completed!
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 *
 */

public class App_ex24 {

    public static void main(String[] args) {

        isAnagram x = new isAnagram();

        Scanner in = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams:");

        System.out.print("Enter the first string: ");
        String s1 = in.next();

        int length_1 = s1.length();
        char [] ch_1 = new char[length_1];

        for(int i = 0; i < length_1; i++){
            ch_1[i] = s1.charAt(i);
        }

        System.out.print("Enter the second string: ");
        String s2 = in.next();

        int length_2 = s2.length();
        char [] ch_2 = new char[length_2];

        for(int i = 0; i < length_2; i++){
            ch_2[i] = s2.charAt(i);
        }
        if(x.isAnagram(ch_1,ch_2,length_1,length_2)){
            System.out.printf("'%s' and '%s' are anagrams.",s1,s2);

        }

    }
}


