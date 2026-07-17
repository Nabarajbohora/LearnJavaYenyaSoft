package polymorphism;

public class CurrentAccount extends BankAccount {
    private double ServiceCharge;
    public CurrentAccount(String accountHolderName,int accountNumber,double balance,double ServiceCharge){
        super(accountHolderName,accountNumber,balance);
        this.ServiceCharge = ServiceCharge;

    }
public void SetServiceCharge(){
        System.out.println("ServiceCharge"+ServiceCharge);
}

}
