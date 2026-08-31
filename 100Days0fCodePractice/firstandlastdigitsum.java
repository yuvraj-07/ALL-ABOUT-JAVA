import java.util.Scanner;

public class firstandlastdigitsum {
    public static void main(String[] args) {

        int n;

        System.out.println("enter the first number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();


        int lastDigit = n%10;

        int firstDigit = n;
        while(firstDigit > 10) {
            firstDigit/=10;
        }

        int sum = firstDigit+lastDigit;
        System.out.println(sum);

    }
}

//what i learnt
//1. Technique of getting the quotient
