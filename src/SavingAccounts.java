public class SavingAccounts {
    public static double annualInterestRate;
    private double savingsBalance;
    private double balance;

    public SavingAccounts(double b){
        this.savingsBalance=b;
        balance=savingsBalance;
    }
    public double calculateMonthlyInterest(){
        savingsBalance= (savingsBalance*annualInterestRate)/12;
        return savingsBalance;
    }
    public void  newBalance(){
        balance=balance-savingsBalance;
        System.out.println(balance);
    }

    public static double modifyInterestRate(double i){
        annualInterestRate=i;
        return annualInterestRate;
    }
}

