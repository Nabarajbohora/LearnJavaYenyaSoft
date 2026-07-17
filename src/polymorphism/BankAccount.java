package polymorphism;
public class  BankAccount{
   protected String accountHolderName;
   protected int accountNumber;
    protected double balance;
    public BankAccount(String accountHolderName,int accountNumber,double balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void displayAccount() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance : " + balance);
    }
}

