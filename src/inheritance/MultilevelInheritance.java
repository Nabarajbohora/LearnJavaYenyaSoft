package inheritance;
class LivingBeing{
    void breathe(){
        System.out.println("I take breath");
    }
}
class Animal2 extends LivingBeing{
    void eat(){
        System.out.println("eat");
    }
}
class Dog extends  Animal2{
    void bark(){
        System.out.println("bark!");
    }
}

public class MultilevelInheritance {
    public static void main(String[]args){
        System.out.println("===MULTILEVEL INHERITANCE====");
        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
        d1.breathe();
        System.out.println("dogs child is access all parent accesss");
    }
}
