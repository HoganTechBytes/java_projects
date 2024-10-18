package java_projects.hangman.src.hangman;

import static java_projects.hangman.src.hangman.GameUtils.*;

public class Hangman {
    public static void main(String[] args) throws Exception {
        // Variables used
        String secretPhrase;
        String hiddenPhrase;

        printGameName();
        for(int i = 0; i < 10; i++){
            secretPhrase = getSecret();

            System.out.println(secretPhrase);
            System.out.println(hidePhrase(secretPhrase));
        }

    }

}
