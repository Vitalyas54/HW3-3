public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double payment;
        payment = service.calculate(1_000_000, 9.99, 12);
        System.out.println("Ваш ежемесячный процент по кредиту составляет " + payment + " рублей.");
        payment = service.calculate(1_000_000, 9.99, 24);
        System.out.println("Ваш ежемесячный процент по кредиту составляет " + payment + " рублей.");
        payment = service.calculate(1_000_000, 9.99, 36);
        System.out.println("Ваш ежемесячный процент по кредиту составляет " + payment + " рублей.");
    }
}
