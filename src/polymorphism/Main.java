package polymorphism;

class Parent{
    void Bike(){
        System.out.println("Father have land proporty");
    }
}
class Child1 extends Parent{
    void Bike(){
        System.out.println("Child1 have a  dirt bike ... ");
    }
}
class Child2 extends Parent{
    void Bike(){
        System.out.println(" child2 have a car");
    }
}

public class Main {
    public static void main (String[]args){
        Parent a;

        a = new Child1();
        a.Bike();
        a = new Child2();
        a.Bike();

    }
}
