package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {
    public static void main(String[]args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Entyer your name");
        String name = bfr.readLine();
        System.out.println(name);
    }
}
