import java.util.Scanner;

public class multipleofgivennumber {
    public static void main(String[] args) {
        int n;
        int m;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of terms: ");
        n = sc.nextInt();

        System.out.println("enter the number: ");
        m = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println((m*i) + " ");
        }
    }
}
