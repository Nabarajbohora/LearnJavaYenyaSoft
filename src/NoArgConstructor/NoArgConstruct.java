package NoArgConstructor;

public class NoArgConstruct {
    int id;
     String name;
      void display(){
          System.out.println("ID: "+id);
          System.out.println("Name: "+name);
      }
      public static void main(String[]args){
          NoArgConstruct nabaraj = new NoArgConstruct();
                  nabaraj.display();
      }
}
