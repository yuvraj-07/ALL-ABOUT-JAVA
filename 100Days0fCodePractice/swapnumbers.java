import java.util.Scanner;

public class swapnumbers {
    public static void main(String[] args) {
        int num1;
        int num2;
        int temp;

        System.out.println("Enter the first number: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        num2 = sc.nextInt();

        //logic
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping the numbers: "+ num1 + "\t" + num2);
    }
}
