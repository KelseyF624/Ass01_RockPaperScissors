import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String RPSMove = "";
        String Replay = "R";
        do {
            System.out.println("Welcome to Rock Paper Scissors! Please enter your choice Player A: R, P or S!");
            Scanner sc = new Scanner(System.in);
            String playerAChoice = sc.nextLine();
            System.out.println("Player B please enter your choice:");
            String playerBChoice = sc.nextLine();
            if (playerAChoice == playerBChoice) {
                System.out.println("It's a TIE!");
            } else if (playerAChoice.equals("R")) && playerBChoice.equals("S")) {
                System.out.println("Player A WINS!");
            } else if (playerAChoice.equals("S") && playerBChoice.equals("P")) {
                System.out.println("Player A WINS!");}
            else if (playerAChoice.equals("P") && playerBChoice.equals("R"))
            {System.out.println("Player A WINS!");}
            else if (System.out.println("Player B WINS!");
            System.out.println("Would you like to play again? (Y/N)");
        while (!Replay.equals("Y") && !Replay.equals("N")) {System.out.println("Would you like to play again?");}
    }
}}