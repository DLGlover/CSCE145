//Deyshawn Glover

import java.util.Scanner;
import java.util.Random;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Random random = new Random();
        
        boolean playAgain = true;

        while (playAgain) {
            int playerWins = 0;
           
            int computerWins = 0;

            //making where the game would only play a current amount of times
            for (int i = 0; i < 3; i++) 
            {
                System.out.println("What do you choose? Rock, Paper, or Scissors?: ");
               
                String playerChoice = scanner.nextLine();
                
                //Randomizing the computer's choices
                int computerChoiceIndex = random.nextInt(3);
               
                String computerChoice;
                switch (computerChoiceIndex) {
                    case 0: 
                    	computerChoice = "Rock"; 
                    	break;
                    
                    case 1: 
                    	computerChoice = "Paper"; 
                    	break;
                   
                    case 2: 
                    	computerChoice = "Scissors"; 
                    	break;
                   
                    default: computerChoice = ""; // This case will never be hit
                }
                
                System.out.println("Computer chose: " + computerChoice);
                
                if (playerChoice.equalsIgnoreCase(computerChoice)) 
                {
                    System.out.println("It's a tie!");
                } 
                
                //Declaring how the player or the computer wins the game
                else if ((playerChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) ||
                           (playerChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock")) ||
                           (playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper"))) {
                    playerWins++;
                    System.out.println("You win this round!");
                } 
                
                else 
                {
                    computerWins++;
                    System.out.println("Computer wins this round");
                }
                
                System.out.println("Score: You - " + playerWins + ", Computer - " + computerWins);
                System.out.println();
            }
            
            if (playerWins >= 1) 
            {
                System.out.println("You win the game!");
            } 
            
            else if (computerWins >= 1)
            {
                System.out.println("Computer wins the game!");
            }
            
            else if (playerWins == computerWins)
            {
            	System.out.println("The game is a tie!");
            }

            // Ask if the player wants to play again
            System.out.println("Would you like to play again? (yes or no?): ");
          
            String response = scanner.nextLine();
           
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
