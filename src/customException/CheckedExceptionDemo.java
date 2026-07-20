package customException;
import java.util.Scanner;




 class InvalidAgeException extends  Exception{
    private static final long serialVersionUID = 1L;

    public InvalidAgeException(String message){
        super(message);

    }
}
public class CheckedExceptionDemo{
     public static void checkVolterEligibility(int age) throws InvalidAgeException{
         if(age <18){
              throw  new InvalidAgeException("check Exception:you are under 18 age group:"+age);
         }
     }
     public static void main(String[]args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your current age :");
         int age = sc.nextInt();
         try {
             checkVolterEligibility(age);
         } catch (InvalidAgeException e) {
                System.out.println("wrong:"+e.getMessage());
         }finally {
            sc.close();
            System.out.println("commplete proggram....");
         }
     }
 }

