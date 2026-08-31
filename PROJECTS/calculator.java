import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        // Building a static calculator[Support for integer and decimal calculation, Continuous looping, Handling division by zero]

        Scanner sc = new Scanner(System.in);
        String choice1;

        do{

        System.out.println("What you want to perform[+, -, *, /, 1/x]: ");
        System.out.println("NOTE: if you perform dividing by zero then its actually impossible.. so dont try it!!");

    
        String choice = sc.next();


        System.out.println("enter the First operand: ");
        float Input1 = sc.nextInt();

        System.out.println("enter the Second operand: ");
        float Input2 = sc.nextInt();

        
        


        if (choice .equals("+") ) {
            float add = Input1 + Input2;
            System.out.println("the value of your result is: " + add);
        }

        else if (choice .equals("-") ) {
            float sub = Input1 - Input2;
            System.out.println("the value of your result is: " + sub);
        }

        else if (choice .equals("*") ) {
            float mul = Input1 * Input2;
            System.out.println("the value of your result is: " + mul);
        }

        else if (choice .equals("/") ) {
            if (Input2 == 0) {
                System.out.println("I said that its impossible.. cant you understand..");
            }
            else {
            
            float div = Input1 / Input2;
            System.out.println("the value of your result is: " + div);
            }
        }
        else if(choice.equals("1/x")) {
            System.out.println("enter the Special operand for this: ");
            float Input3 = sc.nextInt();
            if (Input3 == 0) {
                System.out.println("nearly impossibe to do.. fk Undefined");
            }
            else {
                float fract = 1/Input3;
                System.out.println("The result is:" + fract);
            }
        }
        

        else {
            System.out.println("invalid output..");
        }

        System.out.println("would you like to perform another calculation[Y/N]: ");
        choice1 = sc.next();

    }while(choice1.equalsIgnoreCase("Y"));

    System.out.println("calculator closed");
    sc.close();
}
}
