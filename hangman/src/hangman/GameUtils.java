package java_projects.hangman.src.hangman;
import java.util.Random; 

public class GameUtils {

    public static void printGameName(){
        System.out.print("\r\n" + //
                        " \r\n" + //
                        "                 /$$   /$$                                                                \r\n" + //
                        "                | $$  | $$                                                                \r\n" + //
                        "                | $$  | $$  /$$$$$$  /$$$$$$$   /$$$$$$  /$$$$$$/$$$$   /$$$$$$  /$$$$$$$ \r\n" + //
                        "                | $$$$$$$$ |____  $$| $$__  $$ /$$__  $$| $$_  $$_  $$ |____  $$| $$__  $$\r\n" + //
                        "                | $$__  $$  /$$$$$$$| $$  \\ $$| $$  \\ $$| $$ \\ $$ \\ $$  /$$$$$$$| $$  \\ $$\r\n" + //
                        "                | $$  | $$ /$$__  $$| $$  | $$| $$  | $$| $$ | $$ | $$ /$$__  $$| $$  | $$\r\n" + //
                        "                | $$  | $$|  $$$$$$$| $$  | $$|  $$$$$$$| $$ | $$ | $$|  $$$$$$$| $$  | $$\r\n" + //
                        "                |__/  |__/ \\_______/|__/  |__/ \\____  $$|__/ |__/ |__/ \\_______/|__/  |__/\r\n" + //
                        "                                               /$$  \\ $$                                  \r\n" + //
                        "                                              |  $$$$$$/                                  \r\n" + //
                        "                                               \\______/                                  \r\n\n\n"
                        );
    }

    public static String getSecret(){
        // Variables used
        String secret;
        int phraseIndex;

        // Create Random object
        Random random = new Random();

        // Phrase array for the game
        String[] phrases = {
            "A diamond in the rough", "A blessing in disguise", "A penny for your thoughts", "A piece of cake",
            "A bird in the hand is worth two in the bush", "An arm and a leg", "Break the ice", "Burn the midnight oil",
            "Bite the bullet", "Call it a day", "Caught between a rock and a hard place", "Close but no cigar",
            "Cutting corners", "Curiosity killed the cat", "Devil's advocate", "Don't count your chickens before they hatch",
            "Don't cry over spilled milk", "Elvis has left the building", "Every cloud has a silver lining", "Fit as a fiddle",
            "Get out of hand", "Go back to the drawing board", "Hit the nail on the head", "Hold your horses",
            "Ignorance is bliss", "In the heat of the moment", "It takes two to tango", "Jump on the bandwagon",
            "Kill two birds with one stone", "Let the cat out of the bag", "Once in a blue moon", "On the ball",
            "Out of the blue", "Over the moon", "Piece of cake", "Rain on your parade", "Raining cats and dogs",
            "Spill the beans", "Steal someone's thunder", "Take it with a grain of salt", "The ball is in your court",
            "The best of both worlds", "The elephant in the room", "The icing on the cake", "Throw caution to the wind",
            "Under the weather", "When pigs fly", "You can't judge a book by its cover", "Your guess is as good as mine",
            "Actions speak louder than words", "Back to square one", "Barking up the wrong tree", "Better late than never",
            "Between a rock and a hard place", "Burning the candle at both ends", "By the skin of your teeth",
            "Caught red-handed", "Costs an arm and a leg", "Cross that bridge when you come to it", "Curiosity killed the cat",
            "Don't bite the hand that feeds you", "Don't put all your eggs in one basket", "Every dog has its day",
            "Go the extra mile", "Haste makes waste", "Hit the sack", "In the same boat", "It's raining cats and dogs",
            "Jump to conclusions", "Let sleeping dogs lie", "Make a long story short", "Miss the boat", "No pain no gain",
            "Off the top of my head", "Once bitten twice shy", "On cloud nine", "Practice makes perfect",
            "Pull the wool over your eyes", "Push the envelope", "Raining cats and dogs", "Rolling in dough",
            "Slow and steady wins the race", "Speak of the devil", "Take it with a pinch of salt", "The ball is in your court",
            "The pot calling the kettle black", "There's no time like the present", "Time flies when you're having fun",
            "Under the weather", "Water under the bridge", "Wear your heart on your sleeve", "You can't have your cake and eat it too",
            "You hit the nail on the head", "You're barking up the wrong tree", "Your guess is as good as mine"
            };

        phraseIndex = random.nextInt(phrases.length);
        secret = phrases[phraseIndex].toLowerCase();


        return secret;
    }

    public static String hidePhrase(String phrase){
        return phrase.replaceAll("[a-z]", "_");
    };

    public static void printGallows(int lives){
        String[] gallowsPics = {
            " +---+\n     |\n     |\n     |\n    ===", 
            " +---+\n O   |\n     |\n     |\n    ===", 
            " +---+\n O   |\n |   |\n     |\n    ===", 
            " +---+\n O   |\n/|   |\n     |\n    ===", 
            " +---+\n O   |\n/|\\  |\n     |\n    ===", 
            " +---+\n O   |\n/|\\  |\n/    |\n    ===", 
            " +---+\n O   |\n/|\\  |\n/ \\  |\n    ==="
        };

        System.out.println(gallowsPics[6 - lives]);
    }

    public static char getGuess(){
        checkGuess(' ');
        return ' ';
    }

    private static char checkGuess(char Guess){
        return ' ';
    }

}
