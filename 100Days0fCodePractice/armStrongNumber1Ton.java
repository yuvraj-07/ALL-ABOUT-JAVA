import java.util.Scanner;

public class armStrongNumber1Ton {
    public static void main(String[] args) {
        int i;
        int N;

        System.out.println("enter the number: ");
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        System.out.println("the arm strong numbers are: " + N);

        int armstrongCount = 0;
        for (i = 0; i <= N; i++) {
            if (Check_vlaue(i)) {
                System.out.println(i + " ");

                armstrongCount++;
            }
        }

        System.out.println("armstrong count is: " + armstrongCount);
    }


    public static boolean Check_vlaue(int num) {
        int originalNum = num;
        int sum = 0;
        int rem;
        int temp;
        temp = num;

        while (temp>0) {
            rem = temp % 10;
            sum = (rem * rem * rem) + sum;
            temp = temp / 10;
        }

        return sum == originalNum;

    }
}
