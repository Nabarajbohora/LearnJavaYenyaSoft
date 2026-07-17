package inheritance;

public class BankAccounts {
    // Private fields (encapsulation)
    private String AccountNumber;
    private String AccountHolderName;
    private double balance;

 public BankAccounts(String AccountNumber, String AccountHolderName, double  balance){
     this.AccountNumber = AccountNumber;
     this.AccountHolderName = AccountHolderName;
     this.balance = balance;
 }
 public  double getBalance(){
     return  balance;
    }
    public void displayAccountInfo() {
        System.out.println("खाता नम्बर: " + AccountNumber);
        System.out.println("खाताधनीको नाम: " + AccountHolderName);
        System.out.println("हालको ब्यालेन्स: रु. " + balance);
    }
}


