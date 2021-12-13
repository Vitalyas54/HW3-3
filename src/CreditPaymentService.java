public class CreditPaymentService {
    public double calculate(int creditSum, double percent, int creditPeriod) {

        double monthlyPercent = percent / 100 / 12;
        double pow = Math.pow((1 + monthlyPercent), creditPeriod);
        double monthlyPayment = creditSum * (monthlyPercent + (monthlyPercent / (pow - 1)));
        monthlyPayment = Math.round((monthlyPayment * 100.0) / 100.0);
        return monthlyPayment;

    }
}
