class BankAccount {
    private double balance = 100.0;

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= amount;
            System.out.println("New balance: " + balance);
        }
    }
}
