
import java.util.Scanner;

public class account {

    String accountHolderName;
    String accountNumber;
    static String bankName = "Bank of Baroda";   // static variable
    double balance;

    // Constructor
    account(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        }
    }

    // Display method
    void display() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        account acc = new account(name, accNo, bal);

        System.out.print("Enter Deposit Amount: ");
        double depositAmt = sc.nextDouble();
        acc.deposit(depositAmt);

        System.out.print("Enter Withdraw Amount: ");
        double withdrawAmt = sc.nextDouble();
        acc.withdraw(withdrawAmt);

        acc.display();

        sc.close();
    }
}
