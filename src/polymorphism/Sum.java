package polymorphism;

public class Sum {
    public int sum(int x, int y ){
        return (x+y);
    }
    public int sum(int x,int y, int z){
        return (x+y+z);
    }
    public double sum(double x,double y){
        return (x+y);
    }
    public String Sum(String FirstName,String SecondName){
        return FirstName+SecondName;
    }

    public static void main(String[]args){
        Sum s = new Sum();
        System.out.println(s.sum(10,20));
        System.out.println(s.sum(10.0,50.0));
        System.out.println(s.sum(10,200,5));
        System.out.println(s.Sum("Nababaraj","Bohorra"));

    }
}
