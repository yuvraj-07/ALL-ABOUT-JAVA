import java.util.Scanner;

public class armStrongNumber {

    public static void main(String[] args) {
        int num;

        int rem;
        int arm=0;
        System.out.println("enter the number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        int original = num;

        while (num>0) {
            rem = num%10;
            arm = (rem*rem*rem)+arm;
            num = num/10;
        }

        if (arm == original) {
            System.out.println("it is a armstrong number");
        }
        else {
            System.out.println("it is not a armstrong number");
        }



    }
}
