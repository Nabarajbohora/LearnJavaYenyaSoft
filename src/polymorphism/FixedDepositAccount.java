package polymorphism;

public class FixedDepositAccount extends BankAccount {
    private double interestRate;
    private int year;

    public FixedDepositAccount(String accountHolderName,int accountNumber,double balance,double interestRate,int year){
        super(accountHolderName, accountNumber, balance);
        this.interestRate = interestRate;
        this.year = year;
    }
    public void calculateInterest(){
        double interest = (balance*interestRate*year)/100;
        System.out.println("Fixed Deposit Interest : " + interest);
    }
}
