import java.util.Scanner;

public class displayfrom1_n {
    public static void main(String[] args) {
        //natural number form 1 to n
//        int n;
//
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//
//
//        for (int i=1; i<n; i++) {
//            System.out.println(i);
//        }
//    }

        //natural number form 1 to n in reverse order

        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i=n; i>=1; i--) {
            System.out.println(i);
        }


    }
}
