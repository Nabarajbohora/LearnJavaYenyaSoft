package ExceptionHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HirachicalException {

    public static void writeToFile() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("myFile.text"));
        bw.write("Test");
        bw.close();
    }

    public static void main(String[] args) {
        try {
            HirachicalException.writeToFile();
            System.out.println("File मा 'Test' सफलतापूर्वक लेखियो!");

        } catch (IOException ioe) {
            // Error आएको बाटो (Stack Trace) प्रिन्ट गर्छ
            ioe.printStackTrace();
            System.out.println("केही गडबडी भयो, माथि Error हेर्नुहोस्।");
        }
    }
}