import java.util.Arrays;
import java.util.Scanner;

public class linearsearch {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] num = {1, 2, 3, 4};

        int target;
        System.out.println("Enter your target: ");
        target = sc.nextInt();
        boolean isFound = false;

        for (int i=0; i<num.length; i++) {
            if (target == num[i]) {
                System.out.println("The element found at index" + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("The element is not found in the index");
        }
        
    }
}
