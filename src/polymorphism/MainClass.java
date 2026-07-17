package polymorphism;

public class MainClass {
    public static void main(String[]args){
        SavingAccount s = new SavingAccount("Nabaraj bohara",102,5000,8);
        CurrentAccount c = new CurrentAccount("hari thapa", 103,60000,50);
        FixedDepositAccount f = new FixedDepositAccount("Bikalp tharu",9868,50000.0,7,5);
        System.out.println("====Saving Account===");
        s.displayAccount();
        s.calculateInterest();
        System.out.println("===Current Account===");
        c.displayAccount();
        c.SetServiceCharge();
        System.out.println("===FixedDeposit Account ===");
        f.displayAccount();
        f.calculateInterest();

    }
}
