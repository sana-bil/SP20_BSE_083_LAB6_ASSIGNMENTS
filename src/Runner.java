public class Runner {
    public static void main(String[] args) {
        SavingAccounts account1 = new SavingAccounts(2000.00);
        SavingAccounts account2 = new SavingAccounts(3000.00);
        SavingAccounts.modifyInterestRate(0.03);
        System.out.println("balance with interest rate 3%");
        System.out.println();

        account1.calculateMonthlyInterest();
        System.out.print("New balance of account 1 after deducting monthly interest  is ");
        account1.newBalance();


        account2.calculateMonthlyInterest();
        System.out.print("new balance is of account 2 after deducting monthly interest is  ");
        account2.newBalance();
        System.out.println();
        SavingAccounts.modifyInterestRate(0.04);
        System.out.println("balance with interest rate 4%");
        System.out.println();

        account1.calculateMonthlyInterest();
        System.out.print("New balance of account 1 is ");
        account1.newBalance();

        account2.calculateMonthlyInterest();
        System.out.print("New balance of account 2 is ");
        account2.newBalance();
    }
}
