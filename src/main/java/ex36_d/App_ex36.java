package ex36_d;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/*
Statistics is important in our field. When measuring response times or rendering times,
        it’s helpful to collect data so you can easily spot abnormalities.
        For example, the standard deviation helps you determine which values are outliers and which values are within normal ranges.

        Write a program that prompts for response times from a website in milliseconds.
        It should keep asking for values until the user enters “done.”

        The program should print the average time (mean), the minimum time, the maximum time, and the population standard deviation.

        Use functions called average, max, min, and std, which take in a list of numbers and return the results.
        Use loops and arrays to perform the input and mathematical operations.
        Be sure to exclude the "done" entry from the inputs.
        Be sure to properly ignore any invalid inputs.
        Keep the input separate from the processing and the output.

Enter a number: 100
Enter a number: 200
Enter a number: 1000
Enter a number: 300
Enter a number: done
Numbers: 100, 200, 1000, 300
The average is 400.0
The minimum is 100
The maximum is 1000
The standard deviation is 353.55

*/
public class App_ex36 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList <Integer> list_numbers = new ArrayList<Integer>(); //Array list to save all the integers
        //Then we are going to calculate, and then output

        boolean b = true;
        String number;
        int number_i = 0;
        int total_sum;
        double mean;

        while(b){
            System.out.print("Enter a number: ");
            number = in.next();
            try{
                number_i = Integer.parseInt(number);
                list_numbers.add(number_i); //Adding to the Array list of integers
            }catch (NumberFormatException ex){
                if(number.equals("done")) //This is valid
                {
                    break;
                }
                System.out.println("Error, please type again a number");
            }
        }
        System.out.print("Numbers: ");
        for (int i = 0; i < list_numbers.size(); i++) //Printing values
        {
            System.out.print(list_numbers.get(i) + ", ");
        }

       // mean = Find_Average(list_numbers); //Function created to find the mean
        Double average = list_numbers.stream().mapToInt(val -> val).average().orElse(0.0);
        double std = Find_StandardDeviation(list_numbers,average);

        System.out.printf("\nThe average is %.1f",average);

        System.out.println("\nThe minimum is " + Collections.min(list_numbers));

        System.out.println("The maximum is " + Collections.max(list_numbers));

        System.out.printf("The standard deviation is %.2f",std);
    }
    //Function to find the average.
   /* public static double Find_Average (ArrayList<Integer> list_numbers){
        int sum = 0;

        for(int i = 0; i < list_numbers.size(); i++){
            sum+= list_numbers.get(i);
        }
        return (sum/ list_numbers.size());
    }
    */
    public static double Find_StandardDeviation(ArrayList <Integer> list_numbers, double mean){
        double answer = 0;

        double first = 0;
        double second = 0;

        for(int i = 0; i < list_numbers.size(); i++) {
            first = first + Math.pow(list_numbers.get(i) - mean,2);
        }

        second = first/list_numbers.size();

        answer = Math.sqrt(second);

        return answer;
    }
}
