package Black_Jack;
import java.util.Scanner;
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

        // local main variables
        boolean keepPlaying = true;
        Scanner input = new Scanner(System.in);
        int score = 0;
        int gamesWon = 0;
        Deck gameDeck = new Deck(52);
        gameDeck.generateDeckInfo();

        // Introduction
        System.out.println("\n\n\n\tWelcome to Simulated Black Jack \n---------------------------------------------");
        System.out.println("\tLet's get started with the rules... \n");
        rules();
        System.out.println("\nIf at anytime you need a refresher, you will find the rules in the game menu: \n");
        menu(score, gamesWon);
        //may need to change , player should only place bet once
        // player must have two cards in their hands before the round starts.
    }

    // functions 
    public static void rules(){
        System.out.println("\tRules for Black Jack \n---------------------------------------------------");
        System.out.println("Objective: The player must attempt to beat the dealer by getting a count as close to 21 as \n\t  possible, without going over 21.");
        System.out.println("- Player will determine whether the value of \n  the ace is 1 or 11. All other cards will \n  have the value of the cards are their pip value. \n  Kings, Queens, and Jacks will all have a value of 10. ");
        System.out.println("- At the start of each game, the player will place a bet of any value between $2 and $500.");
        System.out.println("- Hit: Hit will allow players to request another card from the deck.\n  If a player has reached a total value in their hand that exceeds 21, the \n round will automatically end.");
        System.out.println("- Split: Split is a special move that will become available if \n the player receieves two cards of the same value in their hand.");
        System.out.println("- Stand: If a player stands, they will no longer have teh ability to draw any more cards. \n The dealer must play their hand until it \n has reached a value close to, exactly, or over 21. \n");
        System.out.println("From there the dealer will compare the values of the hands. \nAnyone that went over 21 will have immediately lost that round.\nWhoever got the closest or the exact value of 21 swill have won the round.  ");
    }
    public static void menu(int points, int won){
        //MENU
        System.out.println("\tBlack Jack \n-----------------------");
        System.out.println("Player Score: " + points + "\nGames won: " + won + "\nWallet: $" + wallet);
        System.out.println("1) Hit");
        System.out.println("2) Stand");
        System.out.println("3) Rules");
        System.out.println("4) Quit");

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


 */
