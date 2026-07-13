package ParameterizedConstructor;

public class Main {
    String languages;

    Main(String lang){
        languages = lang;
        System.out.println(languages + "Programming languages");
    }

    public static void main (String[]args){
        //Constructor passing by a single value
        Main obj1  = new Main("java");
        Main obj2 = new Main("python");
        Main obj3 = new Main("c++");
        Main obj4 = new Main("JavaScript");

    }
}
