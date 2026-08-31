import java.util.Scanner;

public class Vowel_Constant {
    public static void main(String[] args) {
        char check;

        System.out.println("Enter your character to search");
        Scanner sc = new Scanner(System.in);
        check = sc.next().charAt(0);
        check = Character.toLowerCase(check);


        try {
            if (check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u') {
                if(Character.isLetter(check)) {
                    System.out.println("vowel found");
                }

            } else {
                if(Character.isLetter(check)) {
                    System.out.println("Constant found");
                }

            }
        }
        catch(Exception e) {
            System.out.println("Only word should be there no other expression");
        }

    }
}


//learned isletter() use
//learned the use of character
