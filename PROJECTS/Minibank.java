import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Minibank {
    static Scanner sc = new Scanner(System.in);
    private static String pin;

    public static void main(String[] args) {

        double balance = 0;
        boolean isRunning = true;
        boolean isCheckPIN = true;
        int count = 0;
        int choice;

        ArrayList<String> transactionHistory = new ArrayList<>();

        System.out.println("---WELCOME TO THE MINI BANK----");

        while (isCheckPIN) {
            System.out.println("choose you PIN");
            System.out.println("2234\t 3367\t 9890\t 0987");
            pin = sc.nextLine();

            if (pin.equals("2234") || (pin.equals("3367")) || pin.equals("9890") || pin.equals("0987")) {
                isRunning = true;
                isCheckPIN = false;
            } else {
                count++;
                System.out.println("attempt done:" + count);
                int remaining = 3 - count;
                System.out.println("The remaining amount left is:" + remaining);
                if (count == 3) {
                    isCheckPIN = false;
                    isRunning = false;
                    System.out.println("Your account is blocked");
                }

            }

        }

        while (isRunning) {

            System.out.println("WHAT YOU WANT TO GO WITH..");
            System.out.println("1. Show Balance");
            System.out.println("2.Deposite");
            System.out.println("3.Widthdraw");
            System.out.println("4.Do you want to calculate the interest?");
            System.out.println("5. Mini Statement");
            System.out.println("6.EXIT");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    ShowBalance(balance);
                    break;
                case 2:
                    double deposited = deposit();
                    if (deposited > 0) {
                        balance += deposited;
                        transactionHistory.add("Deposit: +$" + String.format("%.2f", deposited));
                    }
                    break;
                case 3:
                    double widthrawal = widthdraw(balance);
                    if (widthrawal > 0) {
                        balance -= widthrawal;
                        transactionHistory.add("Widthdraw: -$" + String.format("%.2f", widthrawal));
                    }

                    break;
                case 4:
                    SimpleInterest(balance);
                    break;
                case 5:
                    MiniStatement(transactionHistory);
                    break;

                case 6:
                    isRunning = false;
                    break;
            }

        }

        sc.close();
    }

    //method showbalance()
    static void ShowBalance(double balance) {

        System.out.printf("Your balance is: %.2f\n", balance);
    }

    //method deposite()
    static double deposit() {
        double amount=0;
        boolean isValidInput = false;
        while (!isValidInput) {
            System.out.println("Enter the amount to be deposited: ");
            try{
                amount = sc.nextDouble();
                isValidInput = true;
            }
            catch(InputMismatchException e) {
                System.out.println("Invalid input please try again!!");
                sc.next();
            }
        }


        if (amount < 0) {
            System.out.println("the amount should not be negative");
            return 0;
        } else {
            return amount;
        }
    }


    //method widthdraw()
    static double widthdraw(double balance) {
        double amount=0;
        boolean isValidWidthrawal = false;



        while(!isValidWidthrawal) {

            //Exception handling applied
            try {
                System.out.println("Enter the amount to be widthdrawn: ");
                amount = sc.nextDouble();
                isValidWidthrawal = true;
            }catch(InputMismatchException c) {
                System.out.println("Invalid widthrawal amount please try again");
                sc.next();
            }
        }

        if (amount > balance) {
            System.out.println("Insufficient balance");
            return 0;

        } else if (amount < 0) {
            System.out.println("amount cant be negative");
            return 0;
        } else {
            return amount;

        }

    }

    //method simpleInterst()
    static double SimpleInterest(double balance) {
        System.out.println("the interest will be calculated based on your current amount present in your bank...");

        double SI;
        double rate = 5;
        double time;

        System.out.println("enter the time or year");
        time = sc.nextInt();

        SI = (balance * rate * time) / 100;
        System.out.println(SI);
        return 0;
    }

    //method ministatement()
    static void MiniStatement(ArrayList<String> history) {

        System.out.println("--MINI STATEMENT--\n");
        if (history.isEmpty()) {
            System.out.println("there is no such transaction is made.");
        }
        else {
            for (String transaction : history) {
                System.out.println(transaction);
            }
        }
        System.out.println("\n");
    }

}
