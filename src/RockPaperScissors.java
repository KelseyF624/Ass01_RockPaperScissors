import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        int rock = 0;
        int paper = 1;
        int scissors = 2;
        System.out.println("Welcome to Rock Paper Scissors! Please enter your choice Player A: 0=Rock, 1=Paper or 2=Scissors!");
        Scanner sc = new Scanner(System.in);
        int playerAChoice = sc.nextInt();
        System.out.println("Player B please enter your choice:");
        int playerBChoice = sc.nextInt();
        if (playerAChoice == playerBChoice) {System.out.println("It's a TIE!");}

    }
}