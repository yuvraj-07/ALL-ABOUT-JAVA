import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        boolean isPrime = true;

        if (num==2) {
            System.out.println("itt is a prime number");
        }

        int i;
        for (i=2; i<=num; i++) {
            if (num%2 == 0) {
                isPrime = false;
            }
            isPrime = true;

        }

        if (isPrime) {
            System.out.println(num);
        }


    }
}
