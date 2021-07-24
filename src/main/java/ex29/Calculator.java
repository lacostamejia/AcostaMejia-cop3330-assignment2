package ex29;

import java.util.Scanner;

public class Calculator {

    Scanner in = new Scanner(System.in);

    public int Fun(Boolean d , String rate, int num, int years){

        while (d = true) {
            System.out.print("What is the rate of return? ");
            rate = in.next();

            try {
                num = Integer.parseInt(rate);
            }catch (NumberFormatException ex) {
                d = true;
            }

            if (num == 0) {
                d = true;
                System.out.println("Sorry. That's not a valid input.");
            }
            else{
                break;
            }
        }
        years = (72/num);
        return years;
    }
}
