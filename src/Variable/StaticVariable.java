package Variable;

public class StaticVariable {
    int num;
    static int count;
    StaticVariable(int n){
        num = n;
        count ++;
    }
    public void show(){
        System.out.println("NUmber is :"+ num);
    }
    public static void main(String[]args){
        StaticVariable sv1 = new StaticVariable(20);
        sv1.show();
        StaticVariable sv2 = new StaticVariable(10);
        sv2.show();
        System.out.println("the total object of the class:"+count);
        System.out.println();
    }
}
