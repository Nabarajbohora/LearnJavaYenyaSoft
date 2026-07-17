package inheritanProblemSolve;
class BankAccount{
    protected  String accountHolder;
    protected  double  balance;

    public BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;

    }
    public void deposite(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("जम्मा गरियो: रु. %.2f। नयाँ ब्यालेन्स: रु. %.2f%n", amount, balance);
        } else {
            System.out.println("जम्मा गर्न मिल्ने रकम सकारात्मक हुनुपर्छ।");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("झिकियो: रु. %.2f। बाँकी ब्यालेन्स: रु. %.2f%n", amount, balance);
        } else {
            System.out.println("अपर्याप्त ब्यालेन्स वा अमान्य रकम।");
        }
    }
        public double getBalance() {
            return balance;
    }
}
class CurrentAccount extends BankAccount {
    private double overdraftLimit;
    public CurrentAccount(String accountHolder, double balance, double overdraftLimit) {
        super(accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("झिक्ने रकम सकारात्मक हुनुपर्छ।");
            return;
        }
        double maxWithdrawable = balance + overdraftLimit;
        if (amount <= maxWithdrawable) {
            balance -= amount;
            System.out.printf("झिकियो: रु. %.2f। नयाँ ब्यालेन्स: रु. %.2f%n", amount, balance);
            if (balance < 0) {
                System.out.printf("(नोट: तपाईं ओभरड्राफ्टमा हुनुहुन्छ, बाँकी ऋण: रु. %.2f)%n", -balance);
            }
        } else {
            System.out.printf("झिक्न मिल्दैन। अधिकतम झिक्न सकिने रकम: रु. %.2f (ब्यालेन्स + ओभरड्राफ्ट सीमा)%n", maxWithdrawable);
        }
    }
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== BankAccount (सामान्य खाता) ===");
        BankAccount acc = new BankAccount("राम", 5000);
        acc.deposite(2000);
        acc.withdraw(3000);
        acc.withdraw(5000);

        System.out.println("\n=== CurrentAccount (ओभरड्राफ्ट सुविधा सहित) ===");
        CurrentAccount current = new CurrentAccount("श्याम", 3000, 1500);
        current.deposite(1000);
        current.withdraw(2000);
        current.withdraw(3000);
        current.withdraw(1000);
        current.withdraw(500);
    }
}