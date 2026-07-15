package inheritance;
class GrandFather {
    void Land() {
        System.out.println("GrandFather has land properties");
    }
}
    class Fathers extends GrandFather {
        void House() {
            System.out.println("Father has own House");
        }
    }

    class Son extends Fathers {
        void Bike() {
            System.out.println("Son has own bike ");
        }

    }

    public class MultileveInheTest {
        public static void main(String[] args) {
            Son s = new Son();
            s.Land();
            s.House();
            s.Bike();



        }
    }
