package inheritance;

class Father{
    void show(){
        System.out.println("Father proporty");
    }
}
class Child extends Father{
    void display(){
        System.out.println("child property");
    }
}
public class SingleInheritance {
    public static void main(String[]args){
        Father f = new Father();
        f.show();
        Child c = new Child();
        c.display();
    }
}
