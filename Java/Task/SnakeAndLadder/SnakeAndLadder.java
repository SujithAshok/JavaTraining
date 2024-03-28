import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadder{
    private static final int SIZE = 100;
    private static final int MAX_PLAYERS = 2;

    // Function to generate random number between 1 and 6
    private static int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    // Function to move player position
    private static int movePlayer(int player, int dice, int[] positions) {
        positions[player] += dice;
        if (positions[player] > SIZE)
            positions[player] = SIZE - (positions[player] - SIZE);
        return positions[player];
    }

    // Function to check for snakes and ladders
    private static int checkSnakesAndLadders(int position) {
        switch (position) {
            case 3:  return 20;
            case 15: return 5;
            case 34: return 1;
            case 47: return 19;
            case 65: return 35;
            case 87: return 50;
            case 99: return 2;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        int[] players = new int[MAX_PLAYERS];
        int currentPlayer = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Snakes and Ladders!");

        while (true) {
            System.out.printf("\nPlayer %d's turn. Press 'r' to roll the dice: ", currentPlayer + 1);
            char roll = scanner.next().charAt(0);

            if (roll == 'r') {
                int dice = rollDice();
                System.out.println("You rolled: " + dice);

                players[currentPlayer] = movePlayer(currentPlayer, dice, players);
                int newPosition = checkSnakesAndLadders(players[currentPlayer]);
                if (newPosition != 0) {
                    System.out.println("Encountered a snake or ladder! Moved to position: " + newPosition);
                    players[currentPlayer] = newPosition;
                }

                System.out.println("Player " + (currentPlayer + 1) + " is at position " + (players[currentPlayer] + 1));

                if (players[currentPlayer] == SIZE - 1) {
                    System.out.println("Player " + (currentPlayer + 1) + " wins!");
                    break;
                }

                currentPlayer = (currentPlayer + 1) % MAX_PLAYERS;
            }
        }
    }
}
