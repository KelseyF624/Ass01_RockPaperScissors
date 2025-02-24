import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        String playerAChoice, playerBChoice;
        Scanner sc = new Scanner(System.in);
        boolean validInput = true, playAgain = true;
        System.out.println("Welcome to Rock Paper Scissors!");
        do{
        do {
            validInput = true;
            System.out.println("Player A, please enter your choice: (R, P, S)");
            playerAChoice = sc.nextLine();
            if (playerAChoice.equalsIgnoreCase("R") && (playerAChoice.equalsIgnoreCase("P")) && (playerAChoice.equalsIgnoreCase("S"))) {
                System.out.println("Player A choice confirmed.");}
            if (!playerAChoice.equalsIgnoreCase("R") && (!playerAChoice.equalsIgnoreCase("P")) && (!playerAChoice.equalsIgnoreCase("S"))) {
                validInput = false;
                System.out.println("Invalid player choice. Try again.");}
        } while (!validInput);
        do {
            validInput = true;
            System.out.println("Player B, please enter your choice: (R, P, S)");
            playerBChoice = sc.nextLine();
            if (playerBChoice.equalsIgnoreCase("R") && (playerBChoice.equalsIgnoreCase("P")) && (playerBChoice.equalsIgnoreCase("S"))) {
                System.out.println("Player B choice confirmed.");}
            if (!playerAChoice.equalsIgnoreCase("R") && (!playerAChoice.equalsIgnoreCase("P")) && (!playerAChoice.equalsIgnoreCase("S"))) {
                validInput = false;
                System.out.println("Invalid player choice. Try again.");}
        } while (!validInput);
            if (playerAChoice.equalsIgnoreCase("R") && (playerBChoice.equalsIgnoreCase("R"))) {
                System.out.println("Rock vs. Rock! It's a TIE!");}
            else if (playerAChoice.equalsIgnoreCase("P") && (playerBChoice.equalsIgnoreCase("P"))) {
                System.out.println("Paper vs. Paper! It's a TIE!");}
            else if (playerAChoice.equalsIgnoreCase("S") && (playerBChoice.equalsIgnoreCase("S"))) {
                System.out.println("Scissors vs. Scissors! It's a TIE!");}
            if (playerAChoice.equalsIgnoreCase("S") && (playerBChoice.equalsIgnoreCase("P"))) {
                System.out.println("Scissors cuts Paper! Player A...WINS!");}
            else if (playerAChoice.equalsIgnoreCase("P") && (playerBChoice.equalsIgnoreCase("R"))) {
                System.out.println("Paper covers Rock! Player A...WINS!");}
            else if (playerAChoice.equalsIgnoreCase("R") && (playerBChoice.equalsIgnoreCase("S"))) {
                System.out.println("Rock breaks Scissors! Player A...WINS!");}
            if (playerAChoice.equalsIgnoreCase("P") && (playerBChoice.equalsIgnoreCase("S"))) {
                System.out.println("Scissors cut Paper! Player B...WINS!");}
            else if (playerAChoice.equalsIgnoreCase("R") && (playerBChoice.equalsIgnoreCase("P"))) {
                System.out.println("Paper covers Rock! Player B...WINS!");}
            else if (playerAChoice.equalsIgnoreCase("S") && (playerBChoice.equalsIgnoreCase("R"))) {
                System.out.println("Rock breaks Scissors! Player B...WINS!");}
            System.out.println ("Play again? (Y/N)");
            playAgain = sc.nextLine().equalsIgnoreCase("Y");
        } while (playAgain);
        sc.close();
    }
}