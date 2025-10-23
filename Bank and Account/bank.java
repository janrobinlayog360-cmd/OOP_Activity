import java.util.ArrayList;
class bank {
    ArrayList<Account> accounts = new ArrayList<>();

    // Add account
    public void addAccount(Account acc) {
        accounts.add(acc);
        System.out.println("Added account for " + acc.customerName);
    }

    // Remove account
    public void removeAccount(Account acc) {
        accounts.remove(acc);
        System.out.println("Removed account for " + acc.customerName);
    }

    // Display all accounts
    public void showAllAccounts() {
        System.out.println("\n--- All Bank Accounts ---");
        for (Account a : accounts) {
            a.display();
        }
    }
}
