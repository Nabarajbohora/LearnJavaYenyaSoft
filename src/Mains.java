class MissingChar{
String str;
int n;

public String  MissinigChar(String  str, int n){
    String front =  str.substring(0,1);
    String back = str.substring(n+1,str.length());
    return front +back;
}
public void show(){
    String str = "kitten";
    int n = 1;
}
}
public class Mains {
    public static void main(String[] args) {
        MissingChar mc = new MissingChar();
        mc.show();


    }
}
