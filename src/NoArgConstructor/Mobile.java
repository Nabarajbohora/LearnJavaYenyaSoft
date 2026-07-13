package NoArgConstructor;

public class Mobile {
    String Brand;
    int price;
     Mobile(){

         System.out.println("User is not Require any stender but i can make this ");
         Brand = "Realme";
         price = 88000;

     }
     void show(){
         System.out.println("Brand: "+Brand +"\nprice: "+price);
     }
     public static void main(String[]args){
         Mobile mw = new Mobile();
         mw.show();

     }

}
