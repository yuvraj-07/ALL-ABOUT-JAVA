import java.util.Scanner;

public class showdigit {
    public static void main(String[] args) {
        int n;
        int rev=0;
        int rem;


        System.out.println("Enter your first number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while(n!=0) {
            rem = n%10;
            rev = rem + rev;
            n = n/10;

            System.out.println(rem);
        }

    }
    }

        //alternative approach
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int absoluteN = Math.abs(n);
//
//
//        String Numberstr = Integer.toString(absoluteN);
//
//        System.out.println("the digit of the numbers are: ");
//        for (int i=0; i<=Numberstr.length(); i++) {
//            System.out.println(Numberstr.charAt(i));
//        }



