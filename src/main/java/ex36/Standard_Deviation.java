package ex36;

import java.util.ArrayList;

public class Standard_Deviation {
    public double Fun(ArrayList<Integer> list_numbers, double mean){
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
