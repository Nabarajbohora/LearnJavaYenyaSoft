package abstraction;

abstract class Parent {
    abstract void message();
}
class FirstSubClass extends Parent {
@Override
    void message() {
        System.out.println("this is First subclass ");

    }
}
class SecondSubClass extends Parent {
    @Override
    void message() {
        System.out.println("this is Second subclass ");
    }
}
public class Main {
    public static void main(String[] args) {

        Parent p1 = new FirstSubClass();
        p1.message();
        Parent p2 = new SecondSubClass();
        p2.message();
        }
    }

