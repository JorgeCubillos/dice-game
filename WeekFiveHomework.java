//Jorge Cubillos
//Week  5 Home
//DiceGame

package weekfivehomework;

import java.util.Random;

public class WeekFiveHomework {

    //Dice Roll Method (Returns 
    public static int rollDice() {
    Random rand = new Random(); 
    return rand.nextInt(6) + 1;
    }
    
    //Main Method
    public static void main(String[] args) {
    
    //Variables
    int counter = 0;                        //Counter Variable
    int userDice, computerDice;             //Die Varibles
    int userScore = 0, computerScore = 0;   //Scores
    
    
    //Display Instructions
    System.out.println("This Dice Game will roll a die for the user and \n"
            + "the computer. It will display scores, total the amounts of wins \n"
            + "and declare a winner! \n");
  
    //Dice Simulation 
    while (counter < 10) {
        
        System.out.println("Rolling dice....");
        
        userDice = rollDice();
        computerDice = rollDice();
        
        if (userDice == computerDice) {
            System.out.println("This round is a tie!");
        }
        else if (userDice > computerDice) {
            System.out.println("User wins this round.");
            userScore++;
        }
        else {
            System.out.println("Computer wins this round.");
            computerScore++;
        }
       
        System.out.println("User Score: " + userScore);
        System.out.println("Computer Score: " + computerScore + "\n");
        counter++;
    }
    
    if (userScore == computerScore) {
        System.out.println("It's a tie!");
    }
    else if (userScore > computerScore) {
        System.out.println("User is the winner!");
    }
    else {
        System.out.println("Computer is the winner!");
    }
    
    
    }
    
}
