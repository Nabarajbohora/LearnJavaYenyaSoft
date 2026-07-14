package inheritance;

// Parent Class
class BankAccount {

    // Instance variables
    String accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void displayAccountDetails() {
        System.out.println("Account Number      : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Balance             : " + balance);
    }
}

class SavingsAccount extends BankAccount {

    double interestRate;

    SavingsAccount(String accountNumber, String accountHolderName,
                   double balance, double interestRate) {

        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    double calculateYearlyInterest() {
        return (balance * interestRate) / 100;
    }

    // Method to display complete details
    void displayDetails() {

        displayAccountDetails();

        System.out.println("Interest Rate       : " + interestRate + "%");
        System.out.println("Yearly Interest     : " + calculateYearlyInterest());
    }
}

// Main Class
public class SavingsAccountDemo {

    public static void main(String[] args) {

        // Create SavingsAccount object
        SavingsAccount account = new SavingsAccount(
                "AC042393224001",
                "Nabaraj Bohora",
                5000000,
                8.5
        );

        // Display account details
        account.displayDetails();
    }
}