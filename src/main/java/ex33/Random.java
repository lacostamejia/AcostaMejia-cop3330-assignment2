package ex33;

public class Random {
    public int fun(){
        int random;
        java.util.Random ran = new java.util.Random(); //Getting random number
        random = ran.nextInt(3); //Upperbound is 3 since there are 3 decision.
        return random;
    }
}
