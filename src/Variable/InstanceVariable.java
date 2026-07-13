package Variable;

public class InstanceVariable {
    int num; //Instance Variable
    InstanceVariable( int n){
        num = n;
    }
    public void show(){
        System.out.println("The Number is "+num);
    }
    public static void main(String[]args){
    InstanceVariable v = new InstanceVariable(52);
    InstanceVariable v1 = new InstanceVariable(12);
    v.show();
    v1.show();
}

}