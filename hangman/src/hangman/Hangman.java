package java_projects.hangman.src.hangman;

import static java_projects.hangman.src.hangman.GameUtils.*;

public class Hangman {
    public static void main(String[] args) throws Exception {
        // Variables used
        String secretPhrase;
        String hiddenPhrase;
        boolean playingGame;

        playingGame = true;

        // Main game loop
        while (playingGame) {
            secretPhrase = getSecret();
            hiddenPhrase = hidePhrase(secretPhrase);
            printGameName();
            
        }

        
        

    }

}
