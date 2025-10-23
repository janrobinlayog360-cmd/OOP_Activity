class Account {
    String accountNumber;
    String customerName;
    double balance;

    // Constructor
    public Account(String accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println(customerName + " deposited ₱" + amount);
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(customerName + " withdrew ₱" + amount);
        } else {
            System.out.println("Insufficient balance for " + customerName);
        }
    }

    // Display account info
    public void display() {
        System.out.println("Account No: " + accountNumber + 
                           ", Name: " + customerName + 
                           ", Balance: ₱" + balance);
    }
}