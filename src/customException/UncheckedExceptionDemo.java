package customException;

import java.util.Scanner;

class InvalidMarkException extends Exception{
    private static final long searialVersionUID= 1L;
    public InvalidMarkException(String message){
        super(message);
    }

    }
}
public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (input == 0){
            throw new NullPointerException("the number you enter is invalid ");
        }

    }
}
