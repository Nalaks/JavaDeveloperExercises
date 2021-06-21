import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rng = new Random();

        int playerOnePoints = 0;
        int playerTwoPoints = 0;

        System.out.println("2 Players play a dice game, the highest throw wins");
        System.out.println("The winner gets 3 points and 1 point go to each player upon a tie");

        System.out.print("Please put in a name, Player 1: ");
        String playerOne = scanner.nextLine();
        System.out.print("Please put in a name, Player 2: ");
        String playerTwo = scanner.nextLine();

        System.out.println();

        while (true) {

            System.out.println("Players ready your dice and go!");

            int playerOneTrow = rng.nextInt(6) + 1;
            System.out.println(playerOne + " threw a " + playerOneTrow);

            int playerTwoTrow = rng.nextInt(6) + 1;
            System.out.println(playerTwo + " threw a " + playerTwoTrow);

            if (playerOneTrow > playerTwoTrow) {
                System.out.println(playerOne + " wins the round! " + playerOneTrow + " beats " + playerTwoTrow);
                playerOnePoints += 3;
            } else if (playerTwoTrow > playerOneTrow) {
                System.out.println(playerTwo + " wins the round! " + playerTwoTrow + " beats " + playerOneTrow);
                playerTwoPoints += 3;
            } else {
                System.out.println("It's a tie! Both threw the same number.");
                playerOnePoints++;
                playerTwoPoints++;
            }

            System.out.println();
            System.out.println("Play again? (n) to quit");
            String answer = scanner.nextLine();

            if (answer.equals("n")) {
                break;
            }
        }

        System.out.println();

        if (playerTwoPoints < playerOnePoints) {
            System.out.println(playerOne + " has won with " + playerOnePoints + " points.");
        } else if(playerTwoPoints > playerOnePoints) {
            System.out.println(playerTwo + " has won with " + playerTwoPoints + " points.");
        } else {
            System.out.println(playerOne + " and " + playerTwo + " are tied with " + playerOnePoints + " points.");
        }


    }


}

