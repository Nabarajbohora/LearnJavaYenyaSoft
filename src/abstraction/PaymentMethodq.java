package abstraction;
abstract class PaymentMethod{
    abstract void pay();
}
class Esewa extends PaymentMethod{
    @Override
    void pay(){
        System.out.println("Payment by Esewa ");
    }
}
class Khalti extends PaymentMethod{
    @Override
    void pay(){
        System.out.println("Payment with khalti");
    }
}
class ApplicationForm{
    void submit(PaymentMethod payment){
        System.out.println("Application form payment");
        payment.pay();
        System.out.println();
    }
}
class RegistrationForm {

    void submit(PaymentMethod payment) {
        System.out.println("Registration Form Payment");
        payment.pay();
        System.out.println();
    }
}
class ClassExamForm {

    void submit(PaymentMethod payment) {
        System.out.println("Class Exam Form Payment");
        payment.pay();
        System.out.println();
    }
}


public class PaymentMethodq {
    public static void main(String[] args) {

        PaymentMethod esewa = new Esewa();
        PaymentMethod khalti = new Khalti();

        ApplicationForm application = new ApplicationForm();
        RegistrationForm registration = new RegistrationForm();
        ClassExamForm exam = new ClassExamForm();

        application.submit(esewa);

        registration.submit(khalti);

        exam.submit(esewa);
    }
}
