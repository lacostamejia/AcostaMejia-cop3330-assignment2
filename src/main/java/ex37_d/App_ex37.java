package ex37_d;
/*
    Completed!
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 *
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class App_ex37 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random r = new Random();

        ArrayList <String> characters = new ArrayList<String>(); //Characters to be used.
        characters.add("@");
        characters.add("!");
        characters.add("#");
        characters.add("$");



        System.out.print("What's the minimum length? ");
        int max = in.nextInt();

        System.out.print("How many special characters? ");
        int characters_num = in.nextInt();

        System.out.print("How many numbers? ");
        int numbers = in.nextInt();

        int random =  ThreadLocalRandom.current().nextInt((characters_num + numbers), max);
        System.out.println(random);

        int length = max + random;
        System.out.println(length);

        StringBuilder password  = new StringBuilder(length); //Creation of string with this length

        int n1 = 0;
        int n2 = 0;
        int i = 0;

        while(i != length)
        {
            random = r.nextInt(3);
            if(n1 < characters_num && (length - 4) < i || n2 < numbers && (length - 4) < i){
                if(n2 < numbers && (length - 4) < i){
                    random = 1;
                }
                else{
                    random = 2;
                }
            }

            switch (random){
                case 0:
                    char c = (char)(r.nextInt(26) + 'a'); //Random letter
                    password.append(c);
                    i++;
                break;

                case 1:
                    if(n1 < characters_num) {
                        random = r.nextInt(4);
                        password.append(characters.get(random));
                        n1++;
                        i++;
                    }
                break;

                case 2:
                    if(n2 < numbers){
                        random = r.nextInt(9);
                        password.append(random);
                        n2++;
                        i++;
                    }

                default:
                    break;
            }

        }
        System.out.println(password);




    }
}
