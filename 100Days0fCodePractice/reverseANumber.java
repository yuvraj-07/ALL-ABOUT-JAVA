import java.util.Scanner;

public class reverseANumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rem, rev=0, n;

        n = sc.nextInt();

        while(n!=0) {
            rem = n%10;
            rev = rev*10 + rem;
            n= n/10;
        }
        System.out.println(rev);
    }
}
