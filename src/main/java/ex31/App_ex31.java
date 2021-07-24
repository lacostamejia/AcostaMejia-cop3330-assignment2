package ex31;
//Working just need to complete the first design of input.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
Don’t hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
Ensure that the heart rate and age are entered as numbers. Don’t allow the user to continue without entering valid inputs.
Display the results in a tabular format.

TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
Intesity from 55% to 95%
 */
public class App_ex31 {

    public static void main(String[] args) throws IOException {
        Calculator x = new Calculator();

        //Scanner in = new Scanner(System.in);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        boolean d = true;
        String pulse = new String();
        int pulse_num = 0;
        String age = new String();
        int age_num = 0;


        while(d) {
            System.out.print("Resting Pulse: ");
            pulse = in.readLine();
            System.out.print("Age: ");
             age = in.readLine();

            try {
               pulse_num = Integer.parseInt(pulse);
                age_num = Integer.parseInt(age);
                d = false;
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a correct number!");
                d = true;
            }
        }
        System.out.println("Resting Pulse: " + pulse_num + "\t\t Age: " + age_num);
        System.out.println("Intensity     |   Rate");
        System.out.println("- - - - - - - | - - - - ");

        //Calling the method of the class
        x.HeartRate(pulse_num,age_num);

    }
}