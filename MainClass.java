package Black_Jack;
// not being used right now  -- import java.util.Scanner;

public class MainClass { 
    public static boolean keep_playing = true; // boolean for while-loop
    public static int wallet = 2500; // players inital amount of money to bet 
    public static void main(String[] args) {
        // will be used for testing as of 03-09-23
        Deck gameDeck = new Deck(52);
        gameDeck.generateDeckInfo();
        gameDeck.printDeckInfo();
    }
}
/*
 * this contains the main method that will be used in 
 * the final run of this game, for now the main
 * will be used to test functions 
 * 
 * Scanner input = new Scanner(System.in);
        int user_input; // will hold menu input, certain values will trigger different operations
        while(keep_playing = true){
            user_input = input.nextInt(); // will hold menu input, certain values will trigger different operations
            // will run game until player chooses to quit the game
            switch(user_input){
                case 1:
                    //option 1 - bet
                    break;
                case 2:
                    //option 2 - hit
                    break;
                case 3:
                    // optin 3 - stand
                    break;
                default: 
                    // print out message of entry being invalid
            }
        }
        input.close();


 */
