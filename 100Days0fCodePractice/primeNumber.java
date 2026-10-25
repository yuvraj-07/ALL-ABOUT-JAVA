import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {

        int num;
        System.out.println("enter the range where you find the prime numbers: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        boolean isPrime = true;

        if (num==2) {
            System.out.println("it is a prime number");
        }

        int i;
        for (i=2; i<=num; i++) {
            isPrime = true;

            for (int j=2; j<=i/2; j++) {
                if(i%j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }


        }


    }
}
