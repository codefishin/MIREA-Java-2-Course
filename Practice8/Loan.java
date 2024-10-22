public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public Loan() {
        this(2.5, 1, 1000);
    }

    /**
     * Создает кредит с указанными: годовой процентной ставкой,
     * количеством лет и суммой кредита
     */
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) throws IllegalArgumentException{
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        if (this.loanAmount <= 0 || this.annualInterestRate <= 0 || this.numberOfYears <= 0) {
            throw new IllegalArgumentException("bruh hell naw");
        }
        loanDate = new java.util.Date();
    }
    public java.util.Date getLoanDate() { return loanDate; }
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        return loanAmount * monthlyInterestRate /
                (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
    }
    public double getTotalPayment() { return getMonthlyPayment() * numberOfYears * 12; }
}
