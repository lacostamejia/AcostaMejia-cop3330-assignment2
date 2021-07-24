package ex27_ad;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
The first name must be filled in.
The last name must be filled in.
The first and last names must be at least two characters long.
An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
The ZIP code must be a number.

Enter the first name: J
Enter the last name:
Enter the ZIP code: ABCDE
Enter the employee ID: A12-1234
The first name must be at least 2 characters long.
The last name must be at least 2 characters long.
The last name must be filled in.
The employee ID must be in the format of AA-1234.
The zipcode must be a 5 digit number.

Enter the first name: John //
Enter the last name: Johnson //
Enter the ZIP code: 55555
Enter the employee ID: TK-4321
There were no errors found.

Create a function for each type of validation you need to write.
Then create a validateInput function that takes in all of the input data and invokes the specific validation
functions.
Use a single output statement to display the outputs.
 */
public class App_ex27 {

    public static void main(String[] args) {
        Check x =  new Check();
        Scanner in = new Scanner(System.in);

        //Variables declared
        System.out.print("Enter the first name: ");
        String first_name = in.nextLine();
        System.out.print("Enter the last name: ");
        String last_name = in.nextLine();
        System.out.print("Enter the zip code: ");
        String zipcode = in.next();
        System.out.print("Enter the employee ID: ");
        String employee_id = in.next();

        //Functions called to make checking
        x.isValid(first_name,last_name,zipcode,employee_id);

    }
}
