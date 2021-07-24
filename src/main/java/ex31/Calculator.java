package ex31;

public class Calculator {
    public void HeartRate(int pulse, int age){
        for(int i = 55; i <= 95; i+= 5){
            double percentage = (double) i/100;
            int target = (int) (((220 - age) - pulse) * (percentage)) + pulse;
            System.out.print(i + "%           | " + target + " bpm");
            System.out.println(" ");
        }
    }
}
