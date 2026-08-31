import java.util.Scanner;

public class EvenOddnumberException {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        try {
            if (num1 <= 0) {
                throw new ArithmeticException("number should not be less than zero");
            }

        else if(num1%2==0) {
            System.out.println("its an even number");

        }
        else {
            System.out.println("its an odd number");
        }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }


    }

}
