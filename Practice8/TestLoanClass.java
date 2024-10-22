import java.util.Scanner;

public class TestLoanClass {
    public static boolean isLeapYear(int year) { return year % 4 == 0; }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Задание 1
        String [] months = {"январь", "февраль", "март", "апрель", "май",
                "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Введите месяц от 1 до 12");
        int arg = 0;
        try {
            arg = input.nextInt();
            arg -= 1;
            if (arg < 0 || arg > 11) {
                throw new ArrayIndexOutOfBoundsException("Недопустимое число");
            } else if (arg == 1) {
                System.out.println("Вы выбрали " + months[arg] + ", месяц в котором " + dom[arg] + " дней. Введите год: ");
                int year = input.nextInt();
                if (isLeapYear(year)) { System.out.println(year + " год является високосным.");}
                else { System.out.println(year + " год является не високосным.");}
            }
            else {
                System.out.println("Месяц: " + months[arg] + "\nКол-во дней: " + dom[arg]);
            }
        } catch (Exception e) {
            System.out.println("Недопустимое число");
            return;
        }
        // Конец задания 1

        // Получить годовую процентную ставку
        System.out.print("Введите годовую процентную ставку, например, 8,25: ");
        double annualInterestRate = input.nextDouble();

        // Получить срок кредита в годах
        System.out.print("Введите срок кредита в годах: ");
        int numberOfYears = input.nextInt();

        // Получить сумму кредита
        System.out.print("Введите сумму кредита в руб., например, 120000,95: ");
        double loanAmount =  input.nextDouble();

        // Создать объект типа Loan
        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        // Отобразить дату взятия, ежемесячный платеж и общую стоимость кредита
        System.out.println("Дата взятия кредита: " + loan.getLoanDate().toString());
        System.out.println("Ежемесячный платеж по кредиту равен "
                + (int)(loan.getMonthlyPayment() * 100) / 100.0 + " руб.");
        System.out.println("Общая стоимость кредита равна "
                + (int)(loan.getTotalPayment() * 100) / 100.0 + " руб.");
    }
}
