//Формула аннуитетного платежа:
//Платеж (payment) = Коэффициент * Сумму кредита (credit)
//Коэффициент = (bet * (1 + bet)^N)/((1 + bet)^N)-1)
//МС (bet) - месячная ставка (10/1200, где 10 - процентная ставка)
//N (term)- количество месяцев
public class CreditPaymentService {
    public double calculate(double bet, double credit, double term) {
        // перводим года в месяцы
        double month = term * 12; //24
        // перводим годовой процент в месячный
        double betMonth = bet / 1200; //0.00833
        // возводим в степень bet_m
        double betDegree = Math.pow(1 + betMonth, month);
        // расчитываю коэффициент
        double k = (betMonth * betDegree) / (betDegree - 1);
        // расчитываю платёж
        double payment = credit * k;
        return payment;
    }
}