package ex27_ad;

import java.util.regex.Pattern;

public class Check {

    public  boolean check_first_name(String first_name){
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

    public String isValid(String first_name, String last_name, String employee_id, String zipcode){

        String answer = "";

        if((!check_first_name(first_name))){

        }
        if(!check_last_name(last_name)){

        }
        if(!check_employee_id(employee_id)){

        }
        if(!(check_zipcode(zipcode))){

        }
        else{
            answer = "\nThere were no errors found.";
        }
        return "Errors";

    }
}
