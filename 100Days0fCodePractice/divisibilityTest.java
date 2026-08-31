import java.util.Scanner;

public class divisibilityTest {
    public static void main(String[] args) {
        int divis;

        Scanner sc = new Scanner(System.in);
        divis = sc.nextInt();

        if(divis%3 == 0 && divis%5 ==0) {
            System.out.println("number is divisible by 3 and 5");
        }
        else {
            System.out.println("not qualified");
        }
    }
}
