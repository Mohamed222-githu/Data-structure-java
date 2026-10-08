public class Loan {{
    public class Loan {
        private double annualInterestRate;
        private int numberOfYears;
        private double loanAmount;
        private Date loanDate;

        // No-argument constructor
        public Loan() {
            annualInterestRate = 2.5;
            numberOfYears = 1;
            loanAmount = 1000;
            loanDate = new Date();
        }

        // Constructor with arguments
        public Loan(double annualInterestRate, int numberOfYears,
                    double loanAmount) {

            this.annualInterestRate = annualInterestRate;
            this.numberOfYears = numberOfYears;
            this.loanAmount = loanAmount;
            loanDate = new Date();
        }

        // Getters
        public double getAnnualInterestRate() {
            return annualInterestRate;
        }

        public int getNumberOfYears() {
            return numberOfYears;
        }

        public double getLoanAmount() {
            return loanAmount;
        }

        public Date getLoanDate() {
            return loanDate;
        }

        // Setters
        public void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
        }

        public void setNumberOfYears(int numberOfYears) {
            this.numberOfYears = numberOfYears;
        }

        public void setLoanAmount(double loanAmount) {
            this.loanAmount = loanAmount;
        }

        // Monthly payment
        public double getMonthlyPayment() {

            double monthlyInterestRate =
                    annualInterestRate / 1200;

            int numberOfPayments =
                    numberOfYears * 12;

            return loanAmount * monthlyInterestRate /
                    (1 - 1 / Math.pow(
                            1 + monthlyInterestRate,
                            numberOfPayments));
        }

        // Total payment
        public double getTotalPayment() {

            return getMonthlyPayment()
                    * numberOfYears * 12;
        }

        // Main method
        public static void main(String[] args) {

            Loan loan = new Loan();

            System.out.println("Loan Information");
            System.out.println("----------------------");

            System.out.println("Annual Interest Rate: "
                    + loan.getAnnualInterestRate() + "%");

            System.out.println("Number of Years: "
                    + loan.getNumberOfYears());

            System.out.println("Loan Amount: $"
                    + loan.getLoanAmount());

            System.out.println("Loan Date: "
                    + loan.getLoanDate());

            System.out.printf("Monthly Payment: $%.2f%n",
                    loan.getMonthlyPayment());

            System.out.printf("Total Payment: $%.2f%n",
                    loan.getTotalPayment());
        }
    }
}
}
