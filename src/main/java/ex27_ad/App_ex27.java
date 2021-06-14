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

    public static boolean check_first_name(String first_name){
        if(first_name.length() < 2){
            System.out.println("The first name must be at least 2 characters long.");

            return false;
        }
        if(first_name.isEmpty()){
            System.out.println("The first name must be filled in");
            return false;
        }
        return true;
    }
    public static boolean check_last_name(String last_name){

        if(last_name.length() < 2){
            System.out.println("The first name must be at least 2 characters long.");
            return false;
        }
         if(last_name.isEmpty()){ //Check here
             System.out.println("The first name must be filled in");
            return false;
        }
        return true;
    }
    public static boolean check_zipcode(String zipcode){
        try{
            Integer.parseInt(zipcode);
        }catch(NumberFormatException ex){

            System.out.println("The zipcode must be a 5 digit number.");

           /* if(zipcode.length() < 4){
                System.out.println("The zipcode must be a 5 digit number."); //Check here
                return false;
            }
            */
        }
        return true;
    }
    public static boolean check_employee_id(String employee_id){
        Pattern p = Pattern.compile("^\\d{2}-\\d{2}$");  // use a better name, though
        if(p.matcher(employee_id).matches()){
         return true;
        }
        else{
            System.out.println("The employee ID must be in the format of AA-1234.");
            return false;
        }
    }

    public static void isValid(String first_name, String last_name, String employee_id, String zipcode){
        if((!check_first_name(first_name))){

        }
        if(!check_last_name(last_name)){

        }
        if(!check_employee_id(employee_id)){

        }
        if(!(check_zipcode(zipcode))){

        }
        else{
            System.out.println("\nThere were no errors found.");
        }

    }
    public static void main(String[] args) {

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
        isValid(first_name,last_name,zipcode,employee_id);

    }
}
