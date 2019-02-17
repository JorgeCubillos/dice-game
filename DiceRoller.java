//Jorge Cubillos
//Week  5 Home
//DiceGame

package diceroller;

import java.util.Scanner;

public class DiceRoller {
    
    //Main Method
    public static void main(String[] args) {
        
    //Variables
    int counter = 0;                        //Counter Variable
    int userDiceSides, computerDiceSides;   //Die Varibles
    int userScore = 0, computerScore = 0;   //Scores
    Scanner scnr = new Scanner(System.in);
    
    //Display Instructions
    System.out.println("This Dice Game will roll a die for the user and \n"
            + "the computer. It will display scores, total the amounts of wins \n"
            + "and declare a winner! \n");
    
    System.out.println("Enter the number of sides for the user's die: ");
    userDiceSides = scnr.nextInt();
    
    System.out.println("Enter the number of sides for the computer's die: ");
    computerDiceSides = scnr.nextInt();
    
    //Create Die Instances
    Die userDice = new Die(userDiceSides);
    Die computerDice = new Die(computerDiceSides);
  
    //Dice Simulation 
    while (counter < 10) {
        //Temp Values
        int temp1 = 0;
        int temp2 = 0;
        System.out.println("Rolling dice....");
        
        temp1 = userDice.getValue();
        temp2 = computerDice.getValue();
        
        if (temp1 == temp2) {
            System.out.println("This round is a tie!");
        }
        else if (temp1 > temp2) {
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
