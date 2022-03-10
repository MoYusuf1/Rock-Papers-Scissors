package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int playerScore = 0;
        int computerScore = 0;

        Scanner in = new Scanner(System.in);


        //loop through and keep asking the user to enter a move

        while (true) {

            //gets user input
            System.out.print("\n\nChoose your move. Type rock, paper, or scissors. \nType quit to quit:\t");
            String myMove = in.nextLine();


            //check if the user entered quit
            if(myMove.equals("quit")){
                break;
            }

            //verify that myMove is valid
            if (!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors")) {
                System.out.println("Your move isn't valid.");
            }

            //randomly generate opponents move (0,1,2)
            int rand = (int) (Math.random() * 3);
            String opponentMove = "";
            if (rand == 0) {
                opponentMove = "rock";
            } else if (rand == 1) {
                opponentMove = "paper";
            } else {
                opponentMove = "scissor";
            }
            //prints opponents move
            System.out.println("Opponent threw: " + opponentMove);

            //Calculate if the user won, lost, or tied

            if (myMove.equals(opponentMove)) {
                System.out.println("It was a tie!\nUser:" +playerScore +"\nComputer:" +computerScore);
            } else if (myMove.equals("rock") && opponentMove.equals("scissors") ||
                    myMove.equals("scissors") && opponentMove.equals("paper") ||
                    myMove.equals("paper") && opponentMove.equals("rock")) {
                playerScore =+ 1;
                System.out.println("You won!\nUser:" +playerScore +"\nComputer:" +computerScore);

            } else {
                computerScore += 1;
                System.out.printf("You lose :(\nUser:" +playerScore +"\nComputer:" +computerScore);

            }

        }

        //prints final score
        if(playerScore > computerScore){
            System.out.println("The final score is:\nPlayer:" + playerScore + "\n Computer:" + computerScore);
        }
        System.out.println("Thanks for playing!");
    }
}
