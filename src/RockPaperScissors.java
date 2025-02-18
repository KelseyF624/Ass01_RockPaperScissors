import java.util.Objects;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        //rock = 1
        //paper = 2
        //scissors = 3
        String playerAChoice;
        String playerBChoice;
        String replayChoice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Rock Paper Scissors!");
        do {
            do {
                System.out.println("Please enter your choice Player A: R, P,S.");
                playerAChoice = sc.nextLine();
                if (playerAChoice != null) {
                    System.out.println("Please enter a valid choice!");}
            } while (Objects.equals(playerAChoice, "R")); Objects.equals(playerAChoice, "P"); Objects.equals(playerAChoice, "S");
            do {
                System.out.println("Player B please enter your choice:");
                playerBChoice = sc.nextLine();
                if (playerBChoice != null) {
                    System.out.println("Please enter a valid choice!");}
            } while (Objects.equals(playerBChoice, "R")); Objects.equals(playerBChoice, "P"); Objects.equals(playerBChoice, "S");
            System.out.println("Player A picked: " + playerAChoice);
            System.out.println("Player B picked: " + playerBChoice);
            if (Objects.equals(playerAChoice, "R") && (Objects.equals(playerBChoice, "R"))) {
                System.out.println("Rock vs. Rock! It's a...TIE!");}
            else if (Objects.equals(playerAChoice, "P") && (Objects.equals(playerBChoice, "P"))) {
                System.out.println("Paper vs. Paper! It's a...TIE!");}
            else if (Objects.equals(playerAChoice, "S") && Objects.equals(playerBChoice, "S")) {
                System.out.println("Scissors vs Scissors! It's a...TIE!");}
            else if (Objects.equals(playerAChoice, "P") && Objects.equals(playerBChoice, "S")) {
                System.out.println("Paper beats Scissors! Player A...WINS!");}
            else if (Objects.equals(playerAChoice, "S") && (Objects.equals(playerBChoice, "P"))) {
                System.out.println("Scissors beats Paper! Player A...WINS!");}
            else if (Objects.equals(playerAChoice, "R") && Objects.equals(playerBChoice, "S")) {
                System.out.println("Rock beats Scissors! Player A...WINS!");}
            else if (Objects.equals(playerAChoice, "P")) && Objects.equals(playerBChoice, "S"); {
                System.out.println("Paper beats Scissors! Player B...WINS!");}
            else if (Objects.equals(playerAChoice, "S") && Objects.equals(playerBChoice, "P")) {
                System.out.println("Scissors beats Paper! Player B...WINS!");}
            else if (Objects.equals(playerAChoice, "R") && Objects.equals(playerBChoice, "S")) {
                System.out.println("Rock beats Scissors! Player B...WINS!");}
            System.out.println("Would you like to play again? (Y/N)");
            replayChoice = sc.nextLine();
            if (replayChoice.equals("N")) {System.out.println("Thank you for playing!");}
        }while (replayChoice.equals("Y"));
    }
}