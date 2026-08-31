import java.util.Random;
import java.util.Scanner;
class rockpaperscissor {
    
    public static void main(String[] args) {
        //ROCK PAPER SCISSOR GAME

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] gamemoves = {"Rock", "Paper", "Scissor"};

        int playerWin = 0;
        int computerWin = 0;
        int ties = 0;
        
        System.out.println("Welcome to rock paper scissor game");

        //main game loop(USER)

        while(true) {
            System.out.println("Select your move [or type exit or quit]: ");
            System.out.println("Enter your chance[rock, paper, scissor]: ");

            String PlayerInput = scanner.nextLine().trim();

            if(PlayerInput.equalsIgnoreCase("exit")) {
                break;
            }

            String playerMove = "";
            if(PlayerInput.equalsIgnoreCase("rock")) playerMove = "Rrock";
            else if(PlayerInput.equalsIgnoreCase("paper")) playerMove = "Paper";
            else if(PlayerInput.equalsIgnoreCase("Scissor")) playerMove = "Scissor";

            else{
                System.out.println("Invalid choice, Try Again");
                continue;
            }

            //Generate computer move
            int computerIndex = random.nextInt(3);
            String ComputerMove = gamemoves[computerIndex];

            System.out.println("Your choice: " + playerMove);
            System.out.println("Computer's choice: " + ComputerMove);

            //determine the winner
            if(playerMove.equals(ComputerMove)) {
                System.out.println("its a tie");
                ties++;
            }
            else if((playerMove.equals("rock") && ComputerMove.equals("Scissors")) || (playerMove.equals("Paper") && ComputerMove.equals("Rock")) || (playerMove.equals("Scissors") && ComputerMove.equals("Paper")) ){
                System.out.println("you win this round");
                playerWin++;
            }

            else {
                System.out.println("computer wins this round");
                computerWin++;
            }

            System.out.printf("Score details-> You: %d | Computer: %d | Ties: %d", playerWin, computerWin, ties);



        }
       scanner.close();
    }
}
