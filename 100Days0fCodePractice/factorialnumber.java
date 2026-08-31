import java.util.Scanner;

public class factorialnumber {
    public static void main(String[] args) {

        int n;
        int fact=1;



        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            fact*=i;
        }
        System.out.println("the factorial of given number is: " + fact);
    }
}
