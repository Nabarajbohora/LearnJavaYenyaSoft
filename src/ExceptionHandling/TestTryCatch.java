package ExceptionHandling;

public class TestTryCatch {
    public static void main(String[] args) {
        try {
            System.out.println("Statement 1: म चल्छु।");

            // यहाँ Exception आउँछ (जस्तै: 10 / 0)
            int result = 10 / 0;
            System.out.println("Statement 2: म चल्छु।"); // यो कहिल्यै पनि प्रिन्ट हुँदैन!

            System.out.println("Statement 3: म पनि चल्छु।"); // यो पनि कहिल्यै प्रिन्ट हुँदैन!

        } catch (ArithmeticException e) {
            System.out.println("Catch ब्लक: गणितीय गल्ती समातियो!");
        }

        System.out.println("Program सकियो।");
    }
}