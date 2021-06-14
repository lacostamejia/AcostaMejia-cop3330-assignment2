package ex34_d;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    Completed!
yess
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 *
 *
 *
 */

public class App_ex34 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String employee_to_remove;

        List <String> list_employees = new ArrayList<>();
        list_employees.add("John Smith");
        list_employees.add("Jackie Jackson");
        list_employees.add("Chris Jones");
        list_employees.add("Amanda Cullen");
        list_employees.add("Jeremy Goodwin");

        System.out.println("There are " + list_employees.size() + " employees: ");

        for (int i = 0; i < list_employees.size(); i++){ //Printing the array of lists
            System.out.println(list_employees.get(i));
        }
        System.out.println(" ");

        System.out.print("Enter an employee name to remove: ");
        employee_to_remove = in.nextLine();
        System.out.println(" ");

        for(int i = 0; i < list_employees.size(); i++){

            if(list_employees.get(i).equals(employee_to_remove)){ //Checking if is the same employee we are looking to remove
               list_employees.remove(i);
            }
        }

        System.out.println("There are " + list_employees.size() + " employees: ");

        for (int i = 0; i < list_employees.size(); i++){ //Printing the array of lists
            System.out.println(list_employees.get(i));
        }


    }
}
