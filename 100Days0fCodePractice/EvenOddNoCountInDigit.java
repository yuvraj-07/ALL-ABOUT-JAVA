import java.util.Scanner;

public class EvenOddNoCountInDigit {
    public static void main(String[] args) {

        long even=0, odd=0;

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if(n==0) {
            System.out.println("Number should not be negative");
        }

        long AbsN = Math.abs(n);

        while(n>0) {
            int rem = (int)(n%10);
            if (rem%2 == 0) {
                even++;
            }
            else {
                odd++;
            }
            n = n/10;
        }

        System.out.println(even);
        System.out.println(odd);
    }
}

//what i learned
//the importance of digit form 0-9(any number lie in this range whether its infite digit)
//the importance of breaking digit and working on the particular one
