public class Main {
    public static void main(String[] args) {
        System.out.println("Bank Name: " + BankAccount.bankName);
        System.out.println("Interest Rate: " + (BankAccount.interestRate * 100) + "%\n");


        BankAccount acc1 = new BankAccount("John Doe", 1000.0);
        BankAccount acc2 = new BankAccount("Jane Smith", 2500.0);
        BankAccount acc3 = new BankAccount("Bob Johnson", 500.0);

        System.out.println("\n=== Account Operations ===");
        acc1.deposit(500.0);  // John Doe deposits
        acc2.withdraw(300.0); // Jane Smith withdraws

        System.out.println("\n=== Interest Calculation ===");
        System.out.printf("John Doe's interest: $%.1f%n", acc1.calculateInterest());
        System.out.printf("Jane Smith's interest: $%.1f%n", acc2.calculateInterest());
        System.out.printf("Bob Johnson's interest: $%.1f%n", acc3.calculateInterest());

        System.out.println("\nTotal Accounts Created: " + BankAccount.totalAccounts);
    }
}
