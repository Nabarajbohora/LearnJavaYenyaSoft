package abstraction;

abstract  class Bank {
abstract void getBalance();
}
class BankA extends  Bank {
    @Override
    void getBalance() {
        System.out.println("Balance in BankA:$500000000");
    }
}
    class BankB extends Bank {
        @Override
        void getBalance(){
            System.out.println( "Balance in Bank B :$62134000");
        }
    }
    class BankC extends Bank {
        @Override
        void getBalance(){
            System.out.println("Balance in Bank C:$120000");
        }
    }

public class Main2 {
    public static void main(String[] args) {
        Bank b1 = new BankA();
        Bank b2 = new BankB();
        Bank b3 = new BankC();
        b1.getBalance();
        b2.getBalance();
        b3.getBalance();

    }
}