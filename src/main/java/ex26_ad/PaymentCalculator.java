package ex26_ad;

public class PaymentCalculator {
    public double calculateMonthsUntilPaidOff(int balance, double APR, double monthly_payment){
     double months = 0;
     double internal = ((1 + (balance/monthly_payment)) * (1 - (Math.pow(1 + APR,30))));
     double first = Math.log((internal));
     double second = Math.log(1 + APR);
     double initial = ((-0.03333333));
     months = (initial * first) / second;

     return months;
    }
}
