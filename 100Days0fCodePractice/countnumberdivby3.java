import java.util.Scanner;

public class countnumberdivby3 {
    public static void main(String[] args) {
        int n;
        int count=0;
        int i;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        n = sc.nextInt();

        for (i=1; i<=n; i++) {
            if(i%3 == 0) {
                count++;

            }

        }
        System.out.println("the total count is: " + count);
    }
}
