//Joy Ndinda J77-11541-2024 
import java.util.Scanner;

// Parent class BankAccount
class BankAccount {
    double balance;   // account balance

    // Method to deposit money
    public void deposit(double amount) {
        balance = balance + amount;
    }
}

// Child class SavingsAccount inherits from BankAccount
class SavingsAccount extends BankAccount {
    // Method to add 5% interest
    public void addInterest() {
        balance = balance + (balance * 0.05);
    }
}

// Main class to test inheritance
public class BankSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        SavingsAccount account = new SavingsAccount(); // create SavingsAccount object

        System.out.print("Enter deposit amount: ");
        double amount = input.nextDouble();

        account.deposit(amount);   // deposit money
        account.addInterest();     // apply interest

        System.out.println("Final Balance: " + account.balance);
    }
}
