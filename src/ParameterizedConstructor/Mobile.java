package ParameterizedConstructor;

public class Mobile {
    String brand;
    int price;
    Mobile(String brands, int prices){
        brand = brands;
        price = prices;
    }
    void show(){
        System.out.println("Brand :"+brand + "\nPrice: "+price);

    }
    public static void main(String[]args){
        // user give the brand and price
        Mobile m1 = new Mobile("ipone", 100000);
                m1.show();
                Mobile m2 = new Mobile("sumsung",50000);
                        m2.show();
    }
}
