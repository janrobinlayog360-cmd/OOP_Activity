package Bank Account & Savings Account;

public class BankMain {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("123456789", 10000, 5.0);

        savings.displayBalance();
        savings.deposit(2000);
        savings.withdraw(1500);
        savings.addInterest();
        savings.displayBalance();
    }
}
