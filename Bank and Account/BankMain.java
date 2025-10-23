public class BankMain {
    public static void main(String[] args) {
   
        bank bankA = new bank();

        // Create accounts
        Account acc1 = new Account("001", "Alice", 1000);
        Account acc2 = new Account("002", "Bob", 2000);

        // Add accounts
        bankA.addAccount(acc1);
        bankA.addAccount(acc2);

        // Perform transactions
        acc1.deposit(500);
        acc2.withdraw(300);

        // Show all accounts
        bankA.showAllAccounts();

        // Remove an account
        bankA.removeAccount(acc1);
        bankA.showAllAccounts();
    }
}
