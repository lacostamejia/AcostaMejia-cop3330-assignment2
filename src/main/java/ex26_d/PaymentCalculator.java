package ex26_d;
//* n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
public class PaymentCalculator {
    public double calculateMonthsUntilPaidOff(int balance, double APR, double monthly_payment){
     double months = 0;
     double internal = Math.log10((1 + (balance/monthly_payment) * (1 - Math.pow((1 + APR),30))));
     double divider = Math.log10(1 + APR);
     double initial = ((-0.03333333));
     months = (initial * internal) / divider;

     return months;
    }
}
