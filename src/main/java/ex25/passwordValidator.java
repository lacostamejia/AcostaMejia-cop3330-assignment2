package ex25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class passwordValidator {
    public String check(String s1) {
        String answer = "";
        int counter = 0; //Count the number of numbers in the string
        int counter_2 = 0; //Count the number of letters in the string
        int counter_3 = 0; //Count the number of special characters in the string.

        //Checking for a very strong password
        //A very strong password contains letters, numbers, and special characters and is at least eight characters.

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9') {
                counter++;
            } else if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z' || s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z') {
                counter_2++;
            }
            Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
            Matcher matcher = pattern.matcher(s1);
            boolean contains = matcher.find();
            //Checking for a very strong password
            if (contains) {
                counter_3 = 1;
            }
        }
        if (counter > 1 && counter_2 > 1 && s1.length() >= 8 && counter_3 == 1) {
            answer = ("The password '" + s1 + "' is a very strong password.");
        }

        //Checking for a strong password
        counter = 0; //Count the number of numbers in the string
        counter_2 = 0; //Count the number of letters in the string
        //A strong password contains letters and at least one number and is at least eight characters.
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9') {
                counter++;
            } else if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z' || s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z') {
                counter_2++;
            }
            //Checking for a very strong password
        }
        if (counter > 1 && counter > 1 && s1.length() >= 8) {
            answer = ("The password '" + s1 + "' is a strong password.");
        }

        //Checking for a weak password - Only letters
        //A weak password contains only letters and is fewer than eight characters.

        if (Pattern.matches("[a-zA-Z]+", s1) && s1.length() < 8) {
            answer = ("The password '" + s1 + "' is a weak password.");
        }

        counter = 0;
        //Checking for only numbers very weak password
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9') {
                counter++;
            }
        }
        if (counter == s1.length() && s1.length() < 8) {
            answer = ("The password '" + s1 + "' is a very weak password.");
        }
        return answer;
    }

}
