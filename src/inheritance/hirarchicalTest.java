package inheritance;
class Fatherss{
    void House(){
        System.out.println("Father has own house");
    }
}
class Son1 extends Fatherss{
    void Bike(){
        System.out.println("son1 has one bike");
    }
}
class Son2 extends Fatherss{
    void car() {
        System.out.println("Son2 has own car");
    }
}
public class hirarchicalTest {
    public static void main(String[]args){
        Son1 s1 = new Son1();
        Son2 s2 = new Son2();

        s1.House();
        s1.Bike();
        s2.House();
        s2.car();
    }
}
