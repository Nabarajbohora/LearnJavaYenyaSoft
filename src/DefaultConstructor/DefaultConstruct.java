package DefaultConstructor;

public class DefaultConstruct {
    int id ;
    String name;
    DefaultConstruct(){
        System.out.println("Default construct called :");
        id = 1;
        name = "Unknown";
    }
    void display(){
        System.out.println("ID: "+id + "\n Name: "+ name);
    }
    public static void main (String[]args){
        DefaultConstruct nabaraj = new DefaultConstruct();
        nabaraj.display();
    }
}
