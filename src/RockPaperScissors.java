import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        //int rock = 1;
        //int paper = 2;
        //int scissors = 3;
        int playerAChoice;
        int playerBChoice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Welcome to Rock Paper Scissors! Please enter your choice Player A: 1=Rock, 2=Paper, 3=Scissors!");
            do {
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
            if (playerAChoice == playerBChoice) {
                System.out.println("It's a...TIE!");}
            else if (playerAChoice == 2 && playerBChoice == 1) {
                System.out.println("Player A...WINS!");}
            else if (playerAChoice == 3 && playerBChoice == 2) {
                System.out.println("Player A...WINS!");}
            else if (playerAChoice == 1 && playerBChoice == 3) {
                System.out.println("Player A...WINS!");}
            else {
                System.out.println("Player B...WINS!");}
            System.out.println("Would you like to play again? (Y/N)");
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("N")) {
                System.out.println("Thank you for playing!");}
        }while (answer.equalsIgnoreCase("Y")); {System.out.println("Playing again!");}
    }
}