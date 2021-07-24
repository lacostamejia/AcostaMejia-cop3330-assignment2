package ex28;

import java.util.Scanner;

public class Sum {
    public int Fun(){
        Scanner in = new Scanner(System.in);

        int total_sum = 0;

        int hold_num;

        for(int i = 0; i < 5; i++){

            System.out.print("Enter a number: ");

            hold_num = in.nextInt();

            total_sum += hold_num;
        }
        return total_sum;
    }
}
