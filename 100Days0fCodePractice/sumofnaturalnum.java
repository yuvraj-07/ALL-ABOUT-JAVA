import java.util.Scanner;

public class sumofnaturalnum {
    public static void main(String[] args) {
        //sum of natural number

        int n;
        int sum=0;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
