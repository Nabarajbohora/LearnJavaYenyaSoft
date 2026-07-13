package Variable;

public class LocalVariable {
    public void show() {
   int num = 100;//local variable
        int num2 = 20;
        int sum = num+num2;
        System.out.println("the number is : " + sum);
    }
    public static void main (String[]args){
        LocalVariable test = new LocalVariable();
        test.show();
    }
}
