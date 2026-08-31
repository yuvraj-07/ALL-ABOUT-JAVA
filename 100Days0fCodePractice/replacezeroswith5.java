import java.util.Scanner;

public class replacezeroswith5 {

    public static void main(String[] args) {

        int newNumber = 0;

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if (n == 0) {
            System.out.println("Number should not be negative");
        }

        long AbsN = Math.abs(n);

        int reverseNum=0;
        while (n > 0) {
            int rem = (int)(n % 10);
            n /= 10;
            if (rem != 0) {
                newNumber = newNumber*10+rem;
            }
            else {
                newNumber = newNumber*10+5;
            }
            while(newNumber!=0) {
                rem = newNumber%10;
                reverseNum = newNumber*10+rem;
                newNumber/=10;
            }

        }
        System.out.println(reverseNum);


    }
}

//what i learned
//the importance of digit form 0-9(any number lie in this range whether its infinite digit)
//the importance of breaking digit and working on the particular one


