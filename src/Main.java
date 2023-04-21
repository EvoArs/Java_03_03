public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double credit = 1_000_000; //сумма кредита
        double bet = 9.99; // месячная ставка
        double term = 2; // количество лет
        double payment = service.calculate(bet, credit, term);

        String paymentResult = String.format("%.0f", payment);
        System.out.println("Сумма кредита " + credit + " руб.");
        System.out.println("Процентная ставка " + bet + "% годовых");
        System.out.println("Срок кредита " + term + " г./лет.");
        System.out.println("Ежемесячный платёж составит " + paymentResult + " руб. в месяц.");
    }
}