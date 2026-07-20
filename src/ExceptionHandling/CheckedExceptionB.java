package ExceptionHandling;

import java.io.*;

public class CheckedExceptionB {
    public static void main(String[]args) {
        try {
            FileReader file = new FileReader("C:/Users/User/OneDrive/Documents/.NetFinalproject");
            BufferedReader FileInput = new BufferedReader(file);
            for (int i = 0; i < 3; i++)
                System.out.println(FileInput.readLine());
        }catch (IOException e){
            System.out.println("File not found"+e);
        }


    }
}
