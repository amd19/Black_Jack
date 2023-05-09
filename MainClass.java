package Black_Jack;
// not being used right now  -- import java.util.Scanner;
import java.util.LinkedList; // will be used ot make delaers hand, player's had and hand if player splits

public class MainClass { 
    public static boolean keep_playing = true; // boolean for while-loop
    public static int wallet = 500; // players inital amount of money to bet 
    LinkedList hand = new LinkedList<Card>();
    LinkedList splitHand = new LinkedList<Card>();
    LinkedList dealerHand = new LinkedList<Card>();
    LinkedList deck = new LinkedList<Card>();
    public static int playerCounter = 0, dealerCounter = 0, pot =0; // hold value of how many cards have been dealt to player, pot holds betting value
    
    public static void main(String[] args) {
        
        // will be used for testing as of 03-09-23
        int score = 0;
        int gamesWon = 0;
        Deck gameDeck = new Deck(52);
        gameDeck.generateDeckInfo();
        printMenu(score, gamesWon);
    }

    // functions 
    public static void printRules(){
        System.out.println("\tRules for Black Jack \n-----------------------------");
        System.out.println("Objective: The player must attempt to beat the dealer \nby getting a count as close to 21 as \n possible, without going over 21.");
        System.out.println("- Player will determine whether the value of \nthe ace is 1 or 11. All other cards will \nhave the value of the cards are their pip value. \n Kings, Queens, and Jacks will all have a value of 10. ");
        System.out.println("- At the start of each game, the player will place a bet of any value between $2 and $500.");
    }
    public static void printMenu(int points, int won){
        //MENU
        System.out.println("\tBlack Jack \n-----------------------");
        System.out.println("Player Score: " + points + "\nGames won: " + won + "\nWallet: " + wallet);
        System.out.println("1) Hit");
        System.out.println("2) Stand");
        System.out.println("3) Rules");

    }
    public static void hit(){
        //will hit
    }
    public static void split(){
        // will hit
    }
    public static void stand(){
        //will stand
    }
    public static void printHand(LinkedList hand){
        //will figure out later?

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
