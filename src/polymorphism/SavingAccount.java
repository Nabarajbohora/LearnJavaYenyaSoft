package polymorphism;

public class SavingAccount extends BankAccount{
     private double interestRate;
     public SavingAccount(String accountHolderName,int accountNumber,double balance,double interestRate){
     super(accountHolderName,accountNumber,balance);
         this.interestRate = interestRate;
     }
     void calculateInterest(){
         double interest =  balance * interestRate /100;
         System.out.println("Interest = "+interest);
     }


}
