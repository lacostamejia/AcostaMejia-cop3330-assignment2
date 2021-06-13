package ex37;
/*
Coming up with a password that meets specific requirements is something your computer can do.
 And it will give you practice using random number generators in conjunction with a list of known values.

Create a program that generates a secure password.
Prompt the user for the minimum length, the number of special characters, and the number of numbers.
 Then generate a password for the user using those inputs.

 What's the minimum length? 8
How many special characters? 2
How many numbers? 2
Your password is aurn2$1s#

Use lists to store the characters you’ll use to generate the passwords.
Ensure that the generated password is random.
Ensure that there are at least as many letters are there are special characters and number.
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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

        int length = r.nextInt(max) + (characters_num + numbers); //Find the total length of the string password
        System.out.println(length);
        StringBuilder password  = new StringBuilder(length); //Creation of string with this length

        for (int i = 0; i < length; i++)
        {
            char c = (char)(r.nextInt(26) + 'a'); //Random letter
            password.append(c);
        }
        System.out.println(password);




    }
}
