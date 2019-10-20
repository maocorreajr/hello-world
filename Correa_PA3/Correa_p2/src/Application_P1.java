class SavingsAccount {
    private static double annualInterestRate = 0.0;
    private static double  savingsBalance;

    public SavingsAccount(double amount){
        this.savingsBalance = amount;
    }
    public void calculateMonthlyInterest(){
        double monthlyInterest;
        monthlyInterest = (savingsBalance * (annualInterestRate/100))/12;
        this.savingsBalance += monthlyInterest;
    }
    public static void modifyInterestRate(double newInterest){
        annualInterestRate = newInterest;
    }
    public void displayBalance(){
        System.out.printf("$%.2f", this.savingsBalance);
    }
}

public class Application_P1{
    public static void main(String[] args) {
        int numMonths = 12;
        int i;
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(4.0); // setting interest rate to 4%
        System.out.println("Month \t\t\t    Saver1 \t\t Saver2");

        for(i = 1; i <= numMonths; ++i){
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.print("Month " + i + " Balance: \t");
            saver1.displayBalance();
            System.out.print("\t");
            saver2.displayBalance();
            System.out.println();
        }
        System.out.println();
        System.out.println("Setting the Interest Rate to 5%");
        System.out.println();
        SavingsAccount.modifyInterestRate(5.0);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.print("Next month's interest rate: \t");
        saver1.displayBalance();
        System.out.print("\t");
        saver2.displayBalance();
        System.out.println();

    }
}
