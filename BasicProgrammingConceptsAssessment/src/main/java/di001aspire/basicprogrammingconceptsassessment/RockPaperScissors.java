package di001aspire.basicprogrammingconceptsassessment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anna
 */
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    
    public static void main(String[] args){
        //declare varibales
        int numberOfRounds;
        String userChoice;
        String computerChoice;
        int computerWins;
        int userWins;
        int draws;
        String playAgain;
        
        //initialise scanner
        Scanner scn = new Scanner(System.in);
        
        //initialise random generation
        Random rng = new Random();
        
        do {
            //get rounds
            System.out.println("How many rounds would you like to play? Please choose 1-10");
            numberOfRounds = scn.nextInt();
            scn.nextLine();

            //validate number of rounds
            if (numberOfRounds < 1 || numberOfRounds > 10) {
                System.out.println("Invalid number of rounds. Exiting program...");
                System.exit(0);

            } else {
                //set win/loss/draw variables to 0
                computerWins = 0;
                userWins = 0;
                draws = 0;

                //start for loop on number of rounds
                for (int i = 0; i < numberOfRounds; i++){
                    boolean userChoiceIsValid;

                    //get user choice 
                    System.out.println("Choose 'rock'/'paper'/'scissors'");
                    userChoice = scn.nextLine();

                    //get computer choice 
                    String[] computerChoiceArray = new String[] {"rock", "paper", "scissors"};
                    int randomIndex = rng.nextInt(computerChoiceArray.length);
                    computerChoice = computerChoiceArray[randomIndex]; 
                    System.out.println("Computer choice: " + computerChoice);

                    switch (userChoice) {
                        case "rock":
                            if (computerChoice == "rock"){
                                System.out.println("Round result: Draw");
                                draws++;
                            }
                            if (computerChoice == "paper"){
                                System.out.println("Round result: Computer Win");
                                computerWins++;
                            }
                            if (computerChoice == "scissors"){
                                System.out.println("Round result: User Win");
                                userWins++;
                            }
                            break;
                        case "paper":
                            if (computerChoice == "rock"){
                                    System.out.println("Round result: User Win");
                                    userWins++;
                            }
                            if (computerChoice == "paper"){
                                System.out.println("Round result: Draw");
                                draws++;
                            }
                            if (computerChoice == "scissors"){
                                System.out.println("Round result: Computer Win");
                                computerWins++;
                            }
                            break;
                        case "scissors":
                            if (computerChoice == "rock"){
                                System.out.println("Round result: Computer Win");
                                computerWins++;
                            }
                            if (computerChoice == "paper"){
                                System.out.println("Round result: User Win");
                                userWins++;
                            }
                            if (computerChoice == "scissors"){
                                System.out.println("Round result: Draw");
                                draws++;
                            }
                            break;
                        //default:
                        //    System.out.println("Please choose 'rock' 'paper' or 'scissors'.");

                    }

                }
                System.out.println("Overall user wins: " + userWins);
                System.out.println("Overall computer wins: " + computerWins);
                System.out.println("Overall draws: " + draws);

                if (userWins > computerWins){
                    System.out.println("Overall winner: User");
                } else if (userWins < computerWins){
                    System.out.println("Overall winner: Computer");
                } else {
                    System.out.println("Overall winner: It's a draw");
                }
                
            }
            
            System.out.println("Would you like to play again? y/n");
            playAgain = scn.nextLine();
            //System.out.println(playAgain);
            } 
        
        while (playAgain.equals("y"));     
    }
    
}    