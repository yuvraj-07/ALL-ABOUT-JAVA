import java.util.Scanner;

public class Evennumber1_n {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            if(i%2==0) {
                System.out.println(i);
            }

        }
        System.out.println("\n");
    }
}
