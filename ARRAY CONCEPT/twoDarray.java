import java.util.Scanner;

//we print 2d array form user input 

public class twoDarray {
    public static void main(String[] args) {

        int size = 3;
        System.out.println("How many food items do you want to store?");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        sc.nextLine();

        String[][] mix = new String[size][size];

        System.out.println("Enter the array elements: ");
        for (int i=0; i<mix.length; i++) {
            for (int j=0; j<mix.length; j++) {
                mix[i][j] = sc.nextLine();
            }
        }

        for (int i=0; i<mix.length; i++) {
            for (int j=0; j<mix.length; j++) {
                System.out.println("the final array is: " + mix[i][j]);
            }
        }
            
        
    }
}
