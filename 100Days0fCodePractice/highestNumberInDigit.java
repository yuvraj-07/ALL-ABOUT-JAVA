import java.util.Scanner;

public class highestNumberInDigit {
    public static void main(String[] args) {

        System.out.println("enter the number: ");
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        long ABsN = Math.abs(num);

        if (num == 0) {
            System.out.println("value cannot be zero");
        }

        int minDigit = 9;
        while(num>0) {
            int CurrentDigit = (int)(num%10);
            if (CurrentDigit < minDigit) {
                minDigit = CurrentDigit;
            }

            num = num/10;
        }
        System.out.println("the max number in the digit is: " + minDigit);
    }
}


//what is learnt
//the logic of maxdigit = 0
//the logic of mindigit = 9
//comparing with the max digit and changing the values when condition not satisfied until num >0
