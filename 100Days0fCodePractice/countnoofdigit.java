import java.util.Scanner;

public class countnoofdigit {
    public static void main(String[] args) {
        int n;
        int rev=0;
        int rem;
        int count=0;


        System.out.println("Enter your first number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while(n!=0) {
            rem = n%10;
            rev = rem + rev;
            n = n/10;

            count++;
        }
        System.out.println("the total count of the digit is: " + count);



    }

}
