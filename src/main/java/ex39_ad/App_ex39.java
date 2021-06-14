package ex39_ad;
//Store the data using a list of maps.
/*
Key                     Value               Value
Name                | Position          | Separation Date
--------------------|-------------------|----------------
Jacquelyn Jackson   | DBA               |
Jake Jacobson       | Programmer        |
John Johnson        | Manager           | 2016-12-31
Michaela Michaelson | District Manager  | 2015-12-19
Sally Weber         | Web Developer     | 2015-12-18
Tou Xiong           | Software Engineer | 2016-10-05
 */


import java.util.*;

public class App_ex39 {

    public static void main(String[] args) {

        List<Map<String, Object>> listBeforeGroup = new ArrayList<Map<String, Object>>();

        Map<String, Object> m1 = new HashMap<String, Object>();
        m1.put("separation_date"," ");
        m1.put("position", "DBA");
        m1.put("last_name", "Jacobson");
        m1.put("first_name", "Jake");

        Map<String, Object> m2 = new HashMap<String, Object>();
        m2.put("separation_date"," ");
        m2.put("position", "Programmer");
        m2.put("last_name", "Jackson");
        m2.put("first_name", "Jacquelyn");

        Map<String, Object> m3 = new HashMap<String, Object>();
        m3.put("separation_date"," ");
        m3.put("position", "Manager");
        m3.put("last_name", "Johnson");
        m3.put("first_name", "John");

        Map<String, Object> m4 = new HashMap<String, Object>();
        m4.put("separation_date","2015-12-19");
        m4.put("position", "District Manager");
        m4.put("last_name", "Michaelson");
        m4.put("first_name", "Michaela");

        Map<String, Object> m5 = new HashMap<String, Object>();
        m5.put("separation_date","2015-12-18");
        m5.put("position", "Web Developer");
        m5.put("last_name", "Weber");
        m5.put("first_name", "Sally");

        Map<String, Object> m6 = new HashMap<String, Object>();
        m6.put("separation_date","2016-10-05");
        m6.put("position", "Software Engineer");
        m6.put("last_name", "Xiong");
        m6.put("first_name", "Tou");


        listBeforeGroup.add(m1);listBeforeGroup.add(m2);
        listBeforeGroup.add(m3);listBeforeGroup.add(m4);
        listBeforeGroup.add(m5); listBeforeGroup.add(m6);

        System.out.printf("%-20s | %-20s | %-20s\n", "Lastname", "Position", "Seperation Date");
        System.out.printf("%-21s|%-22s|%-21s\n", "-".repeat(21), "-".repeat(22), "-".repeat(21));

       /* for(int i = 0; i < 6; i++){
            System.out.println(listBeforeGroup.get(i));
        }
        */
        System.out.println("");
        for(int i = 0; i < 6; i++){
            List<String> employeeByKey = new ArrayList<>(listBeforeGroup.get(i).keySet());
            Collections.sort(employeeByKey);
        }
        for(int i = 0; i < 6; i++){
            System.out.println(listBeforeGroup.get(i).toString().replace(",", "").replace("{", "").replace("}", "").replace("=","").replace("separation_date"," ").replace("last_name"," ").replace("first_name"," ").replace("position"," ").trim());
        }


    }
}
