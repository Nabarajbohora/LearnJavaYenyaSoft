package inheritance;
public class Main {
    public static void main(String[] args) {
        SavingsAccounto myAccount1 = new SavingsAccounto("HBL-505", "नवराज बोहरा", 60000, 6.0);
        myAccount1.displayAccountInfo();

        SavingsAccounto myAccount2 = new SavingsAccounto("HBL-506", "सुरज थापा", 75000, 5.5);
        myAccount2.displayAccountInfo();

        SavingsAccounto myAccount3 = new SavingsAccounto("HBL-507", "प्रकाश अधिकारी", 120000, 7.2);
        myAccount3.displayAccountInfo();

        SavingsAccounto myAccount4 = new SavingsAccounto("HBL-508", "विशाल राणा", 90000, 4.8);
        myAccount4.displayAccountInfo();

        SavingsAccounto myAccount5 = new SavingsAccounto("HBL-509", "रामप्रसाद कोइराला", 45000, 6.9);
        myAccount5.displayAccountInfo();
    }
}