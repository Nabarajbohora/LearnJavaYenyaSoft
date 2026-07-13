package ParameterizedConstructor;

public class ParameterizedConstruc {
    int id ;
    String name;
    ParameterizedConstruc(int studentId, String studentName){
        System.out.println("parameterized constructor called");
         id = studentId;
         name = studentName;
    }
    void display(){
        System.out.println("ID: " + id +"\nname: "+ name);

    }
    public static void main(String[]args){
        ParameterizedConstruc  nabaraj = new ParameterizedConstruc(3304,"Nabaraj bohara");
        nabaraj.display();
        ParameterizedConstruc heera = new ParameterizedConstruc(103,"Heera Thapa");
        heera.display();
    }
}
