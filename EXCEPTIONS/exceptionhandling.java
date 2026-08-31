import java.util.Arrays;
import java.util.Scanner;

public class exceptionhandling {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age: ");
        int age = sc.nextInt();

        try{
        checkAge(age);
    }
    catch(Exception e) {
        System.out.println("a problem occured"+e);
    }
    finally{
        System.out.println("It goes continuously");
    }
}

    static void checkAge(int age) throws ageException{
        if (age<18) {
            System.out.println("you are under 18");
        }
        else {
            System.out.println("you are qualified");
            

        }
    }

        
}