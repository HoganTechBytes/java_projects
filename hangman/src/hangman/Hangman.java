package java_projects.hangman.src.hangman;
import static java_projects.hangman.src.hangman.GameUtils.*;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) throws Exception {
        // Variables used
        char playerGuess;
        boolean playingGame;
        boolean gameOver;
        int lives;
        String secretPhrase;
        String hiddenPhrase;
        String newHiddenPhrase;
        String[] answers = {"yes", "y", "no", "n"};
        Scanner scanner = new Scanner(System.in);

        playingGame = true;

        // Main game loop
        while (playingGame) {
            // Reset key variables at the start of each game
            lives = 6;
            secretPhrase = getSecret();
            hiddenPhrase = hidePhrase(secretPhrase);
            gameOver = false;

            printGameName();

            // The play loop
            while (!gameOver) {
                printGallows(lives);
                System.out.println(hiddenPhrase + "                    Lives: " + lives);
                playerGuess = getGuess(scanner);
                newHiddenPhrase = checkGuess(String.valueOf(playerGuess), secretPhrase, hiddenPhrase);

                // Win or Lose conditions
                if (lives == 0 || newHiddenPhrase.equals(secretPhrase)) {
                    if (lives == 0) {
                        System.out.println("Game over! The hidden phrase was: " + secretPhrase);
                    } else if (newHiddenPhrase.equals(secretPhrase)) {
                        System.out.println("Congratulations, you guessed the phrase!: " + secretPhrase);
                    }
                    gameOver = true;
                } else {
                    // Incorrect guess: decrement lives
                    if (newHiddenPhrase.equals(hiddenPhrase)) {
                        lives--;
                        System.out.println("Incorrect guess. You have " + lives + " lives remaining.");
                    }
                    hiddenPhrase = newHiddenPhrase;
                }
            }

            // Ask if the player wants to play again
            playingGame = gameReset(scanner, answers);
        }

        scanner.close();
    }
}
