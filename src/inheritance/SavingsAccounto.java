package inheritance;

public class SavingsAccounto extends BankAccounts{
    private double  interestRate;
    public SavingsAccounto(String AccountNumber,String AccountHolderName,double balance,double interestRate){
        super(AccountNumber,AccountHolderName,balance);
        this.interestRate = interestRate;

    }
    public double calculateYearlyInterest(){
        return getBalance()*interestRate /100;
    }
    @Override
    public void displayAccountInfo(){
        super.displayAccountInfo();
        System.out.println("ब्याज दर: " + interestRate + "%");
        System.out.println("वार्षिक ब्याज रकम: रु. " + calculateYearlyInterest());
        System.out.println("-----------------------------------");

    }
}
