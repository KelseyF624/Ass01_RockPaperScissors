import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        //rock = 1
        //paper = 2
        //scissors = 3
        int playerAChoice;
        int playerBChoice;
        int replayChoice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Rock Paper Scissors!");
        do {
            do {
                System.out.println("Please enter your choice Player A: 1=Rock, 2=Paper, 3=Scissors!");
                playerAChoice = sc.nextInt();
                if (playerAChoice <= 0) {
                    System.out.println("Please enter a valid choice!");}
                else if (playerAChoice >= 4) {
                    System.out.println("Please enter a valid choice!");}
            } while (playerAChoice <= 0 || playerAChoice >= 4);
            do {
                System.out.println("Player B please enter your choice:");
                playerBChoice = sc.nextInt();
                if (playerBChoice <= 0) {
                    System.out.println("Please enter a valid choice!");}
                else if (playerBChoice >= 4) {
                    System.out.println("Please enter a valid choice!");}
            } while (playerBChoice <= 0 || playerBChoice >= 4);
            System.out.println("Player A picked: " + playerAChoice);
            System.out.println("Player B picked: " + playerBChoice);
            if (playerAChoice == 1 && playerBChoice == 1) {
                System.out.println("Rock vs. Rock! It's a...TIE!");}
            else if (playerAChoice == 2 && playerBChoice == 2) {
                System.out.println("Paper vs. Paper! It's a...TIE!");}
            else if (playerAChoice == 3 && playerBChoice == 3) {
                System.out.println("Scissors vs Scissors! It's a...TIE!");}
            else if (playerAChoice == 2 && playerBChoice == 1) {
                System.out.println("Paper beats Scissors! Player A...WINS!");}
            else if (playerAChoice == 3 && playerBChoice == 2) {
                System.out.println("Scissors beats Paper! Player A...WINS!");}
            else if (playerAChoice == 1 && playerBChoice == 3) {
                System.out.println("Rock beats Scissors! Player A...WINS!");}
            else if (playerAChoice == 1 && playerBChoice == 2) {
                System.out.println("Paper beats Scissors! Player B...WINS!");}
            else if (playerAChoice == 2 && playerBChoice == 3) {
                System.out.println("Scissors beats Paper! Player B...WINS!");}
            else if (playerAChoice == 3 && playerBChoice == 1) {
                System.out.println("Rock beats Scissors! Player B...WINS!");}
            System.out.println("Would you like to play again? (0 to replay. 4 to terminate.)");
            replayChoice = sc.nextInt();
            if (replayChoice== 4) {System.out.println("Thank you for playing!");}
        }while (replayChoice== 0);
    }
}